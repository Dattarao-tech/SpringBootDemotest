package com.Demoexample2.Demowork.service;

import com.Demoexample2.Demowork.entity.Course;

public interface CourseService {
	
	Course saveCourse(Course Course);
	Course updateCourse(Course course);
	Course findByCourseName(Course course);
	
}
