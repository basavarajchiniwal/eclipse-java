package com.xworkz.inheritance.parent;

public class Train {                     //parent class
	public String name = "Namma Matro";
	public int noOfStation = 20;
	public int noOfSeats = 150;
	public String firstStation = "Mejestic";
	public String lastStation = "Banashankri";
	
	public Train() 
	{
		System.out.println("Constructor of train");
	}
	
	public void torisu()
	{
		System.out.println(this.name);
		System.out.println(this.noOfStation);
		System.out.println(this.noOfSeats);
		System.out.println(this.firstStation);
		System.out.println(this.lastStation);
	}
}


