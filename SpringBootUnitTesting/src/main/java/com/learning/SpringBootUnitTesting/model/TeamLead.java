
package com.learning.SpringBootUnitTesting.model;

public class TeamLead {
	
	private String teamLeadId;
	private String teamLeadName;
	private String designation;
	private double salary;
	
	public TeamLead() {
		
	}

	public String getTeamLeadId() {
		return teamLeadId;
	}

	public void setTeamLeadId(String teamLeadId) {
		this.teamLeadId = teamLeadId;
	}

	public String getTeamLeadName() {
		return teamLeadName;
	}

	public void setTeamLeadName(String teamLeadName) {
		this.teamLeadName = teamLeadName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "TeamLead [teamLeadId=" + teamLeadId + ", teamLeadName=" + teamLeadName + ", designation=" + designation
				+ ", salary=" + salary + "]";
	}
	
	

}
