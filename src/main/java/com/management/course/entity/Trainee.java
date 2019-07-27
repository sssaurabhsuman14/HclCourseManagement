package com.management.course.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="trainee")
public class Trainee implements Serializable{

	private static final long serialVersionUID = 8643223781257414625L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "trainee_id", nullable=false)
	private Long traineeId;
	
	@Column(name = "name", nullable=false)
	private String traineeName;
	
	@Column(name = "password", nullable=false)
	private String password;
	
	@Column(name = "email", nullable=false)
	private String email;
	
	@Column(name = "phone", nullable=false)
	private String phone;
	
}
