package com.management.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.course.entity.TrainingRequest;

@Repository
public interface TrainingRequestRepository extends JpaRepository<TrainingRequest, Long>{

}
