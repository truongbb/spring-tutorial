package vn.com.ntqsolution.repository.student;

import vn.com.ntqsolution.entity.StudentEntity;

import java.util.List;

public interface StudentRepository {

    List<StudentEntity> findByNameUsingNamedParameterJdbcTemplate(String name);

    List<StudentEntity> findByNameUsingSession(String name);

}
