package com.akki.beanscope.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeBeanScope {
    public static void main(String[] args) {
        // using Annotations
        ApplicationContext context1 = new ClassPathXmlApplicationContext("beanscopeprototypeconfig.xml");
        Teacher teacher1 = context1.getBean("teacher", Teacher.class);
        Teacher teacher2 = context1.getBean("teacher", Teacher.class);
        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());       // different hashCode

        // using XML
        ApplicationContext context2 = new ClassPathXmlApplicationContext("beanscopeprototypeusingxmlconfig.xml");
        Student student1 = context2.getBean("s1", Student.class);
        Student student2 = context2.getBean("s1", Student.class);
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
    }
}
