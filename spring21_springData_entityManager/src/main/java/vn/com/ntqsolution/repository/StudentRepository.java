package vn.com.ntqsolution.repository;

import vn.com.ntqsolution.bean.Student;
import vn.com.ntqsolution.entity.StudentEntity;

import java.util.List;

public interface StudentRepository {

    List<Student> getAllUsingJdbc();

    List<Student> getAllUsingJdbcTemplate();

    List<Student> getAllUsingJdbcTemplateMappingManual();

    Student getOneById(String id);

    List<StudentEntity> findByLastName(String lastName);

    StudentEntity findByIdEntityManager(String id);

}
