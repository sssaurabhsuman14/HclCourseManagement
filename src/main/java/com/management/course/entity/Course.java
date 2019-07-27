package com.management.course.entity;

import java.io.Serializable;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="course")
public class Course implements Serializable{

	private static final long serialVersionUID = 1748422858878809338L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_id")
	private Long courseId;
	
	@Column(name = "course_name", nullable=false)
	private String courseName;
	
	@Column(name = "course_time", nullable=false)
	private LocalTime courseTime;

}
