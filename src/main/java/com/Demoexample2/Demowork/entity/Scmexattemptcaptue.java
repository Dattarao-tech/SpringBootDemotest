package com.Demoexample2.Demowork.entity;

import java.io.Serializable;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@GenericGenerator(name="native_generator", strategy = "native")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name="examp_attempt_capture")
public class Scmexattemptcaptue{
	
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
//	@GenericGenerator(name="native_generator",strategy = "native")
//	@GeneratedValue(generator = "native_generator")
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="exam_start_time")
	private LocalTime exam_str_time;
	
	@Column(name="exam_end_time")
	private LocalTime exam_end_time;
	
	@Column(name="exam_result")
	private String exam_result;
	
	@Column(name="marks_obtained")
	private int mar_Obtained;
	
	@Column(name="attemp_number")
	private int attemt_number;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="email_id")
	private Student student;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="course_name")
	private Course course;
	
	
}
