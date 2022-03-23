package com.student.model;

import javax.persistence.Embeddable;

@Embeddable
public class Marks {

	
	private Integer Id;

	private Integer english, maths, science, social;

//	private Integer studentId;
	
	public Marks() {
		super();
		// TODO Auto-generated constructor stub
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

	public Marks(Integer marksId, Integer english, Integer maths, Integer science, Integer social) {
		super();
		this.Id = marksId;
		this.english = english;
		this.maths = maths;
		this.science = science;
		this.social = social;
	}

}
