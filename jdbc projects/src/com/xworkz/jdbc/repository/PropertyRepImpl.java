package com.xworkz.jdbc.repository;

import com.xworkz.jdbc.dto.PropertyDTO;

public class PropertyRepImpl implements PropertyRepository {

	@Override
	public boolean save(PropertyDTO dto) {
		System.out.println("Running save to repository");
		return true;
	}

}
