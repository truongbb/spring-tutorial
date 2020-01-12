package vn.com.ntqsolution.runners.student;


import vn.com.ntqsolution.runners.entity.StudentEntity;

import java.util.List;

public interface StudentService {

    List<StudentEntity> findByNameUsingNamedParameterJdbcTemplate(String name);

    List<StudentEntity> findByNameUsingSession(String name);

}
