package com.akki.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("s1")
public class Student {
    @Value("Akash Prajapati")
    private String studentName;
    @Value("Ahmedabad")
    private String city;
    @Value("#{listOfAddresses}")    // SpEL (Spring Expression Language)
    private List<String> address;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                ", address=" + address +
                '}';
    }
}
