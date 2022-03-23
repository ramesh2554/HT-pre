package com.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.model.Marks;
import com.student.model.Student;

@Repository
public interface StudentsRepo extends JpaRepository<Student, Integer>{

	Student findByStudentId(Integer id);
}
