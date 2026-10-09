package com.Demoexample2.Demowork.StudentServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Demoexample2.Demowork.dto.PaperattamptcaptureRepo;
import com.Demoexample2.Demowork.entity.Paperattemptcapture;
import com.Demoexample2.Demowork.exception.ResourceNotFoundException;
import com.Demoexample2.Demowork.service.PaperattemptcaptureService;
@Service
public class PaperattemptcaptureServiceImpl implements PaperattemptcaptureService{
	
	@Autowired
	private PaperattamptcaptureRepo paperattamptcaptureRepo;
	
	@Override
	public Paperattemptcapture getPaperattemptcaptureById(long id) {
		// TODO Auto-generated method stub
		Paperattemptcapture NewPaperattemptcapture=paperattamptcaptureRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Paperattemptcapture","id",id));
		return  NewPaperattemptcapture;
	}
	@Override
	public Paperattemptcapture savePaperattemptcapture(Paperattemptcapture paperattemptcapture) {
		// TODO Auto-generated method stub
		 Paperattemptcapture  NewPaperattemptcapture=paperattamptcaptureRepo.save(paperattemptcapture);
		return NewPaperattemptcapture;
		
	}
	@Override
	public Paperattemptcapture updatePaperattemptcapture(Paperattemptcapture paperattemptcapture, long id) {
		Paperattemptcapture NewPaperattemptcapture=paperattamptcaptureRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Paperattemptcapture","id",id));
		
		if( NewPaperattemptcapture!=null) {
			 NewPaperattemptcapture.setId( paperattemptcapture.getId());
			 NewPaperattemptcapture.setMarks_obtained( paperattemptcapture.getMarks_obtained());
			 NewPaperattemptcapture.setOption(paperattemptcapture.getOption());
			 NewPaperattemptcapture.setQuestion( paperattemptcapture.getQuestion());
			 NewPaperattemptcapture.setScmexattemptcaptue(paperattemptcapture.getScmexattemptcaptue());
			
			 paperattamptcaptureRepo.save( NewPaperattemptcapture);
		}
		return  NewPaperattemptcapture;
	}
}
