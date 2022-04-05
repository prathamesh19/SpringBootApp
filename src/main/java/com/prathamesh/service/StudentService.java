package com.prathamesh.service;

import java.util.List;

import com.prathamesh.model.Student;

public interface StudentService {

	public Integer saveStudent(Student student);
	public Student getStudent(Integer id);
	public List<Student> getAllStudents();
	public void updateStudent(Student student);
	public void deleteStudent(Integer id);
	public boolean isStudentExists(Integer id);
}
