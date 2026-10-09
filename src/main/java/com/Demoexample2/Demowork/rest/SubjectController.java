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

import com.Demoexample2.Demowork.entity.Subject;
import com.Demoexample2.Demowork.service.SubjectService;

@RestController
@RequestMapping("/api/sub")
public class SubjectController {
	
	@Autowired
	private  SubjectService subjectService;
	
	@GetMapping(path="{id}")
	public ResponseEntity<Subject> getSubjectById(@PathVariable("id") long id, Subject subject){
		return new ResponseEntity<Subject>(subjectService.getSubjectById(id),HttpStatus.CREATED);
	}
	@PostMapping("/")
	public ResponseEntity<Subject> saveSubject(@RequestBody Subject subject){
		return new ResponseEntity<Subject>(subjectService.saveSubject(subject),HttpStatus.CREATED);		
	}
	@PutMapping(path="{id}")
	public ResponseEntity<Subject> updateSubject(@PathVariable("id") long id, @RequestBody  Subject subject){		
		return new ResponseEntity<Subject>(subjectService.updateSubject(subject, id),HttpStatus.OK);
	
	}
}
