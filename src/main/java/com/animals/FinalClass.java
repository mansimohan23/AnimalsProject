package com.animals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		
	
	
	Set<Dogs>sdog = new HashSet<Dogs>(dogs);
	Set<Tigers>sTiger = new HashSet<Tigers>(tiger);
	Set<Rabbits>sRabbit = new HashSet<Rabbits>(rabbit);
	System.out.println("\n");
    System.out.println(sdog);
	System.out.println("\n");
	System.out.println(sTiger);
	System.out.println("\n");
	System.out.println(sRabbit);
	
	
	Map<Integer,Dogs> mapD = new HashMap<Integer,Dogs>();
	Map<Integer,Tigers> mapT = new HashMap<Integer,Tigers>();
	Map<Integer,Rabbits> mapR = new HashMap<Integer,Rabbits>();
	
	mapD.put(1,new Dogs("white",4,"Lab","Carnivorous",30.0,"Average Strength","domestic"));
	mapD.put(2,new Dogs("brown",4,"Pug","Carnivorous",35.0,"Average Strength","domestic"));
	mapT.put(3, new Tigers("Cheetah","Africa","Fastest","Carnivorous",120.0,"High Strength","wild"));
	mapR.put(4,new Rabbits("White","Herbivorous",10.0,"Low Strength","domestic"));
	mapR.put(5,new Rabbits("Black","Herbivorous",10.0,"Low Strength","domestic"));
	
	System.out.println("\n");
    System.out.println(mapD);
	System.out.println("\n");
	System.out.println(mapT);
	System.out.println("\n");
	System.out.println(mapR);

	}
}
