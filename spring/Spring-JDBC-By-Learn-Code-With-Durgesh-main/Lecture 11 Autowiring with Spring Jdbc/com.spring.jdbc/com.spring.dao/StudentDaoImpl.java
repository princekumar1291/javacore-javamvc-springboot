package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		
		// insert query with placeholder (?)
        String query="insert into student(id,name,city) values (?,?,?)";
        int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}

	@Override
	public int change(Student student) {
		
		// update query with placeholder(?)
		
		String query="UPDATE student set name=? , city=? where id=?";
		int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}

	@Override
	public int delete(int studentId) {
		// Delete operation
		
		String deleteQuery="DELETE FROM student WHERE id=?";
		int r = this.jdbcTemplate.update(deleteQuery,studentId);
		return r;
	}

	@Override
	public Student getStudent(int studentId) {
		
		// Selecting the single the single object.
		
		String selectQuery="SELECT * FROM student WHERE id=?";
		RowMapper<Student> rowMapper=new RowMapperImpl();
		Student student=this.jdbcTemplate.queryForObject(selectQuery,rowMapper,1);
		
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		// Selecting multiple students.
		
		String selectQuery="SELECT * FROM student";
		List<Student> students=this.jdbcTemplate.query(selectQuery,new RowMapperImpl());
		
		return students;
	}
}




















