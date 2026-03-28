package com.akki.autowiring.using.annotation;

import org.springframework.beans.factory.annotation.Autowired;
/* @Autowired could be applied on either variable or SETTER injection or CONSTRUCTOR injection*/
public class Emp {

    @Autowired
    private Address address;

    public Emp() {
        super();
    }

//    @Autowired
    /*public Emp(Address address) {
        System.out.println("Inside constructor");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }


//    @Autowired
    public void setAddress(Address address) {
        System.out.println("Inside SETTER method");
        this.address = address;
    }*/

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
