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

import com.management.course.entity.TrainingRequest;
import com.management.course.model.ResponseData;
import com.management.course.service.TrainingRequestService;


@RestController
@RequestMapping(value="/training")
public class TraineeController {

	@Autowired
	TrainingRequestService trainingRequestService;

	@PostMapping("/request/{userId}/{courseId}/{trainerId}")
	public ResponseEntity<ResponseData> requestTraining(@PathVariable(value="userId") Long userId, @PathVariable(value="courseId") Long courseId, @PathVariable(value="trainerId") Long trainerId) {

		Map<Integer, String> map = new HashMap();
		map.put(202, "Request created for course");
		TrainingRequest trainingRequestModel  = trainingRequestService.createRequest(userId, courseId, trainerId);
	
		ResponseData response = new ResponseData("Request created for the training. "+courseId+" ", map, trainingRequestModel);
		return new ResponseEntity<ResponseData>(response, HttpStatus.OK);	
		
	}
}
