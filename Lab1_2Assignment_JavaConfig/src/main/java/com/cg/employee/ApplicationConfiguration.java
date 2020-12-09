package com.cg.employee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration   
public class ApplicationConfiguration {

	@Bean
	public Employee employee(){
	    return new Employee();
	}
	
	@Bean
	public SBU sbu() {
	   return new SBU();
	}
}
