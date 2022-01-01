package com.rana.springboot.repos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.rana.springboot.entites.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
	//JPQL
	@Query("from Student")
    List<Student> findAllStudents();
	
	@Query("select s from Student s where s.firstName like %?1")
	List<Student> findByFirstname(String firstname);
}
