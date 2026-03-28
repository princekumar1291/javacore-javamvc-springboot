package com.akki.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Reference {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
        A obj = (A) context.getBean("a1");
        System.out.println(obj);

        A obj2 = (A) context.getBean("a2");
        System.out.println(obj2.getX());
        System.out.println(obj2.getObj().getY());

        A obj3 = (A) context.getBean("a3");
        System.out.println(obj3);
    }
}
