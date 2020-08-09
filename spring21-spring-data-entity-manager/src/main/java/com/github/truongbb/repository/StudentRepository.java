package com.github.truongbb.repository;

import com.github.truongbb.bean.Student;
import com.github.truongbb.entity.StudentEntity;

import java.util.List;

public interface StudentRepository {

  List<Student> getAllUsingJdbc();

  List<Student> getAllUsingJdbcTemplate();

  List<Student> getAllUsingJdbcTemplateMappingManual();

  Student getOneById(String id);

  List<StudentEntity> findByLastName(String lastName);

  StudentEntity findByIdEntityManager(String id);

}
