package vn.com.ntqsolution.springlogging.repository.student;


import vn.com.ntqsolution.springlogging.entity.StudentEntity;

import java.util.List;

public interface StudentRepository {

    List<StudentEntity> findByNameUsingNamedParameterJdbcTemplate(String name);

    List<StudentEntity> findByNameUsingSession(String name);

}
