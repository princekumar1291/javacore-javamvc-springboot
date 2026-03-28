package com.akki.autowiring.using.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autoannotationconfig.xml");
        Emp emp = context.getBean("e1", Emp.class);
        System.out.println(emp);
    }
}
