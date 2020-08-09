package com.github.truongbb.runners.repository.student;

import com.github.truongbb.runners.entity.StudentEntity;

import java.util.List;

public interface StudentRepository {

  List<StudentEntity> findByNameUsingNamedParameterJdbcTemplate(String name);

  List<StudentEntity> findByNameUsingSession(String name);

}
