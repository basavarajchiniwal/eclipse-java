package com.xworkz.dtoconcept.paint;

public class SoilGo {

	public static void main(String[] args) {
		SoilDTO soil = new SoilDTO();
		soil.setSand("Marine Sand");
		soil.setColor("Brown");
		SoilDTO soil1 = new SoilDTO();
		soil1.setSand("river sand");
		soil1.setColor("black");
		int code = soil.hashCode();
		if (soil.hashCode() == soil1.hashCode()) {
			System.out.println(soil.equals(soil1));
		} else {
			System.err.println(false);
		}
	}

}
