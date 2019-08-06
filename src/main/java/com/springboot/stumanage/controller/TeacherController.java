package com.springboot.stumanage.controller;
import com.springboot.stumanage.entity.Course;
import com.springboot.stumanage.entity.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
	 @Autowired
	 private CourseRepository courseRepository;

	 @RequestMapping("/teacher/addcourse")
	 public String addCourse(Course c)
	 {
		 courseRepository.save(c);
	     return "success";
	 }
}
