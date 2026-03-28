package com.akki.beanscope.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonBeanScope {
    public static void main(String[] args) {
        // using Annotations
        ApplicationContext context = new ClassPathXmlApplicationContext("beanscopesingletonconfig.xml");
        Teacher teacher = context.getBean("teacher", Teacher.class);
        Teacher teacher1 = context.getBean("teacher", Teacher.class);
        System.out.println(teacher.hashCode());
        System.out.println(teacher1.hashCode());    // it will provide same hashCode. because, in singleton scope of bean, spring don't create multiple objects. it returns same object everytime.

        // using XML
        ApplicationContext context1 = new ClassPathXmlApplicationContext("beanscopesingletonusingxmlconfig.xml");
        Student student = context1.getBean("s1", Student.class);
        Student student1 = context1.getBean("s1", Student.class);
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
    }
}
