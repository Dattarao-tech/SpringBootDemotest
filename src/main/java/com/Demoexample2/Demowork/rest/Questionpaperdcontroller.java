package com.Demoexample2.Demowork.rest;

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

import com.Demoexample2.Demowork.dto.QuestionpaperdRepo;
import com.Demoexample2.Demowork.entity.QuestionPaperd;
import com.Demoexample2.Demowork.service.QuestionpaperdefService;

@RestController
@RequestMapping("/api/qpd")
public class Questionpaperdcontroller {
	
	
	@Autowired
	private  QuestionpaperdefService  questionpaperdefService;
	
	@GetMapping(path="{id}")
	public ResponseEntity<QuestionPaperd> getQuestionPaperdById(@PathVariable("id")long id){	
		return new ResponseEntity<QuestionPaperd>(questionpaperdefService.getQuestionPaperdById(id),HttpStatus.OK);
	}
	@PostMapping("/")
	public ResponseEntity<QuestionPaperd> updateQuestionPaperd(@RequestBody QuestionPaperd questionPaperd){
		return new ResponseEntity<QuestionPaperd>(questionpaperdefService.saveQuestionPaperd(questionPaperd),HttpStatus.CREATED);	
	}
	@PutMapping(path="{id}")
	public ResponseEntity<QuestionPaperd> updateQuestionPaperd(@PathVariable("id") long id, @RequestBody QuestionPaperd questionPaperd){
		
		return new ResponseEntity<QuestionPaperd>(questionpaperdefService.updateQuestionPaperd(questionPaperd, id),HttpStatus.OK);
	}
}
