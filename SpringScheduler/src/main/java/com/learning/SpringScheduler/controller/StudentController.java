package com.learning.SpringScheduler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learning.SpringScheduler.model.Student;
import com.learning.SpringScheduler.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;
	
	
	@RequestMapping(value="listPagable",method=RequestMethod.GET)
	Page<Student> studentPageable(Pageable pageable){
		return studentRepository.findAll(pageable);
	}

}
