package com.github.truongbb.springlogging.repository.student;


import com.github.truongbb.springlogging.entity.StudentEntity;

import java.util.List;

public interface StudentRepository {

  List<StudentEntity> findByNameUsingNamedParameterJdbcTemplate(String name);

  List<StudentEntity> findByNameUsingSession(String name);

}
