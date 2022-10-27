package com.xworkz.jdbc.go;

import com.xworkz.jdbc.dto.GarageDTO;
import com.xworkz.jdbc.service.GarageService;
import com.xworkz.jdbc.service.GarageServiceImpl;

public class GarageGo {

	public static void main(String[] args) {
		GarageDTO dto = new GarageDTO("DevuGarage", "Darshan", 6,true, "bike");
		System.out.println(dto);

		GarageService garageServiceImpl = new GarageServiceImpl();
		garageServiceImpl.validateAndSave(dto);

	}

}
