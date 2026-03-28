package com.akki.springbeanlifecycle.usingannotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanLifeCycleUsingAnnotation {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("springbeanlifecycleconfigusingannotation.xml");
        context.registerShutdownHook();
        Example example = (Example) context.getBean("e1");
        System.out.println(example);
    }
}
