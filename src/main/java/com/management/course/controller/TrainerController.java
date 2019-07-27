package com.management.course.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.course.model.CourseRequestModel;
import com.management.course.service.CourseRequestService;

@RestController
@RequestMapping("/trainer")

public class TrainerController {
	
	@Autowired
	CourseRequestService courseRequestService;
	
	@PostMapping
	public CourseRequestModel trainerAction() {
		
		return null;
		
	}

}
