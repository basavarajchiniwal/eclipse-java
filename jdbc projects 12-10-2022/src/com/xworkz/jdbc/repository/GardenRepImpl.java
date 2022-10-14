package com.xworkz.jdbc.repository;

import com.xworkz.jdbc.dto.GardenDTO;

public class GardenRepImpl implements GardenRepository {

	@Override
	public boolean save(GardenDTO dto) {
		System.out.println("Running Save Method To Repository");
		return true;
	}

}
