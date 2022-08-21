package com.xworkz.inheritance.parent;

public class Cycle {
	public String name = "Pulsar";
	public String company = "Bajaj";
	public int noOfWheels = 2;
	public int noOfSeats = 2;
	public int price = 140000;
	
	public Cycle() 
	{
		System.out.println("Constructor of cycle");
	}
	
	public void torisu()
	{
		System.out.println(this.name);
		System.out.println(this.company); 
		System.out.println(this.noOfWheels); 
		System.out.println(this.noOfSeats); 
		System.out.println(this.price); 
	}
	

}

