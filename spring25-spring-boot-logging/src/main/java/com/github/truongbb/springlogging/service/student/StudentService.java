package com.github.truongbb.springlogging.service.student;

import com.github.truongbb.springlogging.entity.StudentEntity;

import java.util.List;

public interface StudentService {

  List<StudentEntity> findByNameUsingNamedParameterJdbcTemplate(String name);

  List<StudentEntity> findByNameUsingSession(String name);

}
