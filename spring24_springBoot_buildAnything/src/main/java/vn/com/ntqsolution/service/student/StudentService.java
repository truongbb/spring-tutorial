package vn.com.ntqsolution.service.student;

import vn.com.ntqsolution.entity.StudentEntity;

import java.util.List;

public interface StudentService {

    List<StudentEntity> findByNameUsingNamedParameterJdbcTemplate(String name);

    List<StudentEntity> findByNameUsingSession(String name);

}
