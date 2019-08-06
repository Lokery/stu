package com.springboot.stumanage.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
public interface CourseRepository extends CrudRepository<Course, Long>{
	 public List<Course> findByusername(String name);
}
