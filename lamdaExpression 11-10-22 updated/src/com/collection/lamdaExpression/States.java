package com.collection.lamdaExpression;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;


public class States {
	

	public static void main(String[] args) {
		List <String> list =new LinkedList<String>();
		//Collections.addAll(list, "Andra Pradesh");
		//addAll(list,"Andra Pradesh");
		list.add("Andra Pradesh");
		list.add("Arunachal Pradesh");
		list.add("Assam");
		list.add("Bihar");
		list.add("Chattirgarah");
		list.add("Goa");
		list.add("Gujarath");
		list.add("Haryana");
		list.add("Hiamchal Pradesh");
		list.add("Jharkand");
		list.add("Karnatak");
		list.add("Kerala");
		list.add("Madhya Pradesh");
		list.add("Maharastra");
		list.add("Manipur");
		list.add("Meghalaya");
		list.add("Mizoram");
		list.add("Nagaland");
		list.add("Odisha");
		list.add("Punjab");
		list.add("Rajasthan");
		list.add("Sikkim");
		list.add("TamilNadu");
		list.add("Telangana");
		list.add("Tripura");
		list.add("Uttarakhand");
		list.add("UttarPradesh");
		list.add("WestBengal");
		
//		stateGroup ref=new stateGroup(); ref of implementation
//	for(String check: list) {
//		System.out.println(list);
//		
//	}
//
//		Consumer<String> check=(ref)->{
//			System.out.println(ref);
//			
//		};
		//display all data
		list.forEach(check->System.out.println("state name:"+check)); 
		
		System.err.println("Printing all states ending with a\n");
		list.stream().filter(ref->ref.endsWith("a")).forEach(ref->System.out.println(ref));
		
		System.err.println("starting with k\n");
		list.stream().filter(ref->ref.startsWith("K")).forEach(ref->System.out.println(ref));
		
		System.err.println("States Contains l\n");
		list.stream().filter(ref->ref.contains("l")).forEach(ref->System.out.println(ref));
		
		System.err.println("States Contains d\n");
		list.stream().filter(ref->ref.contains("d")).forEach(ref->System.out.println(ref));
		
		System.err.println("States Contains r\n");
		list.stream().filter(ref->ref.contains("r")).forEach(ref->System.out.println(ref));
		
		System.err.println("States Contains h\n");
		list.stream().filter(ref->ref.contains("h")).forEach(ref->System.out.println(ref));
		
		System.err.println("States with More then 10 characters\n");
		list.stream().filter(ref->ref.length()>10).forEach(ref->System.out.println(ref));
		
		System.err.println("States with Less then 5 characters\n");
		list.stream().filter(ref->ref.length()<5).forEach( (ref)->System.out.println(ref));
		
		System.err.println("States in Uppercase\n");
		list.stream().filter((ref)->{ref.toUpperCase();return true;}).forEach((ref)->System.out.println(ref.toUpperCase()));
		
		System.err.println("States in LowerCase\n");
		list.stream().forEach((ref)->System.out.println(ref.toLowerCase()));
		
		System.err.println("printing Duplicate cahracters in each state\n");
		list.stream().map(ref->{
			return String.
		}
		
	//	list.stream().filter(ref->if(1==1) {
	//		  char string[] = string1.toCharArray(); 
		}
		
//		HashSet<String> set=new HashSet<String>(list);
//		set.forEach(ref->System.out.println(ref));	
//		
	
	
	
	
//.map(n->n%10)
//				.limit(String.valueOf(list)
//				.length())
//				.reduce(0,(a,b)->a=a*10+b);
//			return false;
//
//    
		
}


