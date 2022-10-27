package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.GarageDTO;
import com.xworkz.jdbc.repository.GarageRepository;
import com.xworkz.jdbc.repository.GarageRepImpl;

public class GarageServiceImpl implements GarageService {

	@Override
	public boolean validateAndSave(GarageDTO garageDTO) {
		System.out.println("running validate and save");
		String name = garageDTO.getName();
		String ownerName = garageDTO.getOwnerName();
		int noOfWorkers = garageDTO.getNoOfWorkers();
		boolean service = garageDTO.isService();
		String type = garageDTO.getType();
		if (name != null && name.length() > 5 && name.length() < 20) {
			System.out.println("name is valid");
			if (ownerName != null && ownerName.length() > 5 && ownerName.length() < 20) {
				System.out.println("owner name is valid");
				if (noOfWorkers > 2 && noOfWorkers < 8) {
					System.out.println("noOfWorkers is valid");
					if (service == true) {
						System.out.println("service is there");
						if (type != null && type.length() > 3 && type.length() < 8) {
							System.out.println("valid type");
							System.out.println("all properties are saved successefully" + garageDTO);
							GarageRepository garageRepository=new GarageRepImpl();
							garageRepository.save(garageDTO);

						} else {
							System.err.println("invalid type");
						}

					} else {
						System.err.println("service is not there");
					}
				} else {
					System.err.println("invalid no of workers");
				}

			} else {
				System.err.println("owner name is not valid");
			}
		} else {
			System.err.println("name is invalid");
		}

		return false;
	}

}
