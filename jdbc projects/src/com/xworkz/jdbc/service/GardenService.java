package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.GardenDTO;

public interface GardenService {
	boolean validateAndSave(GardenDTO dto);
}
