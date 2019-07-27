package com.management.course.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class TrainingRequestModel implements Serializable{

	private static final long serialVersionUID = 468325764667369918L;

	private Long trainingRequestId;

	private Long traineeId;

	private Long trainerId;

	private Long courseId;

	private String status;

	private String timeSlot;


}
