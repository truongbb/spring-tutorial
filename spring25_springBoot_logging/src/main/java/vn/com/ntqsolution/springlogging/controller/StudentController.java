package vn.com.ntqsolution.springlogging.controller;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.com.ntqsolution.springlogging.entity.StudentEntity;
import vn.com.ntqsolution.springlogging.student.StudentService;

import java.util.List;

@Controller
@RequestMapping("/student")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/find-by-name")
    public ResponseEntity<List<StudentEntity>> findByName(@RequestParam("name") String name) {
        return new ResponseEntity<>(studentService.findByNameUsingSession(name), HttpStatus.OK);
    }


}
