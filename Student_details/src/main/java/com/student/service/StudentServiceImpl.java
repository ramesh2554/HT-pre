package com.student.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.student.model.Student;
import com.student.repo.StudentsRepo;

@Service
public class StudentServiceImpl implements StudentService{

//	List<Student> list = List.of(
//			new Student(1,"Rameswar" , "B.tech"));
	
	@Autowired
	StudentsRepo repo ;

//	public Student getStudent(Integer id) {
	public Student getStudent(Integer id) {
//		return list.stream().filter(s->s.getStudentId().equals(id)).findAny().orElse(null);
		
		Student findByStudentId = repo.findByStudentId(id);
		//Optional<Student> findById = repo.findById(id);
		return findByStudentId;
		
	}
	

	public Integer addStudentInfo(Student student) {
		Student save = repo.save(student);
		return save.getStudentId();
	}

}
