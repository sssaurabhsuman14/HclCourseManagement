package com.management.course.repository;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.course.entity.TrainingRequest;

@Repository
@ComponentScan(basePackages="com.management.course.repository")
public interface TrainingRequestRepository extends JpaRepository<TrainingRequest, Long>{

}
