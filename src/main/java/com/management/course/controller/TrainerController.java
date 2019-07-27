package com.management.course.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.course.entity.TrainingRequest;
import com.management.course.model.ResponseData;
import com.management.course.model.TrainingRequestModel;
import com.management.course.service.TrainerService;

@RestController
@RequestMapping("/trainer")
public class TrainerController {

	@Autowired
	TrainerService trainerService;

	@PostMapping
	public ResponseEntity<ResponseData> updateTrainerAction(@RequestBody TrainingRequestModel model) throws Exception {
		if (model != null) {
			TrainingRequestModel entityModel = trainerService.updateTrainingRequestModelByTrainer(model);
			Map<Integer, String> status = new HashMap<>();
			status.put(200, "SUCCESS");
			ResponseData data = new ResponseData("Action Updated...Thank You", status, entityModel);
			return new ResponseEntity<ResponseData>(data, HttpStatus.OK);
		}

		return new ResponseEntity<ResponseData>(HttpStatus.BAD_GATEWAY);

	}

	@GetMapping("/{id}")
	public ResponseEntity<ResponseData> showAllPendingRequest(@PathVariable("id") Long trainerId) {
		List<TrainingRequest> pendingRequestList = trainerService.getAllPendingRequest(trainerId);
		Map<Integer, String> status = new HashMap<>();
		status.put(200, "SUCCESS");
		ResponseData response = new ResponseData("Hi, Requests for Approval", status, pendingRequestList);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
