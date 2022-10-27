package com.xworkz.jdbc.repository;

import com.xworkz.jdbc.dto.GarageDTO;

public class GarageRepImpl implements GarageRepository {

	@Override
	public boolean save(GarageDTO garageDTO) {
		System.out.println("running save method");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("data connected");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("data");

		}
		return true;
	}

}
