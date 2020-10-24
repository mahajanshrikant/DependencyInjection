package com.learning.SpringBootUnitTesting.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learning.SpringBootUnitTesting.model.TeamLead;

@RestController
public class TestController {
	
	@RequestMapping(value="/getteamLeaddata", method=RequestMethod.GET)
	public TeamLead firstApiTesting() {
		
		TeamLead t=new TeamLead();
		t.setSalary(4500000);
		t.setDesignation("senior tech lead");
		t.setTeamLeadName("Rohit");
		t.setTeamLeadId("1");
		return t;
		
	}
	

}
