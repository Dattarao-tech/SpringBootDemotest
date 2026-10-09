package com.Demoexample2.Demowork.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name="student_course_mapping")
public class StudentCourseMapping {
	
	@Id
	@Column(name="mapping_id",nullable=false)
	private String mappingId;
	
	@Column(name="attempt_utilized")
	private int attempt_utilized;
	
	@Column(name="registration_date" ,nullable=false)
//	@CreationTimestamp
//	 @Temporal(TemporalType.DATE)
	private Date registration_date;

	@Column(name="valid_upto_date" ,nullable=false)
//	@CreationTimestamp
//	 @Temporal(TemporalType.DATE)
	private Date valid_upto_date;
	
	@Column(name="fee_payment_status")
	private  String fee_payment_status;
	
	@Column (name="result")
	private String result;
	
	@Column(name="marks_obtained")
	private int marks_obtained;
	
	@Column(name="marks_out_of")
	private int marks_out_of;
	
	@ManyToOne
	@JoinColumn(name="email_id")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name="course_name")
	private Course course;
	
}
