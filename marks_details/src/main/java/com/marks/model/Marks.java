package com.marks.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Marks {

	@Id
	private Integer StudentId;

	private Integer english, maths, science, social;
	
	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}

	
//INSERT INTO `htpra`.`marks` (`student_id`, `english`, `maths`, `science`, `social`) VALUES ('1', '60', '60', '60', '70');
	
	public Marks(Integer studentId, Integer english, Integer maths, Integer science, Integer social) {
		super();
		StudentId = studentId;
		this.english = english;
		this.maths = maths;
		this.science = science;
		this.social = social;
	}



	public Integer getStudentId() {
		return StudentId;
	}



	public void setStudentId(Integer studentId) {
		StudentId = studentId;
	}



	public Integer getEnglish() {
		return english;
	}

	public void setEnglish(Integer english) {
		this.english = english;
	}

	public Integer getMaths() {
		return maths;
	}

	public void setMaths(Integer maths) {
		this.maths = maths;
	}

	public Integer getScience() {
		return science;
	}

	public void setScience(Integer science) {
		this.science = science;
	}

	public Integer getSocial() {
		return social;
	}

	public void setSocial(Integer social) {
		this.social = social;
	}

	
	
}
