package com.xworkz.polymorphism.subchild;

import com.xworkz.polymorphism.Automobile;

public class TataAutomobile extends Automobile {
	public TataAutomobile() {
		super();
		System.out.println("Tata default constructor");
	}

	@Override
	public void torisu() {
		super.torisu();
		System.out.println(this.type);
		System.out.println(this.brand);

	}
}
