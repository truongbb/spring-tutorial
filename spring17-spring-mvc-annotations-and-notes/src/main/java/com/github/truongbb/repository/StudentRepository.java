package com.github.truongbb.repository;

import com.github.truongbb.bo.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepository {

  public Map<String, String> getCountryList() {
    Map<String, String> countryList = new HashMap<>();
    countryList.put("US", "United States");
    countryList.put("CH", "China");
    countryList.put("SG", "Singapore");
    countryList.put("MY", "Malaysia");
    return countryList;
  }

  public List<Student> getAll() {
    List<Student> all = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      Student student = new Student();
      student.setId(i);
      student.setName("Nguyen Van " + i);
    }
    return all;
  }

}
