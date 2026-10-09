package com.Demoexample2.Demowork.dto;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.Demoexample2.Demowork.entity.Student;

public interface StudentRepository extends CrudRepository<Student, String>{
	
//	@Query( value=" select * from student a where a.email_id='dattapatill@gmail.com'",nativeQuery=true)
//	Student findByEmail_id(String email_id);
	
}
