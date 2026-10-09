package com.Demoexample2.Demowork.StudentServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Demoexample2.Demowork.dto.QuestionpaperdRepo;
import com.Demoexample2.Demowork.entity.QuestionPaperd;
import com.Demoexample2.Demowork.exception.ResourceNotFoundException;
import com.Demoexample2.Demowork.service.QuestionpaperdefService;

@Service
public class QuestionpaperdservieImpl implements QuestionpaperdefService {

	@Autowired
	private QuestionpaperdRepo questionpaperdRepo; 
	
	@Override
	public QuestionPaperd getQuestionPaperdById(long id) {
		// TODO Auto-generated method stu
		QuestionPaperd 	NewQuestionPaperd=questionpaperdRepo.findById(id).orElse(null);
		return  	NewQuestionPaperd;
		
	}
	@Override
	public QuestionPaperd saveQuestionPaperd(QuestionPaperd questionPaperd) {
		// TODO Auto-generated method stub
		QuestionPaperd NewQuestionPaperd = questionpaperdRepo.save(questionPaperd);
		return  NewQuestionPaperd;
		
	}
	@Override
	public QuestionPaperd updateQuestionPaperd(QuestionPaperd questionPaperd, long id) {
		// TODO Auto-generated method stub
		 QuestionPaperd  NewQuestionPaperd=questionpaperdRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("QuestionPaperd","id",id));
		if( NewQuestionPaperd!=null) {
			NewQuestionPaperd.setId( questionPaperd.getId());
			NewQuestionPaperd.setMarks_weightage(questionPaperd.getMarks_weightage());
			NewQuestionPaperd.setQuestionmaster(questionPaperd.getQuestionmaster());
			NewQuestionPaperd.setQuestionmaster(questionPaperd.getQuestionmaster());
			NewQuestionPaperd.setSubject(NewQuestionPaperd.getSubject());
			 questionpaperdRepo.save(NewQuestionPaperd);
		}
		return NewQuestionPaperd;
	}
}
