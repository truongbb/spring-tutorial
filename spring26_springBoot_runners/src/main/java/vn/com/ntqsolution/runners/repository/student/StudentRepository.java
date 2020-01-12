package vn.com.ntqsolution.runners.repository.student;



import vn.com.ntqsolution.runners.entity.StudentEntity;

import java.util.List;

public interface StudentRepository {

    List<StudentEntity> findByNameUsingNamedParameterJdbcTemplate(String name);

    List<StudentEntity> findByNameUsingSession(String name);

}
