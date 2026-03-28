#!/bin/bash

# AWS Jump Server Information Collector
# This script collects detailed information about the jump server infrastructure

echo "=================================="
echo "AWS Jump Server Info Collector"
echo "=================================="
echo ""

# Prompt for AWS profile
read -p "Enter AWS Profile (ackodev/ackoprod/ackodrive/ackolife): " AWS_PROFILE
export AWS_PROFILE
echo "Using profile: $AWS_PROFILE"
echo ""

# Set region
REGION="ap-south-1"
INSTANCE_ID="i-0cabf4f29950b3ee7"
VPC_ENDPOINT_SSM="vpce-0ef4e22500cc9267c"
VPC_ENDPOINT_SSMMSG="vpce-0cb9b213cf912c92e"

# Output file
OUTPUT_FILE="aws-jump-server-details.json"
echo "{" > $OUTPUT_FILE

echo "1. Getting caller identity..."
aws sts get-caller-identity --profile $AWS_PROFILE > temp_identity.json 2>&1
if [ $? -eq 0 ]; then
    echo "  ✓ Successfully retrieved caller identity"
    echo "  \"callerIdentity\": $(cat temp_identity.json)," >> $OUTPUT_FILE
else
    echo "  ✗ Failed to get caller identity. You may need to authenticate."
    echo "  Run: aws-google-auth -p $AWS_PROFILE"
    exit 1
fi

echo ""
echo "2. Getting EC2 instance details..."
aws ec2 describe-instances \
    --instance-ids $INSTANCE_ID \
    --region $REGION \
    --profile $AWS_PROFILE \
    --output json > temp_instance.json 2>&1

if [ $? -eq 0 ]; then
    echo "  ✓ Successfully retrieved instance details"
    echo "  \"instance\": $(cat temp_instance.json)," >> $OUTPUT_FILE
    
    # Extract key information
    echo ""
    echo "  Instance Summary:"
    jq -r '.Reservations[0].Instances[0] | "  - Instance ID: \(.InstanceId)\n  - Instance Type: \(.InstanceType)\n  - State: \(.State.Name)\n  - Private IP: \(.PrivateIpAddress)\n  - VPC ID: \(.VpcId)\n  - Subnet ID: \(.SubnetId)\n  - IAM Role: \(.IamInstanceProfile.Arn)"' temp_instance.json
else
    echo "  ✗ Failed to get instance details"
    echo "  \"instance\": null," >> $OUTPUT_FILE
fi

echo ""
echo "3. Getting VPC Endpoint details (SSM)..."
aws ec2 describe-vpc-endpoints \
    --vpc-endpoint-ids $VPC_ENDPOINT_SSM \
    --region $REGION \
    --profile $AWS_PROFILE \
    --output json > temp_vpc_ssm.json 2>&1

if [ $? -eq 0 ]; then
    echo "  ✓ Successfully retrieved SSM VPC endpoint details"
    echo "  \"vpcEndpointSSM\": $(cat temp_vpc_ssm.json)," >> $OUTPUT_FILE
else
    echo "  ✗ Failed to get SSM VPC endpoint details"
    echo "  \"vpcEndpointSSM\": null," >> $OUTPUT_FILE
fi

echo ""
echo "4. Getting VPC Endpoint details (SSM Messages)..."
aws ec2 describe-vpc-endpoints \
    --vpc-endpoint-ids $VPC_ENDPOINT_SSMMSG \
    --region $REGION \
    --profile $AWS_PROFILE \
    --output json > temp_vpc_ssmmsg.json 2>&1

if [ $? -eq 0 ]; then
    echo "  ✓ Successfully retrieved SSM Messages VPC endpoint details"
    echo "  \"vpcEndpointSSMMessages\": $(cat temp_vpc_ssmmsg.json)," >> $OUTPUT_FILE
else
    echo "  ✗ Failed to get SSM Messages VPC endpoint details"
    echo "  \"vpcEndpointSSMMessages\": null," >> $OUTPUT_FILE
fi

echo ""
echo "5. Getting SSM Instance information..."
aws ssm describe-instance-information \
    --filters "Key=InstanceIds,Values=$INSTANCE_ID" \
    --region $REGION \
    --profile $AWS_PROFILE \
    --output json > temp_ssm_info.json 2>&1

if [ $? -eq 0 ]; then
    echo "  ✓ Successfully retrieved SSM instance information"
    echo "  \"ssmInstanceInfo\": $(cat temp_ssm_info.json)," >> $OUTPUT_FILE
    
    # Extract key SSM information
    echo ""
    echo "  SSM Agent Summary:"
    jq -r '.InstanceInformationList[0] | "  - SSM Agent Version: \(.PingStatus)\n  - Platform: \(.PlatformType) \(.PlatformName) \(.PlatformVersion)\n  - Last Ping: \(.LastPingDateTime)"' temp_ssm_info.json 2>/dev/null || echo "  No SSM data available"
else
    echo "  ✗ Failed to get SSM instance information"
    echo "  \"ssmInstanceInfo\": null," >> $OUTPUT_FILE
fi

echo ""
echo "6. Getting IAM Role details..."
ROLE_NAME=$(aws ec2 describe-instances --instance-ids $INSTANCE_ID --region $REGION --profile $AWS_PROFILE --query 'Reservations[0].Instances[0].IamInstanceProfile.Arn' --output text 2>/dev/null | awk -F'/' '{print $NF}')

if [ ! -z "$ROLE_NAME" ] && [ "$ROLE_NAME" != "None" ]; then
    echo "  Role Name: $ROLE_NAME"
    
    aws iam get-role \
        --role-name $ROLE_NAME \
        --profile $AWS_PROFILE \
        --output json > temp_role.json 2>&1
    
    if [ $? -eq 0 ]; then
        echo "  ✓ Successfully retrieved IAM role details"
        echo "  \"iamRole\": $(cat temp_role.json)," >> $OUTPUT_FILE
    else
        echo "  ✗ Failed to get IAM role details"
        echo "  \"iamRole\": null," >> $OUTPUT_FILE
    fi
    
    echo ""
    echo "7. Getting IAM Role policies..."
    aws iam list-attached-role-policies \
        --role-name $ROLE_NAME \
        --profile $AWS_PROFILE \
        --output json > temp_role_policies.json 2>&1
    
    if [ $? -eq 0 ]; then
        echo "  ✓ Successfully retrieved attached policies"
        echo "  \"attachedPolicies\": $(cat temp_role_policies.json)," >> $OUTPUT_FILE
        
        echo "  Attached Policies:"
        jq -r '.AttachedPolicies[] | "  - \(.PolicyName) (\(.PolicyArn))"' temp_role_policies.json 2>/dev/null
    else
        echo "  ✗ Failed to get attached policies"
        echo "  \"attachedPolicies\": null," >> $OUTPUT_FILE
    fi
    
    echo ""
    echo "8. Getting inline policies..."
    aws iam list-role-policies \
        --role-name $ROLE_NAME \
        --profile $AWS_PROFILE \
        --output json > temp_inline_policies.json 2>&1
    
    if [ $? -eq 0 ]; then
        echo "  ✓ Successfully retrieved inline policies"
        echo "  \"inlinePolicies\": $(cat temp_inline_policies.json)" >> $OUTPUT_FILE
        
        echo "  Inline Policies:"
        jq -r '.PolicyNames[] | "  - \(.)"' temp_inline_policies.json 2>/dev/null || echo "  None"
    else
        echo "  ✗ Failed to get inline policies"
        echo "  \"inlinePolicies\": null" >> $OUTPUT_FILE
    fi
else
    echo "  ✗ No IAM role found"
    echo "  \"iamRole\": null," >> $OUTPUT_FILE
    echo "  \"attachedPolicies\": null," >> $OUTPUT_FILE
    echo "  \"inlinePolicies\": null" >> $OUTPUT_FILE
fi

# Close JSON file
echo "}" >> $OUTPUT_FILE

# Cleanup temp files
rm -f temp_*.json

echo ""
echo "=================================="
echo "✓ Information collection complete!"
echo "=================================="
echo ""
echo "Output saved to: $OUTPUT_FILE"
echo ""
echo "To view formatted output, run:"
echo "  cat $OUTPUT_FILE | jq ."
echo ""
echo "To connect to the jump server:"
echo "  aws ssm start-session --target $INSTANCE_ID --profile $AWS_PROFILE --region $REGION"
