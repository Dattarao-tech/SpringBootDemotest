package com.Demoexample2.Demowork.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name="Question")
public class Questionmaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NonNull
	@Column(name="Question_id")
	private Long id;
	
	@Column(name="question_text",nullable=false)
	private String question_text;
	
	@Enumerated(EnumType.STRING)
	@Column(name="response_type" , nullable=false)
	private ResponseType responsetyep;

	@ElementCollection
	@CollectionTable(name ="question_options", joinColumns=@JoinColumn(name="question_id"))
	private List<String> Options;

	@OneToOne(mappedBy ="questionmaster",cascade = CascadeType.MERGE)
	@JsonIgnore
	private QuestionOption questionOption;
	
	public enum ResponseType{
		Single_Option, Multiple_Option;
	}
	public boolean  isSingleOptions() {
		return responsetyep == responsetyep.Single_Option;
	}
	public boolean isMultipleOption() {
		return responsetyep == ResponseType.Multiple_Option;
	
	}
}
