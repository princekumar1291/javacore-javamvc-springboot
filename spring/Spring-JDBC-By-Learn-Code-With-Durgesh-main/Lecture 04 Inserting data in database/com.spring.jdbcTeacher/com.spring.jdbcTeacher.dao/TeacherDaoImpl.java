package com.spring.jdbcTeacher.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbcTeacher.entities.Teacher;

public class TeacherDaoImpl implements TeacherDao {
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	@Override
	public int insert(Teacher teacher) {

		String insertQuery="INSERT INTO Teacher(id, name, subject) VALUES (?,?,?)";
		
		int result=this.jdbcTemplate.update(insertQuery,teacher.getId(),teacher.getName(),teacher.getSubject());
		
		return result;
	}

	@Override
	public int delete(int id) {
		
		String deleteQuery="DELETE FROM Teacher WHERE id=?";

        int result=this.jdbcTemplate.update(deleteQuery,id);
		
		return result;
	}

	@Override
	public void display() {
	    String selectQuery = "SELECT * FROM Teacher";

	    // Using queryForList to fetch and print all records
	    List<Map<String, Object>> results = this.jdbcTemplate.queryForList(selectQuery);

	    // Displaying the records
	    for (Map<String, Object> row : results) {
	        System.out.println("ID: " + row.get("id"));
	        System.out.println("Name: " + row.get("name"));
	        System.out.println("Subject: " + row.get("subject"));
	        System.out.println("-------------------");
	    }
	}

}
