package com.cg.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);    
        SBU sbu=(SBU)ctx.getBean(SBU.class);
        System.out.println("SBU Details");
		System.out.println("----------------------");
        System.out.println(sbu.toString());
    }
}
