package com.practice.annotationBasedSpring;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	
	public void drive() {
		System.out.println("It is speedy...");
	}

}