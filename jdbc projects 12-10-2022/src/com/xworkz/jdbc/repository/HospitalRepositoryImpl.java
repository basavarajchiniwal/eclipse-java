package com.xworkz.jdbc.repository;

import com.xworkz.jdbc.dto.HospitalDTO;

public class HospitalRepositoryImpl implements HospitalRepository {

	@Override
	public boolean save(HospitalDTO dto) {
		System.out.println("Running Save Method To Repository");
		return true;
	}

}
