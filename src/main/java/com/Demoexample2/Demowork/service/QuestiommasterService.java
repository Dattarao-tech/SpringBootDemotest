package com.Demoexample2.Demowork.service;

import com.Demoexample2.Demowork.entity.Questionmaster;

public interface QuestiommasterService {
	Questionmaster getQuestionmasterByid(long id,Questionmaster questionmaster );
	Questionmaster saveQuestionmaster(Questionmaster questionmaster);
	Questionmaster updateQuestionmaster(Questionmaster questionmaster , long id);
	
	
}
