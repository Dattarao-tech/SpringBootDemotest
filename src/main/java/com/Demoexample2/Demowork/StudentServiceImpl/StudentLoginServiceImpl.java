package com.Demoexample2.Demowork.StudentServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Demoexample2.Demowork.dto.StudentRepository;
import com.Demoexample2.Demowork.entity.Student;
import com.Demoexample2.Demowork.service.StudentLoginService;

@Service
public class StudentLoginServiceImpl implements StudentLoginService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student login(String email_id, String loginpassword) {
			Optional<Student> studentoptional= studentRepository.findById(email_id);
			if(studentoptional.isPresent()) {
				Student student=studentoptional.get();
				if(passwordMatches(loginpassword, student.getLoginpassword())) {
					return student;
			
			}
			return null;
			
	}
			return null;
}
	private boolean passwordMatches(String loginpassword, String loginpassword2) {
		// TODO Auto-generated method stub
		if(loginpassword.equals(loginpassword2)==true) {
			return true;
		}
			else {
				return false;
			}
	}
	@Override
	public Student ResgiterStudent(Student student) {
		Student newstudent=studentRepository.save(student);
	
		return newstudent;
	}}