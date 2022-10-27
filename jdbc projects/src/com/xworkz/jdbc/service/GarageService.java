package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.GarageDTO;

public interface GarageService {
	boolean validateAndSave(GarageDTO garageDTO);
}
