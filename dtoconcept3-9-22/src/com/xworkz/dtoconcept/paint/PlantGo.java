package com.xworkz.dtoconcept.paint;

public class PlantGo {

	public static void main(String[] args) {

		PlantDto plant1 = new PlantDto();
		plant1.getAmber();
		plant1.getCellName();
		plant1.getCells();
		plant1.getClass();
		plant1.setCommonName("plant");
		System.out.println(plant1.getCommonName());
		plant1.getDivisionName();
		plant1.getDomain();
		plant1.getEcologicalRelationShip();
		plant1.getEffectsOfFreezing();
		plant1.getEncology();
		plant1.getFruits();
		plant1.getGenomics();
		plant1.getGroup();
		plant1.getGrowth();
		plant1.getImportenceOfPlant();
		plant1.getKingdom();
		plant1.getLeaves();
		plant1.getName();
		plant1.getNoOfLivingSpecies();
		plant1.getPlantColour();
		plant1.getRoots();
		plant1.getName();
		plant1.getSeeds();
		plant1.setScientificName("Plantae");
		System.out.println(plant1.getScientificName());

		PlantDto plant2 = new PlantDto();
		plant2.getAmber();
		plant2.getCellName();
		plant2.getCells();
		plant2.getClass();
		plant2.setCommonName("plant");
		System.out.println(plant2.getCommonName());
		plant2.getDivisionName();
		plant2.getDomain();
		plant2.getEcologicalRelationShip();
		plant2.getEffectsOfFreezing();
		plant2.getEncology();
		plant2.getFruits();
		plant2.getGenomics();
		plant2.getGroup();
		plant2.getGrowth();
		plant2.getImportenceOfPlant();
		plant2.getKingdom();
		plant2.getLeaves();
		plant2.getName();
		plant2.getNoOfLivingSpecies();
		plant2.getPlantColour();
		plant2.getRoots();
		plant2.getName();
		plant2.getSeeds();
		plant2.setScientificName("Plantae");
		System.out.println(plant2.getScientificName());

		PlantDto plant3 = new PlantDto();
		plant3.getAmber();
		plant3.getCellName();
		plant3.getCells();
		plant3.getClass();
		plant3.getCommonName();
		plant3.getDivisionName();
		plant3.getDomain();
		plant3.getEcologicalRelationShip();
		plant3.getEffectsOfFreezing();
		plant3.getEncology();
		plant3.getFruits();
		plant3.getGenomics();
		plant3.getGroup();
		plant3.getGrowth();
		plant3.getImportenceOfPlant();
		plant3.getKingdom();
		plant3.getLeaves();
		plant3.getName();
		plant3.getNoOfLivingSpecies();
		plant3.getPlantColour();
		plant3.getRoots();
		plant3.getName();
		plant3.getSeeds();
		plant3.getScientificName();

		PlantDto plant4 = new PlantDto();
		plant4.getAmber();
		plant4.getCellName();
		plant4.getCells();
		plant4.getClass();
		plant4.getCommonName();
		plant4.getDivisionName();
		plant4.getDomain();
		plant4.getEcologicalRelationShip();
		plant4.getEffectsOfFreezing();
		plant4.getEncology();
		plant4.getFruits();
		plant4.getGenomics();
		plant4.getGroup();
		plant4.getGrowth();
		plant4.getImportenceOfPlant();
		plant4.getKingdom();
		plant4.getLeaves();
		plant4.getName();
		plant4.getNoOfLivingSpecies();
		plant4.getPlantColour();
		plant4.getRoots();
		plant4.getName();
		plant4.getSeeds();
		plant4.getScientificName();

		int code = plant2.hashCode();
		System.out.println(code);

		if (plant1.hashCode() == plant2.hashCode()) {
			System.out.println(plant1.equals(plant2));

		} else {
			System.out.println("it is not equals");
		}

	}

}
