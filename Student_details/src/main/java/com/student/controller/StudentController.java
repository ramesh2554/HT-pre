package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.student.model.Marks;
import com.student.model.Student;
import com.student.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;

	@Autowired
	private RestTemplate restTemplate;

//	@GetMapping(value = "/Student/{id}" , produces = { MediaType.APPLICATION_PROBLEM_JSON_VALUE })
//	public Student getAllStudentsInfo(@PathVariable("id") Integer studentId) {
//
//		
//		Student student = this.service.getStudent(studentId);
//		List forObject = this.restTemplate.getForObject("http://localhost:8081/Marks/" + studentId ,List.class);
//		ObjectMapper mapper = new ObjectMapper();
//		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
//
//		student.setMarks(forObject);
//		System.out.println(student);
//		return student;
//	}
	//http://localhost:8080/Student/124
	@GetMapping("Student/{id}")
	public Student getAllStudentsInfo(@PathVariable("id") Integer studentId) {

		
		Student student = this.service.getStudent(studentId); // localhost:8081 marks-service
		Marks forObject = this.restTemplate.getForObject("http://localhost:8081/Marks/" + studentId ,Marks.class);
		student.setMark(forObject);
		return student;
	}

	@PostMapping("/addStudent")
	public Integer addStudentInfo(@RequestBody Student student) {

		return service.addStudentInfo(student);
	}

}
