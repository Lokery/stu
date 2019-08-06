package com.springboot.stumanage.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;




public interface ExceptionInfoRepository extends JpaRepository<choose, Long> {
	public List<Course> findByusername(String name);
}