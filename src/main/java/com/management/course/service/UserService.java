package com.management.course.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.management.course.model.UserModel;

@Service
public interface UserService {

	public UserModel createUser(UserModel model);
	public UserModel getUser(Long id);
	public List<UserModel> getAll(Long id);
	public UserModel updateUser(UserModel model);
	public UserModel deleteUser(UserModel model);
	
}
