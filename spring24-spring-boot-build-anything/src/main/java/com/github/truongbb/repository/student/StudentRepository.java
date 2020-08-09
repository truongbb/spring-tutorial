package com.github.truongbb.repository.student;

import com.github.truongbb.entity.StudentEntity;

import java.util.List;

public interface StudentRepository {

  List<StudentEntity> findByNameUsingNamedParameterJdbcTemplate(String name);

  List<StudentEntity> findByNameUsingSession(String name);

}
