package com.management.course.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.course.model.ResponseData;

@RestController
@RequestMapping("/trainer")

public class TrainerController {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/{id}")
	public ResponseEntity<ResponseData> showRequest()
	{
		return new ResponseEntity<>(HttpStatus.OK);
	}
	

}
