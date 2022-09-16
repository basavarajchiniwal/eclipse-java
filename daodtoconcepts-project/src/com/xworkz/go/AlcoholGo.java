package com.xworkz.go;

import com.xworkz.dao.AlcoholDAO;
import com.xworkz.dao.MovieDAO;
import com.xworkz.dto.AlcoholDTO;
import com.xworkz.impl.AlcoholDAOImpl;
import com.xworkz.impl.MovieDAOImpl;

public class AlcoholGo {

	public static void main(String[] args) {
		AlcoholDTO dto = new AlcoholDTO();
		dto.setName("Blender's Pride Whisky");
		dto.setBrand("Johnnie Walker");
		dto.setQty(180);
		dto.setColor("golden brown");
		dto.setSoluble("Soluble IN water");
		dto.setBoilingPt("Boiling point is 173.1F");
		dto.setAcidity("Acidity:10.3 ");
		dto.setOxidation("Oxidation is happens");
		dto.setDehydration(true);
		dto.setFlammable(true);
		dto.setMiscible(true);
		dto.setTypes(7);
		dto.setAlcoholicContent(35.50);
		dto.setLiquidRoomTemp(true);
		dto.setFattyAcid(true);

		AlcoholDAO dao = new AlcoholDAOImpl();
		dao.save(dto);
	}

}
