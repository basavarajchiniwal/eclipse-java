package com.xworkz.jdbc.repository;

import com.xworkz.jdbc.dto.GarageDTO;

public class GarageRepImpl implements GarageRepository {

	@Override
	public boolean save(GarageDTO garageDTO) {
		System.out.println("running save method");
		return true;
	}

}
