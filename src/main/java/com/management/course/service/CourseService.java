package com.management.course.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.management.course.model.CourseModel;

@Service
public interface CourseService {

	public CourseModel createCourse(CourseModel model);
	public CourseModel getCourse(Long id);
	public List<CourseModel> getAll(Long id);
	public CourseModel updateCourse(CourseModel model);
	public CourseModel deleteCourse(CourseModel model);
}
