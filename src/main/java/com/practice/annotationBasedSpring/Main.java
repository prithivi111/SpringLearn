package com.practice.annotationBasedSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("xmlAnnotationBased.xml");

		Vehicle obj = (Vehicle) context.getBean("bike");
		obj.drive(); 
			
		 
	}

	
	
}
