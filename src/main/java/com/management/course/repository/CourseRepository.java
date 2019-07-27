package com.management.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.course.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
