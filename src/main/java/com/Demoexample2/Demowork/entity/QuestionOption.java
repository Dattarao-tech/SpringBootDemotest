package com.Demoexample2.Demowork.entity;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.Demoexample2.Demowork.entity.Questionmaster.ResponseType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name="Question_Option_Defination")
public class QuestionOption {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="Question_Option_Id")
	private long id;
	
	@Column(name="Option_text")
	private String Option_text;
	
	@Column(name="Is_Correct_Option")
	private Boolean iscorrectOption;
	
	@OneToOne
	@JoinColumn(name="Question_id")
	private Questionmaster questionmaster;
	
}
