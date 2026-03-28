package com.akki.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExpressionLanguage {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpELconfig.xml");
        Demo demo = context.getBean("demo", Demo.class);
        System.out.println(demo);
    }
}
