package com.xworkz.polymorphism;

public class Automobile {
	public String type;
	public String brand;
	

	double sellAccessories(String name) {
		if (name == "Clutch") {
			System.out.println("Accessories" + name);
			return 456.0d;
		}

		if (name == "Gear") {
			System.out.println("Accessories" + name);
			return 456.0d;
		}
		return 0.0d;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setType(String type) {
		this.type = type;
	}

	protected void torisu() {
		System.out.println(this.type);
		System.out.println(this.brand);
	}

}
