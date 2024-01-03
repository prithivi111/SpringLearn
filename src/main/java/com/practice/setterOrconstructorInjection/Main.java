package com.practice.setterOrconstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("setterOrconstructorInjection.xml");

		Tyre t = (Tyre) context.getBean("Tyre");
		System.out.println(t);
		 
	}

	
	
}
 