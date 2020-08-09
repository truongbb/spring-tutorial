package com.github.truongbb.service.student;

import com.github.truongbb.entity.StudentEntity;

import java.util.List;

public interface StudentService {

  List<StudentEntity> findByNameUsingNamedParameterJdbcTemplate(String name);

  List<StudentEntity> findByNameUsingSession(String name);

}
