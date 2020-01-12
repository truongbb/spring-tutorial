package vn.com.ntqsolution.springlogging.student;

import vn.com.ntqsolution.springlogging.entity.StudentEntity;

import java.util.List;

public interface StudentService {

    List<StudentEntity> findByNameUsingNamedParameterJdbcTemplate(String name);

    List<StudentEntity> findByNameUsingSession(String name);

}
