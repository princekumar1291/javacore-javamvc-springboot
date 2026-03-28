package com.akki.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*No XML*/
public class StereotypeAnnotations {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeannotationconfig.xml");
//        Student student = context.getBean("student", Student.class);  // default object is 'student'
        Student student = context.getBean("s1", Student.class); // for 's1' we need to declare in Student's @Component
        System.out.println(student);
        System.out.println(student.getAddress());
        System.out.println(student.getAddress().getClass().getName());
    }
}
