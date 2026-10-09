package com.Demoexample2.Demowork.StudentServiceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Demoexample2.Demowork.dto.StudentCourseMappingRepo;
import com.Demoexample2.Demowork.entity.Course;
import com.Demoexample2.Demowork.entity.Student;
import com.Demoexample2.Demowork.entity.StudentCourseMapping;
import com.Demoexample2.Demowork.exception.ResourceNotFoundException;
import com.Demoexample2.Demowork.service.StudentCourseMappingService;

@Service
public class StudentCourseMappinServiceImpl implements StudentCourseMappingService{
	
	@Autowired
	private StudentCourseMappingRepo studentCourseMappingRepo;

	@Override
	public StudentCourseMapping saveMapping(StudentCourseMapping studentCourseMapping) {
		 StudentCourseMapping NewSCM=studentCourseMappingRepo.save(studentCourseMapping);
	return NewSCM;
	
	}
	@Override
	public StudentCourseMapping getbyStudentCourseMappindId(StudentCourseMapping studentCourseMapping) {
		// TODO Auto-generated method stub
		String id=studentCourseMapping.getMappingId();
		StudentCourseMapping newscmapping=studentCourseMappingRepo.findById(id).orElse(null);
		if(newscmapping!=null) {
			newscmapping.getMappingId();
			newscmapping.getAttempt_utilized();
			newscmapping.getFee_payment_status();
			newscmapping.getMarks_obtained();
			newscmapping.getMarks_out_of();
			newscmapping.getRegistration_date();
			newscmapping.getValid_upto_date();
			newscmapping.getResult();
			newscmapping.getCourse();
			newscmapping.getStudent();
			return studentCourseMappingRepo.save( newscmapping);
		
		}
		else {
			throw new ResourceNotFoundException("StudentCourseMapping","id",id);
		}
	}
	@Override
	public StudentCourseMapping Updatemapping(StudentCourseMapping studentCourseMapping) {
		 String id=studentCourseMapping.getMappingId();
		 StudentCourseMapping NewStudentCourseMapping =studentCourseMappingRepo.findById(id).orElse(null);
		 if( NewStudentCourseMapping!=null) {
			 NewStudentCourseMapping.setMappingId( studentCourseMapping.getMappingId());
			 NewStudentCourseMapping.setAttempt_utilized(studentCourseMapping.getAttempt_utilized());
			 NewStudentCourseMapping.setFee_payment_status(studentCourseMapping.getFee_payment_status());
			 NewStudentCourseMapping.setMarks_obtained( NewStudentCourseMapping.getMarks_obtained());
			 NewStudentCourseMapping.setMarks_out_of(studentCourseMapping.getMarks_out_of());
			 NewStudentCourseMapping.setRegistration_date(studentCourseMapping.getRegistration_date());
			 NewStudentCourseMapping.setRegistration_date(studentCourseMapping.getRegistration_date());
			 NewStudentCourseMapping.setResult(studentCourseMapping.getResult());
			 NewStudentCourseMapping.setCourse(studentCourseMapping.getCourse());
			 NewStudentCourseMapping.setStudent(studentCourseMapping.getStudent());		 
			 return studentCourseMappingRepo.save(NewStudentCourseMapping);	
		 }
		 throw new ResourceNotFoundException("StudentCourseMapping","id",id);
		 
	}
}
