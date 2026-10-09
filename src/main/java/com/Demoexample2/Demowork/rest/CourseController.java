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

import com.Demoexample2.Demowork.entity.Course;
import com.Demoexample2.Demowork.service.CourseService;



@RestController
@RequestMapping("/api/created")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/hello")
	public String get() {
		return "hello";
	}
	@PostMapping()
	public ResponseEntity<Course> saveCource(@RequestBody Course course){
		return new ResponseEntity<Course>(courseService.saveCourse(course), HttpStatus.CREATED);
	}
	@PutMapping(path="{course_name}")
	public ResponseEntity <Course> updateEmployee(@PathVariable("course_name") String course_name
			,  @RequestBody Course course){
				return new ResponseEntity<Course>(courseService.updateCourse(course) ,HttpStatus.OK);
	}
	@GetMapping(path="{course_name}")
	public ResponseEntity<Course> getCouresbyname(@PathVariable("course_name") String  course_name, Course course){
		return new ResponseEntity<Course>(courseService.findByCourseName(course),HttpStatus.OK);
	}
}
