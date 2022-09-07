package com.xworkz.bridge.abstractionconcepts;

public class PrajwalGymGo {

	public static void main(String[] args) {
		// declare interface and implementation
		GymRule gymrule = new PrajwalGymRule();
		// declared

		GymStaff gymStaff = new GymStaff(gymrule);
		gymStaff.checkRules();
	}

}
