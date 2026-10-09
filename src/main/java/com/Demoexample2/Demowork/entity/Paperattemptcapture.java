package com.Demoexample2.Demowork.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name="paper_attempt_capture")
public class Paperattemptcapture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="paper_attempt_id")
	@NonNull
	private long id;
	
	@Column(name="question" ,nullable=false)
	private String Question;
	
	@Column(name="option_cm")
	private String Option;
	
	@Column(name="iscorectanswer",nullable=false)
	private boolean iscorrectanswer;
	
	@Column(name="marks_obtained")
	private int marks_obtained;
	
	@ManyToOne(fetch =FetchType.EAGER)
	@JoinColumn(name="id")
	private  Scmexattemptcaptue  scmexattemptcaptue;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="Question_paperd_id")
	private QuestionPaperd questionPaperd;
	
}
