package com.Demoexample2.Demowork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.Demoexample2.Demowork.dto.StudentRepository;
import com.Demoexample2.Demowork.entity.Student;

@DataJpaTest
@AutoConfigureTestDatabase(replace =Replace.NONE)
@Rollback(false)
public class StudentRepositoryTests {
	
	@Autowired
	private StudentRepository studentRepository;
	public void testListStudent() {
//		Student newstudent = new Student();
//		newstudent.setEmail_id("dattarao.deosarkar@quest-global.com");
//		newstudent.setAge(28);
//		newstudent.setGender("male");
//		newstudent.setLoginpassword(1234);
//		newstudent.setMobile(9359550033l);
//		newstudent.setName("Dattarao");	
//		studentRepository.save(newstudent);	
		
	}
}
