package com.udemy.demo.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insertQry();
		repository.insert(new Course(4,"Learn AWS 01","Ranga"));
		//repository.delete(1);
		System.out.println(repository.findById(1));
		System.out.println(repository.findById(3));
	}

}
