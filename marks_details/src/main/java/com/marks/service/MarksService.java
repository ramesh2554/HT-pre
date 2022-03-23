package com.marks.service;

import java.util.Optional;

import com.marks.model.Marks;

public interface MarksService {

	public Optional<Marks> getMarks(Integer id);

	public Integer addMarks(Marks marks);
}