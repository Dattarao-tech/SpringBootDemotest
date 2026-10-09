package com.Demoexample2.Demowork.service;

import com.Demoexample2.Demowork.entity.Paperattemptcapture;

public interface PaperattemptcaptureService {
	
	Paperattemptcapture getPaperattemptcaptureById(long id);
	Paperattemptcapture savePaperattemptcapture(Paperattemptcapture paperattemptcapture);
	Paperattemptcapture updatePaperattemptcapture(Paperattemptcapture paperattemptcapture, long id);

}
