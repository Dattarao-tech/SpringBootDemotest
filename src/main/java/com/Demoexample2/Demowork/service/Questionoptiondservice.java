package com.Demoexample2.Demowork.service;

import com.Demoexample2.Demowork.entity.QuestionOption;

public interface Questionoptiondservice {
	 QuestionOption  getQuestionOptionById(long id);
	 QuestionOption saveQuestionOption(QuestionOption  questionOption);
	 QuestionOption updateQuestionOption(QuestionOption  questionOption,long id);
	 
}
