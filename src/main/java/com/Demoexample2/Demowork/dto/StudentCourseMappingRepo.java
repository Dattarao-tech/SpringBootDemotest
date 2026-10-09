package com.Demoexample2.Demowork.dto;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Demoexample2.Demowork.entity.StudentCourseMapping;

public interface StudentCourseMappingRepo extends JpaRepository<StudentCourseMapping,String>{

}
