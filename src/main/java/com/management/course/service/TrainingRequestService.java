package com.management.course.service;

import java.util.List;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.stereotype.Service;

import com.management.course.model.TrainingRequestModel;

@Service
public interface TrainingRequestService {
	
	public TrainingRequestModel createRequest(Long userId, Long courseId) throws ApplicationException;
	public TrainingRequestModel getTrainingRequest(Long id);
	public List<TrainingRequestModel> getAll(Long id);
	public TrainingRequestModel updateTrainingRequest(TrainingRequestModel model) throws Exception;
	public TrainingRequestModel deleteTrainingRequest(TrainingRequestModel model);

}
