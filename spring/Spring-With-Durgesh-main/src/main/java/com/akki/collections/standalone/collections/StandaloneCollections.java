package com.akki.collections.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandaloneCollections {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standalonecollectionconfig.xml");
        Person person = context.getBean("p1", Person.class);
        System.out.println(person);
        System.out.println(person.getFriends().getClass().getName());   //java.util.linkedList

        System.out.println("=========================================================================================");
        Person person2 = context.getBean("p2", Person.class);
        System.out.println(person2);
        System.out.println(person2.getFeestructure().getClass().getName()); //java.util.HashMap
        System.out.println(person2.getProps().getClass().getName());    //java.util.Properties
    }
}
