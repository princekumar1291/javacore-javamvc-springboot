package com.akki.ciambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAddition {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ciambiguityconfig.xml");
        Addition addition = (Addition) context.getBean("add1");
        addition.doSum();
        /*if Addition(double a, double b) is first it will print double, double else int, int
        now if i add Addition(String a, String b) at last it will run for String, String
        to remove this ambiguity we are using type attribute in .xml file
        we can also change the order of values of a and b by attribute => index
        */
    }
}
