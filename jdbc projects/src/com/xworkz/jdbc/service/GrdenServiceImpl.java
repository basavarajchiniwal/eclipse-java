package com.xworkz.jdbc.service;

import java.util.jar.Attributes.Name;

import com.xworkz.jdbc.dto.GardenDTO;

public class GrdenServiceImpl implements GardenService {

	@Override
	public boolean validateAndSave(GardenDTO dto) {
		String name = dto.getName();
		String area = dto.getArea();
		int noOfChairs = dto.getNoOfChairs();
		int noOfEntrance = dto.getNoOfEntrance();
		boolean exerciseEqp = dto.isExerciseEqp();
		
		if(name!=null && name.length()>5 && name.length()<20) {
			System.out.println("Name is valid");
			if(area!=null && area.length()>6 && area.length()<25) {
				System.out.println("Area is Valid");
			if(noOfChairs!=0 && noOfChairs>=5 && noOfChairs<=15) {
				System.out.println("Number Of Chairs is Valid");
			if(noOfEntrance!=0 && noOfEntrance>1 && noOfEntrance<5) {
				System.out.println("Number Of Entrance is Valid");
			if(exerciseEqp!=false) {
				System.out.println("Exercise Equipment is valid");
			
				System.out.println("All Data are Checked and Saved");
				GardenService gardenService=new GrdenServiceImpl();
				gardenService.validateAndSave(dto);
			}
			else {
				System.err.println("Name is Invalid");
			}
			}else {
				System.err.println("Area is Invalid");
			}
			}else {
				System.err.println("Number of Chairs is Invalid");
			}
		}else {
			System.err.println("Number of Entrance is Invalid");
		}
	}else{

		System.err.println("Exercise Equipment is not Available");
	}
	

	return false;
}}