package com.xworkz.polymorphism;

public class HondaAutomobile extends Automobile {
	double openTime;
	double closeTime;

	public HondaAutomobile(double openTime, double closeTime) {
		this.openTime = openTime;
		this.closeTime = closeTime;
	}

	@Override
	public void torisu() {
		super.torisu();
		System.out.println(this.openTime);
		System.out.println(this.closeTime);
	}

}
