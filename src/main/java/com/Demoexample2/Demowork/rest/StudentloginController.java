package com.Demoexample2.Demowork.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Demoexample2.Demowork.entity.Student;
import com.Demoexample2.Demowork.service.StudentLoginService;
import com.Demoexample2.Demowork.service.StudentService;
@RestController
@RequestMapping("/api")
public class StudentloginController {
	
	@Autowired
	private  StudentLoginService  studentLoginService;
	
	@PostMapping("/regiter")
	public ResponseEntity<Student> regiterStudent(@RequestBody Student student){
	
		Student regiterstudent=studentLoginService.ResgiterStudent(student);
		return  ResponseEntity.ok(regiterstudent);
	}
	@PostMapping("/login")
	public ResponseEntity<Student> login(@RequestBody LoginRequest loginRequest){
		
//		String email_id="ashish@gmail.com";
//		String loginpassword="datta1";
//		String jwtToken=JwtUtil.gererateToken(email_id, loginpassword);
//		System.out.println("Jwt Token :"+jwtToken);
//		JwtUtil.gererateToken(email_id, loginpassword);
		
		
	String email =	loginRequest.getEmail_id();
	String  password=  loginRequest.getLoginpassword();
	Student student=studentLoginService.login(email, password);
	if(student!=null) {
		return ResponseEntity.ok(student);
	}
	else {
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
	}

	}
}
