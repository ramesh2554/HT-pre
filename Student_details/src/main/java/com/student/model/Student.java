package com.student.model;



import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_data")
public class Student {

	@Id
	@Column
	private Integer studentId;
	@Column
	private String studentName;
	@Column
	private String studentClass;

	@Embedded
	//@OneToMany(targetEntity=Student.class, mappedBy="marks", fetch=FetchType.EAGER)
//	private List<Marks> marks = new ArrayList<>();
	private Marks mark;
	
	

	public Student() {

	}

	public Student(Integer studentId, String studentName, String studentClass) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentClass = studentClass;
	}

	

	
//	public List<Marks> getMarks() {
//		return marks;
//	}
//
//	public void setMarks(List<Marks> marks) {
//		this.marks = marks;
//	}

	public Marks getMark() {
		return mark;
	}

	public void setMark(Marks mark) {
		this.mark = mark;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

}
