package com.xworkz.inheritance.parent;

public class Monkey {
	public String skinColor = "Brown";
	public int heightInInch = 6;
	public int weight = 68;
	public int noOfHands = 2;
	public int noOfLegs = 2;

	public Monkey() {
		System.out.println("Constructor of monkey");
	}

	public void torisu() {
		System.out.println(this.skinColor);
		System.out.println(this.heightInInch);
		System.out.println(this.weight);
		System.out.println(this.noOfHands);
		System.out.println(this.noOfLegs);
	}
}
