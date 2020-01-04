package vn.com.ntqsolution.repository;

import vn.com.ntqsolution.bean.Student;

import java.util.List;

public interface StudentRepository {

    List<Student> getAllUsingJdbc();

    List<Student> getAllUsingJdbcTemplate();

    List<Student> getAllUsingJdbcTemplateMappingManual();

    Student getOneById(String id);

}
