package com.marks.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marks.model.Marks;
import com.marks.service.MarksService;

@RestController
public class markController {

	@Autowired
	MarksService service;
	//http://localhost:8081/Marks/124
	@GetMapping("/Marks/{id}")
	public Optional<Marks> getMarksByID(@PathVariable("id") Integer studentId) {
		
		return service.getMarks(studentId);
	}
	
	@PostMapping("/addMarks")
	public Integer addMarks(@RequestBody Marks marks) {
		return service.addMarks(marks);
	}
}
