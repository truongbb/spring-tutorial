package com.github.truongbb.service;

import com.github.truongbb.bo.Student;
import com.github.truongbb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentService {

  @Autowired
  private StudentRepository studentRepository;

  public Map<String, String> getCountryList() {
    return studentRepository.getCountryList();
  }

  public String validateInputData(Student student) {

    if (student == null) {
      return "Null obj";
    }

    if (student.getAge() < 0) {
      return "Age is not less than 0";
    }

    if (student.getAge() > 150) {
      return "Age is not greater than 150";
    }

    return null;
  }


  public Student getOneById(Long id) {
    List<Student> all = studentRepository.getAll();
    return all.stream().filter(t -> t.getId() == id.intValue()).findFirst().get();
  }

}
