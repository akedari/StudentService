package com.proctor.backendservice.web.api;

import com.proctor.backendservice.model.Student;
import com.proctor.backendservice.repository.jpa.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ashekar on 3/6/2016.
 */
@RestController
public class StudentService {

  @Autowired
  StudentRepository studentRepository;


  @RequestMapping(value = "/api/student/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<List<Student>> get(@Param(value = "id") int id) {
    List<Student> studentList = studentRepository.getallByFirstNameAndLastName("shekar", "arvind");
    return new ResponseEntity<>(studentList, HttpStatus.OK);
  }


  @RequestMapping(value = "/api/student", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<String> insertDataToStudent(@RequestBody Student student) {
    studentRepository.save(student);
    return new ResponseEntity<>("success", HttpStatus.CREATED);

  }


}
