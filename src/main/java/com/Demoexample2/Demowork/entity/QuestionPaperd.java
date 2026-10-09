package com.Demoexample2.Demowork.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name="Question_Paper_Defination")
public class QuestionPaperd {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="Question_paperd_id")
	private Long id;
	
	@Column(name="Marks_Weightage")
	private int marks_weightage;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="subject_id")
	private Subject  subject;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="Question_id")
	private Questionmaster questionmaster;
	
	
}
