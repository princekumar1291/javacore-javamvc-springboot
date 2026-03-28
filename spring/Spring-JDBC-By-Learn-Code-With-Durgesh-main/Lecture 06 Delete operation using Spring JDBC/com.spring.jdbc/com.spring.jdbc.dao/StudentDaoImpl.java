package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

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
}
