package com.xworkz.jdbc.go;

import com.xworkz.jdbc.dto.PropertyDTO;
import com.xworkz.jdbc.service.PropertyService;
import com.xworkz.jdbc.service.PropertyServiceImpl;

public class PropertyGo {
	public static void main(String[] args) {
		   
		PropertyDTO dto = new PropertyDTO("Mahesh", 600000, 4, 5,true, true);
		System.out.println(dto);
		
		PropertyService service=new PropertyServiceImpl();
		service.validateAndSave(dto);
	}
}
	