package com.xworkz.inheritance.parent;

public class Wood {
	public String companyName = "Sigma";
	public String color = "Brown";
	public int lengthInMm = 965;
	public int breadthInMm = 67;
	public int price = 1200;

	public Wood() {
		System.out.println("Constructor of wood");
	}

	public void torisu() {
		System.out.println(this.companyName);
		System.out.println(this.color);
		System.out.println(this.lengthInMm);
		System.out.println(this.breadthInMm);
		System.out.println(this.price);
	}
}
