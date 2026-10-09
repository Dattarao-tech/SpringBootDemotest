package com.Demoexample2.Demowork.StudentServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Demoexample2.Demowork.dto.QuestionOptionRepo;
import com.Demoexample2.Demowork.entity.QuestionOption;
import com.Demoexample2.Demowork.exception.ResourceNotFoundException;
import com.Demoexample2.Demowork.service.Questionoptiondservice;
@Service
public class QuestionoptiondserviceImpl implements  Questionoptiondservice{

	@Autowired
	private QuestionOptionRepo questionOptionRepo;
	
	public QuestionOption getQuestionOptionById(long id) {
		// TODO Auto-generated method stub
		 QuestionOption  NewQuestionOption =questionOptionRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("QuestionOption","id",id));
		return  NewQuestionOption;
	
	}
	@Override
	public QuestionOption saveQuestionOption(QuestionOption questionOption) {
		// TODO Auto-generated method stub
		 QuestionOption  NewQuestionOption=questionOptionRepo.save(questionOption);	 
		return NewQuestionOption;
	}
	@Override
	public QuestionOption updateQuestionOption(QuestionOption questionOption, long id) {
		// TODO Auto-generated method stub
		QuestionOption NewQuestionOption=questionOptionRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("QuestionOption","id",id));
		if(NewQuestionOption!=null) {
			 NewQuestionOption.setId(questionOption.getId());
			 NewQuestionOption.setQuestionmaster(questionOption.getQuestionmaster());
			 NewQuestionOption.setIscorrectOption( questionOption.getIscorrectOption());
			 NewQuestionOption.setOption_text(questionOption.getOption_text());
			 questionOptionRepo.save(NewQuestionOption);	
		}
		return NewQuestionOption;
	}
}
