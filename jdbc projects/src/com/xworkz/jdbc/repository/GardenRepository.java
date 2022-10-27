package com.xworkz.jdbc.repository;

import com.xworkz.jdbc.dto.GardenDTO;

public interface GardenRepository {
	boolean save(GardenDTO dto);
}
