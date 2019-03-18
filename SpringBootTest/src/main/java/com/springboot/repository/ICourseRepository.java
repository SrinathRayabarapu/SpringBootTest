package com.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springcore.bean.Course;

public interface ICourseRepository extends CrudRepository<Course, String>{ //Course and it's Id
	
	public List<Course> findByTopicId(String topicId);
}
