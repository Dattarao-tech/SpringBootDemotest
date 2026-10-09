package com.Demoexample2.Demowork.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Demoexample2.Demowork.entity.Student;
import com.Demoexample2.Demowork.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		return new ResponseEntity<Student>(studentService.saveStudent(student),HttpStatus.OK);
		
	}
	@PutMapping(path="{email_id}")
	public ResponseEntity <Student> updateEmployee(@PathVariable("email_id") String email_id
			,@RequestBody Student student){
				return new ResponseEntity<Student>(studentService.updateStudent(student) ,HttpStatus.OK);
	}
	@GetMapping(path="{email_id}")
	public ResponseEntity<Student> getByemailId(@PathVariable("email_id") String email_id,Student student){
		return new ResponseEntity<Student>(studentService.findById(student),HttpStatus.OK);
	
	}
	
}
