package com.cg.employee;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cg.employee")
public class ApplicationConfiguration {
	 @Bean(name="empList")
	   public ArrayList<Employee> getEmpList(){
	      Employee employee1=new Employee(101,"Karthik",35000.0, 30);
	      Employee employee2=new Employee(102,"Saravanan",54000.0, 28);
	      Employee employee3=new Employee(103,"Siva",25000.0, 28);

	      ArrayList<Employee> empList=new ArrayList<>();
	      empList.add(employee1);
	      empList.add(employee2);
	      empList.add(employee3);
	      return empList;
	   }
	  
	
	}

