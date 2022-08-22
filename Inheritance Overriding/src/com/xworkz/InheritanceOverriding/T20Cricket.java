package com.xworkz.InheritanceOverriding;

public class T20Cricket extends Cricket {
	String manOfTheMatch;

	public void setManOfTheMatch(String manOfTheMatch) {
		this.manOfTheMatch = manOfTheMatch;
	}

	@Override // Annotation
	Boolean entertainment() {
		System.out.println("Over Rided Entertainment");
		return true;
	}

}
