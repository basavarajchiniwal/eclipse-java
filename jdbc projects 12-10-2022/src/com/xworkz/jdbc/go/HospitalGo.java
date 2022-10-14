package com.xworkz.jdbc.go;

import com.xworkz.jdbc.dto.HospitalDTO;
import com.xworkz.jdbc.service.HospitalService;
import com.xworkz.jdbc.service.HospitalServiceImpl;

public class HospitalGo {

	public static void main(String[] args) {
		HospitalDTO hos = new HospitalDTO(1, "Aashraya Hsopital", "Kurudagi", "Surgeon", 1994);
		System.out.println(hos);
		HospitalService service = new HospitalServiceImpl();
		service.validateAndSave(hos);

	}
}
