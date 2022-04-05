package com.prathamesh.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.prathamesh.exception.StudentNotFoundException;
import com.prathamesh.model.ErrorData;

@RestControllerAdvice
public class CustomExceptionHandlerService {

	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ErrorData> handleStudentNotFoundException(StudentNotFoundException studentNotFoundException){
		
		String message = studentNotFoundException.getMessage();
		String dateTime = new Date().toString();
		String module = "Student";
		ErrorData errorData = new ErrorData(message,dateTime,module);
		
		return new ResponseEntity<ErrorData>(errorData,HttpStatus.NOT_FOUND);
	}
}
