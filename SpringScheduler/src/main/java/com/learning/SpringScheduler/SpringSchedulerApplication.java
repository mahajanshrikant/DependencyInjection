package com.learning.SpringScheduler;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication

public class SpringSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSchedulerApplication.class, args);
	}

	@Scheduled(fixedRate=1000L)
	public void someJob() throws InterruptedException {
		System.out.println("now is "+new Date());
		Thread.sleep(1000L);
	}
	
	
}
