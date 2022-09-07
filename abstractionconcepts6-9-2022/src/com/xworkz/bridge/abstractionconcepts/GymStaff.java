package com.xworkz.bridge.abstractionconcepts;

public class GymStaff {
//using association
	private GymRule gymrule;

	public GymStaff(GymRule gymrule) {
		this.gymrule = gymrule;
		System.out.println("Running GymStaff constructor");

	}

	public void checkRules() {
		boolean shoes = gymrule.wearShoes();
		boolean unisex = gymrule.uniSex();
		double fees = gymrule.fees();
		if (shoes && unisex && fees > 400) {
			System.out.println("Allowed");
		} else {
			System.err.println("not allowed");
		}

	}

}
