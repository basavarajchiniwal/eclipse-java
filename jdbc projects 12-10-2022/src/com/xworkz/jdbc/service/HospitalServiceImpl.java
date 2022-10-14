package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.HospitalDTO;
import com.xworkz.jdbc.repository.HospitalRepository;
import com.xworkz.jdbc.repository.HospitalRepositoryImpl;

public class HospitalServiceImpl implements HospitalService {
	//HospitalService basu=new HospitalService(); 
//	{
//		
//		@Override
//		public boolean validateAndSave(HospitalDTO dto) {
//			return false;
//		}
//	};

	@Override
	public boolean validateAndSave(HospitalDTO dto) {
		int id = dto.getId(); //int id;
		String name = dto.getName();
		String founder = dto.getFounder();
		int since = dto.getSince();
		String Specialization = dto.getSpecialization();

		if (id > 0 && id < 1000) {
			System.out.println("Id is valid");
			if (name != null && name.length() > 5 && name.length() < 50) {
				System.out.println("Name is valid");
				if (since > 1990 && since <= 2022) {
					System.out.println("Since year is valid");
					if (Specialization != null && Specialization.length() > 5 && Specialization.length() <= 50) {
						System.out.println("Specialization is valid");
						if (founder != null && founder.length() > 3 && founder.length() < 50) {
							System.out.println("founder is valid");
							System.out.println("all properties are checked and Save Successfull");
					
							HospitalRepository hospitalRepository = new HospitalRepositoryImpl();
							hospitalRepository.save(dto);
						} else {
							System.err.println("founder is invalid");
						}
					} else {
						System.err.println("Specialization is invalid");
					}
				} else {
					System.err.println("name is not valid");
				}
			} else {
				System.err.println("Id is not valid");
			}
		}

		return false;

	}
}
