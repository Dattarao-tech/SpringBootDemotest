package com.Demoexample2.Demowork.service;

import com.Demoexample2.Demowork.entity.Student;

public interface StudentLoginService {
	
	Student ResgiterStudent(Student student);
	Student login(String email , String password);
}
