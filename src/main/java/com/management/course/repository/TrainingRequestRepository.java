package com.management.course.repository;

import org.springframework.context.annotation.ComponentScan;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.course.entity.TrainingRequest;

@Repository
@ComponentScan(basePackages="com.management.course.repository")
public interface TrainingRequestRepository extends JpaRepository<TrainingRequest, Long>{
	
	public Optional<List<TrainingRequest>> findByTrainerIdAndStatus(Long trainerId, String status); 

}
