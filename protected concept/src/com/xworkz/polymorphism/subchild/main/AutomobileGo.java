package com.xworkz.polymorphism.subchild.main;

import com.xworkz.polymorphism.HondaAutomobile;
import com.xworkz.polymorphism.subchild.TataAutomobile;

public class AutomobileGo {

	public static void main(String[] args) {
		System.out.println("HonadaAutomobile is inherited by Automobile");
		HondaAutomobile honda = new HondaAutomobile(10.00, 6.30);
		honda.setBrand("Hero");
		honda.setType("Two Wheeler");

		honda.torisu();
		System.out.println("TataAutomobile is inherited by Automobile");
		TataAutomobile tata = new TataAutomobile();
		tata.setBrand("Tata Motors");
		tata.setType("Four Wheeler");
		tata.torisu();

	}

}
