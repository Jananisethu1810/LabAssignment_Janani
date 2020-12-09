package com.cg.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);    
        Employee employee = ctx.getBean(Employee.class);
        employee.setEmployeeId(12345);
        employee.setEmployeeName("Harriet");
        employee.setSalary(40000.0);
        employee.setBusinessUnit("PES-BU");
        employee.setAge(24);
        SBU sbu=ctx.getBean(SBU.class);
        sbu.setSbuCode("PES-BU");
        sbu.setSbuName("Product Engineering Services");
        sbu.setSbuHead("Kiran Rao");
        System.out.println("Employee Details");
		System.out.println("----------------------------------");
		System.out.println(employee.toString());
		System.out.println(sbu.toString());
    }
}
