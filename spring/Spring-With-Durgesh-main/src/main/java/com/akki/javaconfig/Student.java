package com.akki.javaconfig;

import org.springframework.stereotype.Component;

@Component("s1")
public class Student {
    public void study() {
        System.out.println("Student is reading a book...");
    }
}
