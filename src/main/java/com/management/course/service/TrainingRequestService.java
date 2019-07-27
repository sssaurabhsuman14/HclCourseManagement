package com.management.course.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.management.course.entity.TrainingRequest;
import com.management.course.exception.ApplicationException;
import com.management.course.model.TrainingRequestModel;

@Service
public interface TrainingRequestService {
	
	public TrainingRequest createRequest(Long userId, Long courseId, Long trainerId) ;
	public TrainingRequestModel getTrainingRequest(Long id);
	public List<TrainingRequestModel> getAllPendingRequestByTrainerId(Long id) throws ApplicationException;
	public TrainingRequestModel updateTrainingRequest(TrainingRequestModel model) throws Exception;
	public TrainingRequestModel deleteTrainingRequest(TrainingRequestModel model);

}
