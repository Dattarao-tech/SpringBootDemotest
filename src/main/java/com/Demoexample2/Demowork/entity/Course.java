package com.Demoexample2.Demowork.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name="course")
public class Course{
	
	@Id
	@Column(name="course_name",nullable=false)
	private String course_name;

	@Column(name="enabled_from_date")
//	@CreationTimestamp
//	@Temporal(TemporalType.DATE)
	private Date enabled_from_date;
	@Column(name="enabled_to_date")
	private Date enabled_to_date;
//	@Temporal(TemporalType.DATE)
//	@CreationTimestamp
	@Column(name="enabled")
	private boolean enabled;
	@Column(name="completion_duration_in_days")
	private int completion_duration_in_days;
	@Column(name="fee_amount")
	private long fee_amount;
	@Column(name="max_exam_attempts")
	private int max_exam_attempts;
	
	@OneToOne(mappedBy="course")
	@JsonIgnore
	private Subject subject;
	
}
