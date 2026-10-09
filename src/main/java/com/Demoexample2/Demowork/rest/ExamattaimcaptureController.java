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

import com.Demoexample2.Demowork.entity.Scmexattemptcaptue;
import com.Demoexample2.Demowork.service.Examattaimcaptureservice;
import com.Demoexample2.Demowork.util.JwtUtil;

@RestController
@RequestMapping("/api/eac")
public class ExamattaimcaptureController {
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@GetMapping("/api")
	public String get() {
	
		return "token cheking";
	}
	private static final Logger loger =LoggerFactory.getLogger( ExamattaimcaptureController.class);
	
	@Autowired
	private  Examattaimcaptureservice  examattaimcaptureservice;
	
	@GetMapping(path="{id}")
	public ResponseEntity<Scmexattemptcaptue> getScmexattemptcaptueById(@PathVariable("id") long id, Scmexattemptcaptue scmexattemptcaptue ){
		return new ResponseEntity<Scmexattemptcaptue>(examattaimcaptureservice.getScmexattemptcaptueById(id),HttpStatus.OK);
	}
	@PostMapping("/")
	public ResponseEntity<Scmexattemptcaptue> SaveScmexattemptcaptue(@RequestBody Scmexattemptcaptue scmexattemptcaptue){
		loger.info("trece {}",scmexattemptcaptue );
		return new ResponseEntity<Scmexattemptcaptue>(examattaimcaptureservice.SaveScmexattemptcaptue(scmexattemptcaptue),HttpStatus.CREATED);	
	
	}
	@PutMapping(path= "{id}")
	public ResponseEntity<Scmexattemptcaptue> updateScmexattemptcaptue(@PathVariable("id")long id, @RequestBody Scmexattemptcaptue scmexattemptcaptue){
		return new ResponseEntity<Scmexattemptcaptue>(examattaimcaptureservice.UpdateScmexattemptcaptueById(scmexattemptcaptue, id),HttpStatus.OK);
	}
}
