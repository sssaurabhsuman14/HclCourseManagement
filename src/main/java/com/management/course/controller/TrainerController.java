package com.management.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.course.model.ResponseData;
import com.management.course.model.TrainingRequestModel;
import com.management.course.service.TrainerService;

@RestController
@RequestMapping("/trainer")

public class TrainerController {
	
	
	@Autowired
	TrainerService trainerService;
	
	@PostMapping
	public ResponseEntity<ResponseData> updateTrainerAction(@RequestBody TrainingRequestModel model ){
		trainerService.updateTrainingRequestModelByTrainer(model);
		
		
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/{id}")
	public ResponseEntity<ResponseData> showRequest()
	{
		return new ResponseEntity<>(HttpStatus.OK);
	}
	

}
