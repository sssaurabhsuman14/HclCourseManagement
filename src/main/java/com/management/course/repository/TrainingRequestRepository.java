package com.management.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.course.entity.TrainingRequest;

public interface TrainingRequestRepository extends JpaRepository<TrainingRequest, Long>{

}
