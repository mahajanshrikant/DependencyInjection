package com.learning.SpringScheduler.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="")
public class Student {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long studentId;
	private String name;
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + "]";
	}
	
	
	

}
