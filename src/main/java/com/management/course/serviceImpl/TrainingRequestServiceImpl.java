package com.management.course.serviceImpl;

import java.util.List;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.management.course.entity.TrainingRequest;
import com.management.course.model.TrainingRequestModel;
import com.management.course.repository.TrainingRequestRepository;
import com.management.course.service.TrainingRequestService;

@Service
@ComponentScan(basePackages="com.management.course.serviceImpl")

public class TrainingRequestServiceImpl implements TrainingRequestService {
	
	@Autowired
	TrainingRequestRepository trainingRequestRepository;

	public TrainingRequestModel createRequest(Long userId, Long courseId) throws ApplicationException {
		TrainingRequest trainingRequest = new TrainingRequest();

		if(!ObjectUtils.isEmpty(userId) && !ObjectUtils.isEmpty(courseId)) {

			trainingRequest.setCourseId(courseId);
			trainingRequest.setStatus("Pending");
			trainingRequest.setTimeSlot("");
			trainingRequest.setTraineeId(userId);
			//trainingRequest.setTrainerId();
			//trainingRequest.setTrainingRequestId(trainingRequestId);
			trainingRequestRepository.save(trainingRequest);

			TrainingRequestModel trainingRequestModel = new TrainingRequestModel();
			BeanUtils.copyProperties(trainingRequest, trainingRequestModel);
			return trainingRequestModel;
		} else {
			throw new ApplicationException("", null);
		}
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
