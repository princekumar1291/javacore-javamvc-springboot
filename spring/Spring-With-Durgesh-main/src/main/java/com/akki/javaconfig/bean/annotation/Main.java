package com.akki.javaconfig.bean.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// not even @Component
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(WithoutComponentAnnotationConfig.class);
        Student student = context.getBean("s", Student.class);
        System.out.println(student);
        student.study();
    }
}
