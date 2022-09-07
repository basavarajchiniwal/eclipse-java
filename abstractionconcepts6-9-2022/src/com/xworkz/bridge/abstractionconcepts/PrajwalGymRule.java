package com.xworkz.bridge.abstractionconcepts;

public class PrajwalGymRule implements GymRule {

	@Override
	public boolean wearShoes() {
		System.out.println("running wearshoes");
		return true;
	}

	@Override
	public boolean uniSex() {
		System.out.println("running Unisex");
		return true;
	}

	@Override
	public double fees() {
		System.out.println("running fees");
		return 400;
	}
	

}
