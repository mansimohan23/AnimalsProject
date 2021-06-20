package com.animals;


public class Rabbits extends ParentAnimal {
	String colour;
	public Rabbits() {
		super();
		
	}
	public Rabbits(String type, double speed, String strength, String behaviour) {
		super(type, speed, strength, behaviour);
		
		

}
	public Rabbits(String colour,String type, double speed, String strength, String behaviour) {
		super(type, speed, strength, behaviour);
		this.colour = colour;
		
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Rabbit [colour=" + colour + " " + super.toString();
	}

}