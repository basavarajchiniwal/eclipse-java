package com.xworkz.impl;

import com.xworkz.dao.MovieDAO;
import com.xworkz.dto.MovieDTO;

public class MovieDAOImpl implements MovieDAO {
//0=dto,1=dto,2=dto,3=dto,4=dto
	private MovieDTO[] movies = new MovieDTO[14];
	private int index;

	@Override
	public boolean create(MovieDTO dto) {

		this.movies[index] = dto;
		System.out.println("Movie is saved," + dto + "into index" + this.index);
		this.index++;
		return true;
	}

}
