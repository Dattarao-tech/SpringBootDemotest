package com.Demoexample2.Demowork.StudentServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Demoexample2.Demowork.dto.Examattaimcaparerepo;
import com.Demoexample2.Demowork.entity.Scmexattemptcaptue;
import com.Demoexample2.Demowork.exception.ResourceNotFoundException;
import com.Demoexample2.Demowork.service.Examattaimcaptureservice;
@Service
public class ExamattaimcapaturserviceImpl implements Examattaimcaptureservice{

	@Autowired
	private  Examattaimcaparerepo  examattaimcaparerepo;
	
	public Scmexattemptcaptue getScmexattemptcaptueById(long id) {
		// TODO Auto-generated method stub
		Optional<Scmexattemptcaptue> NewScmexattemptcaptue =examattaimcaparerepo.findById(id);
		if( NewScmexattemptcaptue.isPresent()) {
			return NewScmexattemptcaptue.get();
		}
		else {
			throw new ResourceNotFoundException("Scmexattemptcaptue","id",id);
		}
	}
	@Override
	public Scmexattemptcaptue SaveScmexattemptcaptue(Scmexattemptcaptue scmexattemptcaptue) {
		// TODO Auto-generated method stub
		Scmexattemptcaptue NewScmexattemptcaptue=examattaimcaparerepo.save(scmexattemptcaptue);
		return  NewScmexattemptcaptue;
	}
	public Scmexattemptcaptue UpdateScmexattemptcaptueById(Scmexattemptcaptue scmexattemptcaptue, long id) {
		Scmexattemptcaptue  NewScmexattemptcaptue=examattaimcaparerepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Scmexattemptcaptue","id",id));
		if(NewScmexattemptcaptue!=null) {
			 NewScmexattemptcaptue.setAttemt_number(scmexattemptcaptue.getAttemt_number());
			 NewScmexattemptcaptue.setExam_str_time( scmexattemptcaptue.getExam_str_time());
			 NewScmexattemptcaptue.setExam_end_time(scmexattemptcaptue.getExam_end_time());
			 NewScmexattemptcaptue.setMar_Obtained(scmexattemptcaptue.getMar_Obtained());
			 NewScmexattemptcaptue.setExam_result(scmexattemptcaptue.getExam_result());
			 NewScmexattemptcaptue.setCourse(scmexattemptcaptue.getCourse());
			 NewScmexattemptcaptue.setStudent(scmexattemptcaptue.getStudent());
			 examattaimcaparerepo.save( NewScmexattemptcaptue);
		}
		return NewScmexattemptcaptue;
		
		}

}
