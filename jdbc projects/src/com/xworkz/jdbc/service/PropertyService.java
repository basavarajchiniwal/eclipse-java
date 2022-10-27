package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.PropertyDTO;

public interface PropertyService {
	boolean validateAndSave(PropertyDTO dto);
}
