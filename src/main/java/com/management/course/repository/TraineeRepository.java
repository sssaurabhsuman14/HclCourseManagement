package com.management.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.course.entity.Trainee;

@Repository
public interface TraineeRepository extends JpaRepository<Trainee, Long>{

}
