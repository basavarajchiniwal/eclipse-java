package com.xworkz.go;

import com.xworkz.dao.MovieDAO;
import com.xworkz.dto.MovieDTO;
import com.xworkz.impl.MovieDAOImpl;

public class MovieBugger {

	public static void main(String[] args) {

		MovieDTO dto = new MovieDTO();
		dto.setId(1);
		dto.setName("Sita Ramam");
		dto.setBudget(30);
		String[] actors = { "Mrunal Thakur", "Salmaan", "Rashmika", "Sumanth", "Munna", "Bhai", "Hello" };
		dto.setActors(actors);
		String[] produces = { "Lyca Production" };
		dto.setProducerNames(produces);
		dto.setTypes("Romantic");
		dto.setGrade("U/A Certificate");
		dto.setHit(false);
		dto.setFlop(false);
		dto.setSuperHit(true);
		dto.setProfit(1200);
		dto.setRunning("6 Months");
		dto.setAsstCameraMen("Jhonson Ronaldo");
		dto.setScenes("Romantic");
		dto.setDuration(2.59);
		MovieDAO dao = new MovieDAOImpl();
		dao.create(dto);

	}

}
