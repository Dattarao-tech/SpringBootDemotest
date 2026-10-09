package com.Demoexample2.Demowork.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Demoexample2.Demowork.entity.QuestionOption;
import com.Demoexample2.Demowork.service.Questionoptiondservice;

@RestController
@RequestMapping("/api/qod")
public class QuestionOptiondController {
	Logger loger =LoggerFactory.getLogger(QuestionOptiondController.class);
	@Autowired
	private Questionoptiondservice questionoptiondservice;
	
	@GetMapping(path="{id}")
	public ResponseEntity<QuestionOption> getQuestionOptiondById(@PathVariable("id") long id){		
		return new ResponseEntity<QuestionOption>(questionoptiondservice.getQuestionOptionById(id),HttpStatus.OK);
	}
	@PostMapping("/")
	public ResponseEntity<QuestionOption> saveQuestionOption(@RequestBody QuestionOption questionOption){
		loger.info("this cns cbc",questionOption);
		return new ResponseEntity<QuestionOption>( questionoptiondservice.saveQuestionOption(questionOption),HttpStatus.CREATED);
	}
	@PutMapping(path="{id}")
	public ResponseEntity<QuestionOption> updateQuestionOption(@PathVariable("id") long id, @RequestBody QuestionOption questionOption ){		
		return new ResponseEntity<QuestionOption>(questionoptiondservice.updateQuestionOption(questionOption, id),HttpStatus.OK);
		
	}
}
