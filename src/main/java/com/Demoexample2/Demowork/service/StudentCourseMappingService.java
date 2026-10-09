package com.Demoexample2.Demowork.service;

import java.util.List;

import com.Demoexample2.Demowork.entity.Course;
import com.Demoexample2.Demowork.entity.Student;
import com.Demoexample2.Demowork.entity.StudentCourseMapping;

public interface StudentCourseMappingService {
	
	StudentCourseMapping saveMapping(StudentCourseMapping studentCourseMapping);
//	StudentCourseMapping getmappingByStudentId(String email_id,Student student);
//	StudentCourseMapping getmappingByCourseId(Student student);
	StudentCourseMapping getbyStudentCourseMappindId(StudentCourseMapping studentCourseMapping);
//	StudentCourseMapping saveStudentCourseMapping(StudentCourseMapping studentCourseMapping);

	StudentCourseMapping Updatemapping(StudentCourseMapping studentCourseMapping);
	
}
