package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
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
        ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
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
        
        StudentDao studentDao=context.getBean("studentDao", StudentDao.class);
        
        Student student=new Student();
        student.setId(999);
        student.setName("Rina");
        student.setCity("Lucknow");
        	
        int result = studentDao.insert(student);
        
        System.out.println("Student added "+result);
        
    }
}
