package com.xworkz.jdbc.repository;

import com.xworkz.jdbc.dto.ProjectorDTO;

public class ProjectorRepImpl implements ProjectorRepository {

	@Override
	public boolean save(ProjectorDTO dto) {
		System.out.println("running save method");
		return true;
	}

}
