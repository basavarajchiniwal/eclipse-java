package com.xworkz.maintrainer;

import com.xworkz.accesspecifier.OmkarSir;
import com.xworkz.getter.Trainer;

public class TrainerGo  {

	public static void main(String[] args) {
		//Trainer trainer=new Trainer(); due its protected 
		
		OmkarSir om=new OmkarSir();
		om.conductinterview();
		om.coding();
		om.training();
		System.out.println(om.getName());
        System.out.println(om.getExperience());
	System.out.println(om.getSpecialization());
	
	}

}
