package com.example.demo.doesautowiringworkwithoutcomponentannonation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class Config {

	@Bean
	Dependency dependency() {
		return new Dependency();
	}
	
	@Bean
	Dependent dependent() {
		Dependent dependent = new Dependent();
		dependent.setDependency(dependency());
		return dependent;
	}
	
	@Scheduled(fixedRate = 1000L)
	public void allFieldsConstructorInjectionTest() {
		System.err.println("bhai " + dependent().getDependency().method());
	}
	
}
