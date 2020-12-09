package com.cg.employee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration   
public class EmployeeConfiguration {

	@Bean
	public Employee employee(){
	      return new Employee();
	   }
}
