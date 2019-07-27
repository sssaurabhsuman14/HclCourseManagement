package com.management.course.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.management.course.entity.TrainingRequest;
import com.management.course.exception.ApplicationException;
import com.management.course.model.TrainingRequestModel;
import com.management.course.repository.TrainingRequestRepository;
import com.management.course.service.TrainingRequestService;

@Service
@ComponentScan(basePackages="com.management.course.serviceImpl")

public class TrainingRequestServiceImpl implements TrainingRequestService {
	
	@Autowired
	TrainingRequestRepository trainingRequestRepository;

	public TrainingRequest createRequest(Long userId, Long courseId, Long trainerId)  {
		TrainingRequest trainingRequest = new TrainingRequest();
		TrainingRequestModel trainingRequestModel = new TrainingRequestModel();

		if(!ObjectUtils.isEmpty(userId) && !ObjectUtils.isEmpty(courseId)) {

			trainingRequest.setCourseId(courseId);
			trainingRequest.setStatus("Pending");
			trainingRequest.setTimeSlot("");
			trainingRequest.setTraineeId(userId);
			trainingRequest.setTrainerId(trainerId);
			//trainingRequest.setTrainingRequestId(trainingRequestId);
			trainingRequestRepository.save(trainingRequest);

			BeanUtils.copyProperties(trainingRequest, trainingRequestModel);
			return trainingRequest;
		}
		return trainingRequest;
	}

	@Override
	public TrainingRequestModel getTrainingRequest(Long id) {
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


	@Override
	public List<TrainingRequestModel> getAllPendingRequestByTrainerId(Long trainerId) throws ApplicationException {
		List<TrainingRequestModel> requestModelList = new ArrayList<>();
		List<TrainingRequest> requestList = new ArrayList<>();
		Optional<List<TrainingRequest>> findByTrainerIdOptional = trainingRequestRepository.findByTrainerIdAndStatus(trainerId, "PENDING");
		
		boolean isOptionalPresent = findByTrainerIdOptional.isPresent();
		if(isOptionalPresent)
		{
			requestList = findByTrainerIdOptional.get();
			requestModelList = mappingModelToEntityList(requestList, requestModelList);
		}
		else
		{
			throw new ApplicationException("No Pending Request found", null);
		}
		return requestModelList;
	}

	private List<TrainingRequestModel> mappingModelToEntityList(List<TrainingRequest> requestList,
			List<TrainingRequestModel> requestModelList) 
	{
		
		for(TrainingRequest request: requestList)
		{
			TrainingRequestModel requestModel = new TrainingRequestModel();
			BeanUtils.copyProperties(request, requestModel);
			requestModelList.add(requestModel);
		}
		return requestModelList;
	}

}
