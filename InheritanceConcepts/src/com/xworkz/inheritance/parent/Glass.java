package com.xworkz.inheritance.parent;

public class Glass {
	public String mirrorFrameColor = "Brown";
	public String mirrorFrameMaterial = "Wood";
	public int lengthInInche = 20;
	public int breadthInInche = 6;
	public int price = 400;

	public Glass() {
		System.out.println("Constructor of glass");
	}

	public void torisu() {
		System.out.println(this.mirrorFrameColor);
		System.out.println(this.mirrorFrameMaterial);
		System.out.println(this.lengthInInche);
		System.out.println(this.breadthInInche);
		System.out.println(this.price);
	}
}
