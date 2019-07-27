package com.management.course.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.course.model.ResponseData;
import com.management.course.model.TrainingRequestModel;
import com.management.course.service.TraineeService;


@RestController
@RequestMapping(value="/training")
public class TraineeController {

	@Autowired
	TraineeService traineeService;
	@PostMapping("/request/{userId}/{courseId}")
	public ResponseEntity<ResponseData> requestTraining(@PathVariable(value="userId") Long userId, @PathVariable(value="courseId") Long courseId){

		Map<Integer, String> map = new HashMap();
		TrainingRequestModel trainingRequestModel  = traineeService.createRequest(userId, courseId);
		ResponseData response = new ResponseData("Request created for the training. ", map, trainingRequestModel);

		return new ResponseEntity<ResponseData>(response, HttpStatus.OK);	
	}
}
