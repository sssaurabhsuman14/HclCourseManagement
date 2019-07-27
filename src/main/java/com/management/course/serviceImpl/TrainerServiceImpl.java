package com.management.course.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.course.entity.TrainingRequest;
import com.management.course.exception.ApplicationException;
import com.management.course.model.TrainerModel;
import com.management.course.model.TrainingRequestModel;
import com.management.course.service.TrainerService;
import com.management.course.service.TrainingRequestService;

@Service
public class TrainerServiceImpl implements TrainerService{
	
	@Autowired
	TrainingRequestService trainingRequestService;

	@Override
	public TrainerModel createTrainer(TrainerModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TrainerModel getTrainer(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TrainerModel> getAll(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TrainerModel updateTrainer(TrainerModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TrainerModel deleteTrainer(TrainerModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TrainingRequestModel updateTrainingRequestModelByTrainer(TrainingRequestModel model) throws Exception {
		return trainingRequestService.updateTrainingRequest(model);
	}

	@Override
	public List<TrainingRequestModel> getAllPendingRequest(Long trainerId) throws ApplicationException 
	{
		return trainingRequestService.getAllPendingRequestByTrainerId(trainerId);
		
	}

}
