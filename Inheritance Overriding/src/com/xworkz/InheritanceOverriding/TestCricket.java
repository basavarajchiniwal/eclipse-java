package com.xworkz.InheritanceOverriding;

public class TestCricket extends Cricket {
	String groundTypes;

	public void setGroundTypes(String groundTypes) {
		this.groundTypes = groundTypes;
	}

	@Override // Annotation
	double presentation() {
		System.out.println("presentation is over rided at TestCricket class");
		return 0.0d;
	}
}
