package com.akki.autowiring.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Qualifier {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("qualifierconfig.xml");
        Emp emp = context.getBean("e1", Emp.class);
        System.out.println(emp);
    }
}
