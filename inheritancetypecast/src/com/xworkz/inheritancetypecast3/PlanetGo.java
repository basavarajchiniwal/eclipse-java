package com.xworkz.inheritancetypecast3;

public class PlanetGo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Earth earth = new Earth(8, true, true);
		earth.torisu();

		Planet planet = new Earth(8, true, true);
		Earth converted = (Earth) planet;

		converted.planetName = "mars";
		converted.planetRadius = 67531;
		converted.shapeOfPlanet = "spherical";
		converted.torisu();
	}

}
