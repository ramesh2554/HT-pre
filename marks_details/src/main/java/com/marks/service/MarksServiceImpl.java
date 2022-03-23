package com.marks.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marks.model.Marks;
import com.marks.repo.MarksRepo;

@Service
public class MarksServiceImpl implements MarksService{

	

	@Autowired
	MarksRepo repo;
	
//	List<Marks> list = List.of(
//			new Marks(1, 60, 60, 60, 60));
	
	public Optional<Marks> getMarks(Integer id) {
		
		Optional<Marks> findById = repo.findById(id);
		
		if(findById.isPresent()){
			return findById;
		}else {
			return Optional.empty();
		}
//		return list.stream().
//				filter(m->m.getStudentId().equals(id)).findAny().orElse(null);
	}

	public Integer addMarks(Marks marks) {
		Marks save = repo.save(marks);
		return save.getStudentId();
	}
	


}
