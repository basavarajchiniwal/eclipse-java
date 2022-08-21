package com.xworkz.inheritance.parent;

public class Market {
	String name;
	String owner;
	String place;
	public Market()
	{
		System.out.println("Default contructor");
	}
	public void torisu()
	{
		System.out.println(this.name);
		System.out.println(this.owner);
		System.out.println(this.place);
	}

}
