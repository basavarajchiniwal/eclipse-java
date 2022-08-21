package com.xworkz.inheritance.parent;

public class Rubber {
	public String shape = "Round";
	public String color = "Green";
	public int price = 90;
	public String madeCountry = "India";
	public String Type = "Tennis Ball";

	public Rubber() {
		System.out.println("Constructor of Rubber");
	}

	public void torisu() {
		System.out.println(this.shape);
		System.out.println(this.color);
		System.out.println(this.price);
		System.out.println(this.madeCountry);
		System.out.println(this.Type);
	}
}
