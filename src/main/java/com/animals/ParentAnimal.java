package com.animals;

public class ParentAnimal {
	private String type;
	private double speed;
	private String strength;
	private String behaviour;
	
	public ParentAnimal() {
		super();
		
	}
	public ParentAnimal(String type, double speed, String strength, String behaviour) {
		super();
		this.type = type;
		this.speed = speed;
		this.strength = strength;
		this.behaviour = behaviour;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
	public String getBehaviour() {
		return behaviour;
	}
	public void setBehaviour(String behaviour) {
		this.behaviour = behaviour;
	}
	@Override
	public String toString() {
		return ",type=" + type + ",speed=" + speed + ",strength=" + strength + ",behaviour=" + behaviour
				;
	}
}
