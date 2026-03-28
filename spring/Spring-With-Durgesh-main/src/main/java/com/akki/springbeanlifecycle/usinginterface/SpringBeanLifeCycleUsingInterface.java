package com.akki.springbeanlifecycle.usinginterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanLifeCycleUsingInterface {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("springbeanlifecycleconfigusinginterface.xml");
        context.registerShutdownHook();
        Pepsi pepsi = (Pepsi) context.getBean("p1");
        System.out.println(pepsi);
    }
}
