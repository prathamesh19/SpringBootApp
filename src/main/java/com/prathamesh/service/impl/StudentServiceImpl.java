package com.prathamesh.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prathamesh.model.Student;
import com.prathamesh.repo.StudentRepository;
import com.prathamesh.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository repo;
	
	
	@Override
public Integer saveStudent(Student student) {
		return repo.save(student).getStdId();
}
	
	@Override
	public Student getStudent(Integer id) {
		 Optional<Student> opt = repo.findById(id);
		 if(opt.isPresent()) {
			 return opt.get();
		 }
		 else {
			 return null;
		 }
	}
	
	@Override
	public void updateStudent(Student student) {
	   repo.save(student);
	}

	@Override
	public void deleteStudent(Integer id) {
         repo.deleteById(id);		
	}
	
	@Override
	public List<Student> getAllStudents() {
		return repo.findAll();
	}
	
	@Override
	public boolean isStudentExists(Integer id) {
		return repo.existsById(id);
	}
}