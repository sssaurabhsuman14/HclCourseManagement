package com.management.course.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.management.course.exception.ApplicationException;
import com.management.course.model.TrainerModel;
import com.management.course.model.TrainingRequestModel;

@Service
public interface TrainerService {

	public TrainerModel createTrainer(TrainerModel model);
	public TrainerModel getTrainer(Long id);
	public List<TrainerModel> getAll(Long id);
	public TrainerModel updateTrainer(TrainerModel model);
	public TrainerModel deleteTrainer(TrainerModel model);
	
	public List<TrainingRequestModel> getAllPendingRequest(Long trainerId) throws ApplicationException;
	public TrainingRequestModel updateTrainingRequestModelByTrainer(TrainingRequestModel model) throws Exception;
}
