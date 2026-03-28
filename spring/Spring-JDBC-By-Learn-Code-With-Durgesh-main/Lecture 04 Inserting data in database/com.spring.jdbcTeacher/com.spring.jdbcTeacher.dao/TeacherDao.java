package com.spring.jdbcTeacher.dao;

import com.spring.jdbcTeacher.entities.Teacher;

public interface TeacherDao {
	public int insert(Teacher teacher);
	public int delete(int id);
	public void display();
}
