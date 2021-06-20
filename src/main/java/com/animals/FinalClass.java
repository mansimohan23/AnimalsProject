
package com.animals;

import java.util.ArrayList;

import java.util.List;

public class FinalClass {

	public static void main(String[] args) {
		List<Dogs> dogs = new ArrayList<Dogs>();
		List<Tigers>tiger =new ArrayList<Tigers>();
		List<Rabbits>rabbit = new ArrayList<Rabbits>();
		
		dogs.add(new Dogs("white",4,"Lab","Carnivorous",30.0,"Average Strength","domestic"));
		dogs.add(new Dogs("brown",4,"Pug","Carnivorous",35.0,"Average Strength","domestic"));
		tiger.add(new Tigers("Cheetah","Africa","Fastest","Carnivorous",120.0,"High Strength","wild"));
		rabbit.add(new Rabbits("White","Herbivorous",10.0,"Low Strength","domestic"));
		rabbit.add(new Rabbits("Black","Herbivorous",10.0,"Low Strength","domestic"));
		
		System.out.println(dogs + "]");
				
		System.out.println("\n");
		System.out.println(tiger + "]");
		System.out.println("\n");
		System.out.println(rabbit + "]");

	}

}

