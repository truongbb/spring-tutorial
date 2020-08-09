package com.github.truongbb.runners.service.student;

import com.github.truongbb.runners.entity.StudentEntity;

import java.util.List;

public interface StudentService {

  List<StudentEntity> findByNameUsingNamedParameterJdbcTemplate(String name);

  List<StudentEntity> findByNameUsingSession(String name);

}
