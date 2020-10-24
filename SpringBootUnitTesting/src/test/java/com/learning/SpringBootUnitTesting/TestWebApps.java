package com.learning.SpringBootUnitTesting;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class TestWebApps extends SpringBootUnitTestingApplicationTests{
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		mockMvc=MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	
	public void testTeamLead() throws Exception{
		
		mockMvc.perform(get("/getteamLeaddata")).andExcept(status.isOk());
		
	}

}
