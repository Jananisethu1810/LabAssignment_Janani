package com.cg.employee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class App
{
	public static void main(String[] args) {
		FileSystemResource resource=new FileSystemResource("beans.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		Employee employee=(Employee)beanFactory.getBean(Employee.class);
		SBU sbu=(SBU)beanFactory.getBean(SBU.class);
		System.out.println("Employee Details");
		System.out.println("----------------------------------");
		System.out.println(employee.toString());
		System.out.println(sbu.toString());
	}
}