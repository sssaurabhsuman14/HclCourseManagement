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
@Table(name="training_request")
public class TrainingRequest implements Serializable{

	private static final long serialVersionUID = 2245141740406254782L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "training_request_id")
	private Long trainingRequestId;
	
	@Column(name = "trainee_id", nullable=false)
	private Long traineeId;
	
	@Column(name = "trainer_id", nullable=false)
	private Long trainerId;
	
	@Column(name = "course_id", nullable=false)
	private Long courseId;
	
	@Column(name = "status", nullable=false)
	private String status;
	
	@Column(name = "time_slot", nullable=false)
	private String timeSlot;

}
