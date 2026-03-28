package com.akki.javaconfig.bean.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.akki.javaconfig")  // not required
public class WithoutComponentAnnotationConfig {

    @Bean
    public Samosa getSamosa() {
        return new Samosa();
    }

    @Bean(name = {"student", "s", "s1"})    // we can also provide multiple calling names...
    public Student getStudent() {
        //providing new student object
        return new Student(getSamosa());
    }

}
