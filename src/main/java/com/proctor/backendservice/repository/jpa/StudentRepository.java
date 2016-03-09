package com.proctor.backendservice.repository.jpa;

import com.proctor.backendservice.model.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;
/**
 * Created by ashekar on 3/6/2016.
 */
public interface StudentRepository extends Repository<Student,Integer> {

  Student save(Student student);

  @Modifying
  @Query("select u from Student  u where u.firstname = :firstname and u.lastname = :lastname")
  List<Student> getallByFirstNameAndLastName(@Param("lastname") String lastname,
                                 @Param("firstname") String firstname);

}
/*

public interface StudentRepository extends CrudRepository<Student,Integer>,JpaRepository<Student, Integer> {

  // Student save(Student student);
  @Modifying
  @Transactional
  @Query("select u from student u where u.firstname = :firstname or u.lastname = :lastname")
  List<Student> getallastnameOrFirstname(@Param("lastname") String lastname,
                                         @Param("firstname") String firstname);

}
*/
