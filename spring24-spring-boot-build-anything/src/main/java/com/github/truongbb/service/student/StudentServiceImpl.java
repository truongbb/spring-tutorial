package com.github.truongbb.service.student;

import com.github.truongbb.entity.StudentEntity;
import com.github.truongbb.repository.student.StudentRepository;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentServiceImpl implements StudentService {

  @Autowired
  StudentRepository studentRepository;

  @Override
  public List<StudentEntity> findByNameUsingNamedParameterJdbcTemplate(String name) {
    return studentRepository.findByNameUsingNamedParameterJdbcTemplate(name);
  }

  @Override
  public List<StudentEntity> findByNameUsingSession(String name) {
    return studentRepository.findByNameUsingSession(name);
  }

}
