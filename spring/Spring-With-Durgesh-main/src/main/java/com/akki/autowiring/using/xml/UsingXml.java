package com.akki.autowiring.using.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*3 ways Autowire in XML
* 1. byName
* 2. byType
* 3. constructor*/
public class UsingXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autoxmlconfig.xml");
        Emp emp = context.getBean("e1", Emp.class); // if you don't want to type-cast add this extra parameter
        System.out.println(emp);
    }
}
