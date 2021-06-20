package com.animals;


public class Dogs extends ParentAnimal {
	private String colour;
	private int noOfLegs;
	private String breed;
	public Dogs() {
		super();
		
	}
	public Dogs(String type, double speed, String strength, String behaviour) {
		super(type, speed, strength, behaviour);
		
	}
	public Dogs(String colour, int noOfLegs, String breed,String type, double speed, String strength, String behaviour) {
		super(type, speed, strength, behaviour);
		this.colour = colour;
		this.noOfLegs = noOfLegs;
		this.breed = breed;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getNoOfLegs() {
		return noOfLegs;
	}
	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	@Override
	public String toString() {
		return "Dog [colour=" + colour + ",noOfLegs=" + noOfLegs + ",breed=" + breed +
				super.toString() ;
	}
}
	
