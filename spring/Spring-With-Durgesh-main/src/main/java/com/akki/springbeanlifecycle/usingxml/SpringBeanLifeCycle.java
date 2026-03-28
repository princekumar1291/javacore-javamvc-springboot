package com.akki.springbeanlifecycle.usingxml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanLifeCycle {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("springbeanlifecycleconfig.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("springbeanlifecycleconfig.xml");
        Samosa samosa = (Samosa) context.getBean("s1");
        System.out.println(samosa);
        /* to run destroy() we need to enable registerShutdownHook and that is not in ApplicationContext
        * So, we'll use AbstractApplicationContext */
        context.registerShutdownHook();
    }
}
