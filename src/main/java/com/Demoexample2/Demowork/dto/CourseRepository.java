package com.Demoexample2.Demowork.dto;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.Demoexample2.Demowork.entity.Course;



public interface CourseRepository extends CrudRepository<Course, String>{
	
//	@Query( value=" select * from course a where a.course_name='java'" ,nativeQuery=true)
//	public Course findByCourse_Name(String course_name);
	
}
