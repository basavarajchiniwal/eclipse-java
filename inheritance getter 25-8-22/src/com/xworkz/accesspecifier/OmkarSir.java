package com.xworkz.accesspecifier;

import com.xworkz.getter.Trainer;

public class OmkarSir extends Trainer {
	public OmkarSir() {
		System.out.println("child def contructor");
	}

	public OmkarSir(String name, int experience, String specialization) {
		super(name, experience, specialization);
	}

	@Override
	public void training() {
		System.out.println("Omkar sir will Take class");
		
	}
	
	@Override
	public void conductinterview() {
		System.out.println("Interview will be conducted after Training");
		super.conductinterview();
	}

	@Override
	public void coding() {
		System.out.println("Code done after getting knowledge");
		super.coding();
	}

	public String getName() {
		return "Omkarsir";
	}

	public int getExperience() {
		return 8;
	}

	public String getSpecialization() {
		return super.specialization;
	}
}
