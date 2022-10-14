package com.xworkz.jdbc.service;


import com.xworkz.jdbc.dto.ProjectorDTO;
import com.xworkz.jdbc.repository.ProjectorRepImpl;
import com.xworkz.jdbc.repository.ProjectorRepository;

public class ProjectorServiceImpl implements ProjectorService {

	@Override
	public boolean validateAndSave(ProjectorDTO dto) {
		System.out.println("running validate and save");
		String company = dto.getCompany();
		int prize = dto.getPrize();
		String color = dto.getColor();
		String type = dto.getType();
		double projectionDistance = dto.getProjectionDistance();

		if (company != null && company.length() > 3 && company.length() < 50) {
			System.out.println("company name is valid");
			if (prize > 5000 && prize < 50000) {
				System.out.println("valid prize");
				if (color != null && color.length() > 2 && color.length() < 20) {
					System.out.println("color is valid");
					if (type != null && type.length() > 3 && type.length() < 20) {
						System.out.println("type is valid");
						if (projectionDistance > 0.35 && projectionDistance < 0.65) {
							System.out.println("projectordistance is valid");
							System.out.println("all properties are saved successfully" + dto);
							ProjectorRepository projectorRepository=new ProjectorRepImpl();
							projectorRepository.save(dto);
						} else {
							System.out.println("projectordistance is invalid");
						}
					} else {
						System.err.println("type is invalid");
					}
				} else {
					System.err.println("color is invalid");
				}
			} else {
				System.err.println("invalid prize");
			}
		} else {
			System.err.println("company name is invalid");
		} 	
		return false;
	}

}
