package vn.com.ntqsolution.springlogging.student;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.ntqsolution.springlogging.entity.StudentEntity;
import vn.com.ntqsolution.springlogging.repository.student.StudentRepository;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentServiceImpl implements StudentService {


    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<StudentEntity> findByNameUsingNamedParameterJdbcTemplate(String name) {
        return studentRepository.findByNameUsingNamedParameterJdbcTemplate(name);
    }

    @Override
    public List<StudentEntity> findByNameUsingSession(String name) {
        return studentRepository.findByNameUsingSession(name);
    }
}
