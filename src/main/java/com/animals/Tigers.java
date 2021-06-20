package com.animals;

public class Tigers extends ParentAnimal {

	private String typeT;
	private String place;
	private String characteristics;
	public Tigers() {
		super();
		
	}
	public Tigers(String type, double speed, String strength, String behaviour) {
		super(type, speed, strength, behaviour);
		
	}
	public Tigers(String typeT, String place, String characteristics,String type, double speed, String strength, String behaviour) {
		super(type, speed, strength, behaviour);
		this.typeT = typeT;
		this.place = place;
		this.characteristics = characteristics;
	}
	public String getTypeT() {
		return typeT;
	}
	public void setTypeT(String typeT) {
		this.typeT = typeT;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getCharacteristics() {
		return characteristics;
	}
	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}
	@Override
	public String toString() {
		return "Tiger [type=" + typeT + ", place=" + place + ", characteristics=" + characteristics + " " +
	             super.toString();
	}
	
	
	
}
	
