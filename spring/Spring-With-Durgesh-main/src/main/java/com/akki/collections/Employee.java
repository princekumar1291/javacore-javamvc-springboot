package com.akki.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configcollection.xml");
        Emp emp = (Emp) context.getBean("emp1");
        System.out.println(emp);
        System.out.println(emp.getPhones());    //to view list of phone numbers
        System.out.println(emp.getPhones().getClass().getName());   // to check which list is this? i mean ArrayList, Vector, LinkedList etc.

        Emp anotherEmp = (Emp) context.getBean("emp2");
        System.out.println(anotherEmp);
    }
}
