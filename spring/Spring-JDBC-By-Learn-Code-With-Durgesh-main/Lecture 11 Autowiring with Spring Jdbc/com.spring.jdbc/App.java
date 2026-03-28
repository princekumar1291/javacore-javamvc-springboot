package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started............." );
        
        
        // Making the JdbcTemplate object.
        ApplicationContext context= new AnnotationConfigApplicationContext(javaConfig.class);
        
		/*
		 * JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
		 * 
		 * 
		 * // insert query with placeholder (?) String
		 * query="insert into student(id,name,city) values (?,?,?)";
		 * 
		 * // fire query int result = template.update(query,11,"Anuprash","Kanpur");
		 * 
		 * System.out.println("Number of record inserted:"+result);
		 */
        
        
		/*
		 * StudentDao studentDao=context.getBean("studentDao", StudentDao.class);
		 * 
		 * Student student=new Student(); student.setId(666); student.setName("John");
		 * student.setCity("Lucknow");
		 * 
		 * int result = studentDao.insert(student);
		 * 
		 * System.out.println("Student added "+result);
		 */
        
        
		/*
		 * StudentDao studentDao=context.getBean("studentDao", StudentDao.class);
		 * 
		 * Student s=new Student(); s.setId(222); s.setName("Anushka");
		 * s.setCity("New York");
		 * 
		 * int r=studentDao.change(s);
		 * 
		 * System.out.println("Rows updated:"+r);
		 */
        
        
        // Delete
        
		/*
		 * StudentDao studentDao=context.getBean("studentDao", StudentDao.class);
		 * Scanner scanner=new Scanner(System.in); System.out.println("Enter the id:");
		 * int id=scanner.nextInt(); int r = studentDao.delete(id);
		 * System.out.println("The no of rows deleted:"+r);
		 */
        
        
        // Selecting one row form the database
        
		/*
		 * StudentDao studentDao=context.getBean("studentDao", StudentDao.class);
		 * 
		 * Student student=studentDao.getStudent(1); System.out.println(student);
		 */
        
        // Selecting the list from the database
        
        StudentDao studentDao=context.getBean("studentDao", StudentDao.class);
        
        List<Student> students=studentDao.getAllStudents();

        for (Student s: students) {
        	System.out.println(s);
        }       
    }
}
