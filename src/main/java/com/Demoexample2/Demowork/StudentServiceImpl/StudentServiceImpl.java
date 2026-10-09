package com.Demoexample2.Demowork.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Demoexample2.Demowork.dto.StudentRepository;
import com.Demoexample2.Demowork.entity.Student;
import com.Demoexample2.Demowork.exception.ResourceNotFoundException;
import com.Demoexample2.Demowork.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		Student newStudent=studentRepository.save(student);
		return newStudent;
	}
	public Student updateStudent(Student student) {	
		String id=student.getEmail_id();
		Student exstingstudent=studentRepository.findById(id).orElse(null);
		if(exstingstudent!=null) {
		exstingstudent.setEmail_id(student.getEmail_id());
		exstingstudent.setAge( student.getAge());
		exstingstudent.setGender( student.getGender());
		exstingstudent.setName( student.getName());
		exstingstudent.setMobile( student.getMobile());
		exstingstudent.setLoginpassword( student.getLoginpassword());
		return studentRepository.save(exstingstudent);
		}
		else {
			throw new ResourceNotFoundException("Student","id",id);
		}
	}
	@Override
	public Student findById(Student student) {
		String id=student.getEmail_id();
		
		Student newstudent=studentRepository.findById(id).orElse(null);
		if(newstudent!=null) {
			newstudent.getAge();
			newstudent.getEmail_id();
			newstudent.getGender();
			newstudent.getLoginpassword();
			newstudent.getMobile();
			newstudent.getName();
			return  studentRepository.save(newstudent);		
		}
		else {
		 throw new ResourceNotFoundException("Student","Id",id); 
	}	

	}
}
