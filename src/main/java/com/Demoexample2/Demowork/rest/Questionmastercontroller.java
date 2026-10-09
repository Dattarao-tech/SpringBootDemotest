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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Demoexample2.Demowork.entity.Questionmaster;
import com.Demoexample2.Demowork.service.QuestiommasterService;

@RestController
@RequestMapping("/api/que")
public class Questionmastercontroller {
	Logger loger =LoggerFactory.getLogger( Questionmastercontroller.class);
	@Autowired
	private QuestiommasterService questiommasterService;
	
	@GetMapping(path="{id}")
	public ResponseEntity<Questionmaster> getQuestionmasterById(@PathVariable("id")long id, Questionmaster questionmaster){		
		loger.info("dhs",questionmaster);
		return new ResponseEntity<Questionmaster>(questiommasterService.getQuestionmasterByid(id, questionmaster),HttpStatus.OK);
	}
	@PostMapping("/")
	public ResponseEntity<Questionmaster> updateQuestionmaster(@RequestBody Questionmaster questionmaster){		
		return new ResponseEntity<Questionmaster>(questiommasterService.saveQuestionmaster(questionmaster),HttpStatus.CREATED);	
	}
	@PutMapping(path="{id}")
	public ResponseEntity<Questionmaster> updateQuestionmaster(@PathVariable("id")long id, @RequestBody Questionmaster questionmaster ){
		return new ResponseEntity<Questionmaster>(questiommasterService.updateQuestionmaster(questionmaster, id),HttpStatus.OK);
	}
}
