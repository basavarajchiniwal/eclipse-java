package com.xworkz.InheritanceOverriding;

public class Cricket {
	String country;
	String captain;
	boolean gender;

	Boolean entertainment() {
		System.out.println("Cricket is Enatertainment Game");
		return false;
	}

	double presentation() {
		System.out.println("parent class Cricket presentation ");
		return 0.0d;
	}

	public void setCountry(String nation) {
		this.country = nation;
	}

	public void setCaptain(String leader) {
		this.captain = leader;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

}
