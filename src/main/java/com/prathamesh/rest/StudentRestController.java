package com.prathamesh.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prathamesh.model.Student;
import com.prathamesh.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentRestController {

	/**
	 * post--save---string
	 * get----getone---object. recommended to use ?
	 * get---getall---List<Object>
	 * delete---string
	 * put--update---string
	 */
	
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveOneStudent(@RequestBody  Student student){
		Integer id = studentService.saveStudent(student);
		ResponseEntity<String> responseEntity= new ResponseEntity<String>("Student With Id: "+id+"saved successfully", HttpStatus.OK);
	       return responseEntity;
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Student> getOneStudent(@PathVariable Integer id){
		return new ResponseEntity<Student>(studentService.getStudent(id),HttpStatus.OK);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Student>> getAllStudents(){
		return new ResponseEntity<List<Student>>(studentService.getAllStudents(),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer id){
		studentService.deleteStudent(id);
		return new ResponseEntity<String>("Student with id: "+id+" deleted successfully", HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateStudent(@RequestBody Student student,@PathVariable Integer id){
		student.setStdId(id);
		studentService.updateStudent(student);
        return new ResponseEntity<String>("student with id: "+id+" updated successfully",HttpStatus.OK);	
	}
}
