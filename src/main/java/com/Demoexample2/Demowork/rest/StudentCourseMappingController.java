package com.Demoexample2.Demowork.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Demoexample2.Demowork.Security.AuthenticateRequest;
import com.Demoexample2.Demowork.Security.AuthenticationResponse;
import com.Demoexample2.Demowork.Security.MyUserDetailsService;
import com.Demoexample2.Demowork.entity.Student;
import com.Demoexample2.Demowork.entity.StudentCourseMapping;
import com.Demoexample2.Demowork.service.StudentCourseMappingService;



@RestController
@RequestMapping("/api/scm")
public class StudentCourseMappingController {
	
	@GetMapping("/hi")
	public String hellodemo() {
		return  "work token cheak";
	}
	@Autowired
	private StudentCourseMappingService scMappingService;
	
	
	@GetMapping(path="{mappingId}")
	public ResponseEntity<StudentCourseMapping> getbyStudentCourseMappindId(@PathVariable("mappingId") String mappingId,  StudentCourseMapping studentCourseMapping){	
	
		return new ResponseEntity<StudentCourseMapping>(scMappingService.getbyStudentCourseMappindId(studentCourseMapping),HttpStatus.OK);
	}
	@PostMapping("/cre")
	public ResponseEntity<StudentCourseMapping> saveMapping(@RequestBody StudentCourseMapping studentCourseMapping ){
		
		return new ResponseEntity<StudentCourseMapping>( scMappingService.saveMapping(studentCourseMapping),HttpStatus.CREATED);
	}
	@PutMapping(path="{mappingId}")
	public ResponseEntity<StudentCourseMapping> UpdateMapping(@PathVariable("mappingId") String mappingId, @RequestBody StudentCourseMapping studentCourseMapping){
		return new ResponseEntity<StudentCourseMapping>(scMappingService.Updatemapping(studentCourseMapping),HttpStatus.OK);
			
	}
}
