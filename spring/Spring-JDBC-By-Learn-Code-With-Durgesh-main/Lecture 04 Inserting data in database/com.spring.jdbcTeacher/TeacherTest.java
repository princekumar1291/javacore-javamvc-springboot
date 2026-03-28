package com.spring.jdbcTeacher;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.spring.jdbcTeacher.dao.TeacherDao;
import com.spring.jdbcTeacher.entities.Teacher;

public class TeacherTest {

	public static void main(String[] args ) {
		System.out.println("Teacher database started...");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbcTeacher/config.xml");
		
		TeacherDao teacherDao=context.getBean("teacherDao",TeacherDao.class);
		
		Teacher teacher=new Teacher();
		teacher.setId(4);
		teacher.setName("Anubhav");
		teacher.setSubject("Chemistry");
		
		int result=teacherDao.insert(teacher);
		
		System.out.println("The number of record inserted:"+result);
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Printing the whole database:");
		
		teacherDao.display();
		
		System.out.println("Enter the id:");
		int id=scanner.nextInt();
		
		teacherDao.delete(id);
		
		System.out.println("Element with id: "+id+" has been deleted.");
	}
}
