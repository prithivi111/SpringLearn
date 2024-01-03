package com.practice.xmlBasedSpringTwoBeans;

import org.springframework.stereotype.Component;

@Component
public abstract class Car implements Vehicle{
	
	public void drive() {
		System.out.println("It is speedy...");
	}

}
