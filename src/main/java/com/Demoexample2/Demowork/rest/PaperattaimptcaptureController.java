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

import com.Demoexample2.Demowork.entity.Paperattemptcapture;
import com.Demoexample2.Demowork.service.PaperattemptcaptureService;

@RestController
@RequestMapping("/api/pacc")
public class PaperattaimptcaptureController {
	
	
	@GetMapping("/")
	public String demo() {
		return "token checking";
	}
	
	@Autowired
	private  PaperattemptcaptureService  paperattemptcaptureService;
	
	@GetMapping(path="{id}")
	public ResponseEntity<Paperattemptcapture> getPaperattemptcapture(@PathVariable("id")long id){	
		return new ResponseEntity<Paperattemptcapture>(paperattemptcaptureService.getPaperattemptcaptureById(id),HttpStatus.OK);
	}
	@PostMapping("/")
	public ResponseEntity<Paperattemptcapture> savePaperattemptcapture(@RequestBody Paperattemptcapture Paperattemptcapture){
		return new ResponseEntity<Paperattemptcapture>(paperattemptcaptureService.savePaperattemptcapture(Paperattemptcapture),HttpStatus.CREATED);
		
	}
	@PutMapping(path="{id}")
	public ResponseEntity<Paperattemptcapture> updatePaperattemptcapture(@PathVariable("id") long id, @RequestBody Paperattemptcapture paperattemptcapture){
		return new ResponseEntity<Paperattemptcapture>(paperattemptcaptureService.updatePaperattemptcapture(paperattemptcapture, id),HttpStatus.OK);
	}
}
