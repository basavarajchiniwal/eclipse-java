package com.xworkz.impl;

import com.xworkz.dao.AlcoholDAO;
import com.xworkz.dto.AlcoholDTO;

public class AlcoholDAOImpl implements AlcoholDAO {
	private AlcoholDTO[] alcohol = new AlcoholDTO[14];
	private int index;

	@Override
	public boolean save(AlcoholDTO dto) {

		this.alcohol[index] = dto;
		System.out.println("Alcohol is saved," + dto + "into index" + this.index);
		this.index++;
		return true;
	}

}
