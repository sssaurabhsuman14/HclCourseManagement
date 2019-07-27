package com.management.course.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.management.course.model.TrainingRequestModel;

@Service
public interface TrainingRequestService {
	
	public TrainingRequestModel createTrainingRequest(TrainingRequestModel model);
	public TrainingRequestModel getTrainingRequest(Long id);
	public List<TrainingRequestModel> getAll(Long id);
	public TrainingRequestModel updateTrainingRequest(TrainingRequestModel model) throws Exception;
	public TrainingRequestModel deleteTrainingRequest(TrainingRequestModel model);

}
