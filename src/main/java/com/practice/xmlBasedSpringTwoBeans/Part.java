package com.practice.xmlBasedSpringTwoBeans;

public class Part {
	String rearViewName;
	String nullVotName;
	
	public String getRearViewName() {
		return rearViewName;
	}
	public void setRearViewName(String rearViewName) {
		this.rearViewName = rearViewName;
	}
	public String getNullVotName() {
		return nullVotName;
	}
	public void setNullVotName(String nullVotName) {
		this.nullVotName = nullVotName;
	}
	
	public void functioning() {
		System.out.println("All parts are functioning...");
		System.out.println(getRearViewName() + "  "  + getNullVotName());
	}
	
	

}
