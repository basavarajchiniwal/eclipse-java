package com.xworkz.getter;

public class Trainer {
	protected String name;
	protected int experience;
	protected String specialization;

	protected Trainer() {
		System.out.println("default contructor");
	}

	protected Trainer(String name, int experience, String specialization) {
		this.name = name;
		this.experience = experience;
		this.specialization = specialization;
	}

	protected void training() {
		System.out.println("Providing training");
	}

	protected void conductinterview() {
		System.out.println("Trainer will conduct interview");
	}

	protected void coding() {
		System.out.println("coding of programs will learned in class");
	}

}
