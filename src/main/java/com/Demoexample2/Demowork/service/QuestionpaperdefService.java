package com.Demoexample2.Demowork.service;

import com.Demoexample2.Demowork.entity.QuestionPaperd;

public interface QuestionpaperdefService {
	QuestionPaperd getQuestionPaperdById(long id);
	QuestionPaperd saveQuestionPaperd(QuestionPaperd questionPaperd);
	QuestionPaperd updateQuestionPaperd(QuestionPaperd questionPaperd, long id);
}
