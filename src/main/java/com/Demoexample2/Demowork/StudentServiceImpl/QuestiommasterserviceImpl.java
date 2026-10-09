package com.Demoexample2.Demowork.StudentServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Demoexample2.Demowork.dto.QuestionmasterRepo;
import com.Demoexample2.Demowork.entity.Questionmaster;
import com.Demoexample2.Demowork.exception.ResourceNotFoundException;
import com.Demoexample2.Demowork.service.QuestiommasterService;
@Service
public class QuestiommasterserviceImpl implements QuestiommasterService{

	@Autowired
	private QuestionmasterRepo questionmasterRepo;

	@Override
	public Questionmaster getQuestionmasterByid(long id, Questionmaster questionmaster) {
		// TODO Auto-generated method stub
		Questionmaster NewQuestionmaster =questionmasterRepo.findById(id).orElse(null);
		
		return  NewQuestionmaster;
	
	}
	@Override
	public Questionmaster saveQuestionmaster(Questionmaster questionmaster) {
		// TODO Auto-generated method stub
		Questionmaster NewQuestionmaster=questionmasterRepo.save( questionmaster);
		return NewQuestionmaster;
		
	}
	@Override
	public Questionmaster updateQuestionmaster(Questionmaster questionmaster, long id) {
Questionmaster NewQuestionmaster=questionmasterRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Questionmaster","id",id));
if(NewQuestionmaster!=null) {
	NewQuestionmaster.setOptions(questionmaster.getOptions());
	NewQuestionmaster.setQuestion_text(questionmaster.getQuestion_text());
	NewQuestionmaster.setResponsetyep(questionmaster.getResponsetyep());
	questionmasterRepo.save(NewQuestionmaster);
}
return NewQuestionmaster;
	}
}
