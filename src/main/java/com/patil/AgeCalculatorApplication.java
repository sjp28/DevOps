package com.patil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.patil.service.CalculateAge;

@SpringBootApplication
public class AgeCalculatorApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(AgeCalculatorApplication.class, args);		
		
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(AgeCalculatorApplication.class);
	}

}
