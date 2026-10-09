package com.Demoexample2.Demowork.service;

import com.Demoexample2.Demowork.entity.Scmexattemptcaptue;

public interface Examattaimcaptureservice {
	
	Scmexattemptcaptue getScmexattemptcaptueById(long id);	
	Scmexattemptcaptue SaveScmexattemptcaptue(Scmexattemptcaptue scmexattemptcaptue);
	Scmexattemptcaptue UpdateScmexattemptcaptueById(Scmexattemptcaptue scmexattemptcaptue,long id);
	
}
