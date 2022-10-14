package com.xworkz.jdbc.go;

import com.xworkz.jdbc.dto.GardenDTO;
import com.xworkz.jdbc.service.GardenService;
import com.xworkz.jdbc.service.GrdenServiceImpl;

public class GardenGo {

	public static void main(String[] args) {
		GardenDTO dto = new GardenDTO("Nanda Gokul", "BTM LAYOUT", 5, 8, true);
		System.out.println(dto);
		GardenService gardenService = new GrdenServiceImpl();
		gardenService.validateAndSave(dto);

	}

}
