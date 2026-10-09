package com.Demoexample2.Demowork.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Demoexample2.Demowork.entity.QuestionOption;

public interface QuestionOptionRepo extends JpaRepository<QuestionOption, Long>{
	

}
