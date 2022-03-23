package com.student.service;

import java.util.Optional;

import com.student.model.Student;

public interface StudentService {

	public Student getStudent(Integer id);
	Integer addStudentInfo(Student student);
}