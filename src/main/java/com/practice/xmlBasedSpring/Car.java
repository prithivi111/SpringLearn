package com.practice.xmlBasedSpring;


public class Car implements Vehicle{
	
	private int seats;
	private String gear;
	
	public Car(int seats, String gear) {
		super();
		this.seats = seats;
		this.gear = gear;
	}
	
	public int getSeats() {
		return seats;
	}

	public String getGear() {
		return gear;
	}

	public void drive() {
		System.out.println("It is speedy...");
	}
	
	public void display() {
		System.out.println(getSeats());
		System.out.println(getGear());
	}
	

}
