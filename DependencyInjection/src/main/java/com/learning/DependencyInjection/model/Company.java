package com.learning.DependencyInjection.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	
	
	private int employeeId;
	private String employeeName;
	private String employeeTeamName;
	
	@Autowired
	private Techanology techanology;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeTeamName() {
		return employeeTeamName;
	}
	public void setEmployeeTeamName(String employeeTeamName) {
		this.employeeTeamName = employeeTeamName;
	}
	
	
	
	public void display() {
		System.out.println("Object returned sucessfully");
		techanology.tech();
	}
	@Override
	public String toString() {
		return "Company [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeTeamName="
				+ employeeTeamName + "]";
	}
	
	

}
