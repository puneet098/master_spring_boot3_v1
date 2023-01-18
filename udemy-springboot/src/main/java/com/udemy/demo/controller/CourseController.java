package com.udemy.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.demo.model.Course;

@RestController
public class CourseController {
	
	//courses
	//Course: id, name, Author
	
	@GetMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1, "Learn AWS", "in28Minutes"),
				new Course(2, "Learn DevOps", "in28Minutes"),
				new Course(3, "Learn Azure", "in28Minutes"),
				new Course(4, "Learn GCP", "in28Minutes")
				);
	}
}
