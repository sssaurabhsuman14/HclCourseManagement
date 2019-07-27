package com.management.course.serviceImpl;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.management.course.entity.TrainingRequest;
import com.management.course.model.TrainingRequestModel;
import com.management.course.repository.TrainingRequestRepository;

@Service
public class TraineeServiceImpl {

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

}
