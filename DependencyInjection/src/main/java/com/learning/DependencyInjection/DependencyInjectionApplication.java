package com.learning.DependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.learning.DependencyInjection.model.Company;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=	SpringApplication.run(DependencyInjectionApplication.class, args);
		
		Company c=context.getBean(Company.class);
		c.display();
	}

}
