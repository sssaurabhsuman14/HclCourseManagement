package com.management.course.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="trainer")
public class Trainer implements Serializable
{

	private static final long serialVersionUID = -1345963073652636005L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "trainer_id", nullable=false)
	private Long trainerId;
	
	@Column(name = "name", nullable=false)
	private String traineeName;
	
	@Column(name = "password", nullable=false)
	private String password;
	
	@Column(name = "email", nullable=false)
	private String email;
	
	@Column(name = "phone", nullable=false)
	private String phone;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "course_id")
	private Course course;

}
