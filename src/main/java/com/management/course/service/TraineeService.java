package com.management.course.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.management.course.model.TraineeModel;

@Service
public interface TraineeService {

	public TraineeModel createUser(TraineeModel model);
	public TraineeModel getUser(Long id);
	public List<TraineeModel> getAll(Long id);
	public TraineeModel updateUser(TraineeModel model);
	public TraineeModel deleteUser(TraineeModel model);
	
}
