package com.spring.orm.entities.dao;

public class StudentDao {
  private HibernateTemplate hibernateTemplate;

  public int insert(Student student) {
    int result = (Integer) this.hibernateTemplate.save(student);
    return result;
  }

  

}
