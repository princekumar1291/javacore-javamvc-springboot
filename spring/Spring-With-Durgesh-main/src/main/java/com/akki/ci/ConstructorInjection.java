package com.akki.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ciconfig.xml");
        Person person = (Person) context.getBean("person1");
        System.out.println(person);

        Person person1 = (Person) context.getBean("person2");
        System.out.println(person1);
    }
}
