package com.practice.xmlBasedSpringTwoBeans;

public class Bike implements Vehicle {
	
	private String gear;
	
	private Part parts;
	
	public String getGear() {
		return gear;
	}
	public void setGear(String gear) {
		this.gear = gear;
	}
	
	public void drive() {
		System.out.println("It is running ok..");
		}
		
	public Part getParts() {
		return parts;
	}
	public void setParts(Part parts) {
		this.parts = parts;
	}
	public void display() {
		System.out.println("The gear of the bike is: " + getGear());
		System.out.println("The parts of the bike is: " + parts.getNullVotName() + " | " + parts.getRearViewName() );
	}
}
