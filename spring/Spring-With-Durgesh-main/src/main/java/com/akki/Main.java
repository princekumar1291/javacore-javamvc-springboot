package com.akki;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//SETTER OR Properties Injection
public class Main {
    public static void main(String[] args) {
        System.out.println("inside main method...");
        ApplicationContext context = new ClassPathXmlApplicationContext("configfile.xml");
        Student student = (Student) context.getBean("student2");
        System.out.println(student);
    }
}