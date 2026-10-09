package com.Demoexample2.Demowork.service;

import com.Demoexample2.Demowork.entity.Subject;

public interface SubjectService {
	Subject getSubjectById(long id);
	Subject saveSubject(Subject subject);
	Subject updateSubject(Subject subject, long id);
	
}
