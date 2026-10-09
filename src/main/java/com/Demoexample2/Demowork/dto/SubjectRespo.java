package com.Demoexample2.Demowork.dto;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Demoexample2.Demowork.entity.Subject;

public interface SubjectRespo  extends JpaRepository<Subject, Long>{
	
}
