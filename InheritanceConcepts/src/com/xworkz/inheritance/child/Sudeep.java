package com.xworkz.inheritance.child;

import com.xworkz.inheritance.parent.Actor;

public class Sudeep extends Actor
{
	public String name = "Sudeep";
	public double heightInInches = 6.2;
	public int age = 48;
	public int birthYear = 1973;
	public String birthPlace = "Shivamogga";

	public Sudeep() 
	{
		System.out.println("Constructor of Sudeep");
	}

	public void torisu() {
		System.out.println(this.name);
		System.out.println(this.heightInInches);
		System.out.println(this.age);
		System.out.println(this.birthYear);
		System.out.println(this.birthPlace);
	}

}
