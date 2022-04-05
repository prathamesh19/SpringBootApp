package com.prathamesh.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prathamesh.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	@Query("select s from Student s")
	List<Student> getAllStudents();
	
	@Query("select s from Student s where s.stdId between :id1 and :id2")
	List<Student> getAllStudents(Integer id1, Integer id2);
}
