package com.management.course.serviceImpl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.course.entity.TrainingRequest;
import com.management.course.model.TrainingRequestModel;
import com.management.course.repository.TrainingRequestRepository;
import com.management.course.service.TrainingRequestService;

@Service
public class TrainingRequestServiceImpl implements TrainingRequestService {
	
	@Autowired
	TrainingRequestRepository trainingRequestRepository;

	@Override
	public TrainingRequestModel createTrainingRequest(TrainingRequestModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TrainingRequestModel getTrainingRequest(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TrainingRequestModel> getAll(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TrainingRequestModel updateTrainingRequest(TrainingRequestModel model) throws Exception {
		
		if(model != null) {
			TrainingRequest entity = new TrainingRequest();
			BeanUtils.copyProperties(model, entity );
			trainingRequestRepository.save(entity);
		}else {
			throw new Exception("TrainingRequest Entity not saved ... Please try later !!! ");
		}
		
		
		
		return null;
	}

	@Override
	public TrainingRequestModel deleteTrainingRequest(TrainingRequestModel model) {
		// TODO Auto-generated method stub
		return null;
	}

}
