package com.management.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.course.entity.Trainer;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Long>
{

}
