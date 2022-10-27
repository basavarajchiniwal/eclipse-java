package com.xworkz.jdbc.go;

import com.xworkz.jdbc.dto.ProjectorDTO;
import com.xworkz.jdbc.service.ProjectorService;
import com.xworkz.jdbc.service.ProjectorServiceImpl;

public class ProjectorGo {

	public static void main(String[] args) {
		ProjectorDTO dto = new ProjectorDTO("Canon", 13520,"Black","DLP projector", 0.40);
		System.out.println(dto);

		ProjectorService service = new ProjectorServiceImpl();
		service.validateAndSave(dto);
	}

}
