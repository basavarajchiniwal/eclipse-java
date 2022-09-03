package com.xworkz.dtoconcept.paint;

public class ClothGo {

	public static void main(String[] args) {
		ClothDto cloth1 = new ClothDto();
		cloth1.getAntiOder();
		cloth1.getAppearance();
		cloth1.getAttractive();
		cloth1.getBreathble();
		cloth1.getBurstingStrength();
		cloth1.setColour("white");
		System.out.println(cloth1.getColour());
		cloth1.getColourResistance();
		cloth1.getCompression();
		cloth1.getDimensionallyStable();
		cloth1.getDrape();
		cloth1.getDurable();
		cloth1.getEasyToDispose();
		cloth1.getEconomical();
		cloth1.getGoodSurfaceTexture();
		cloth1.getLongLastingFit();
		cloth1.getLustre();
		cloth1.getMoistureManagement();
		cloth1.getNonAbsorbent();
		cloth1.getPerspiration();
		cloth1.getQuickDrying();
		cloth1.getRecovery();
		cloth1.getRegistanceToAbrasion();
		cloth1.getRegistanceToMonth();
		cloth1.getRegistanceToSnagging();
		cloth1.getRegustanceToStain();
		cloth1.getSoilResistence();
		cloth1.setType("fabric");
		System.out.println(cloth1.getType());

		int code = cloth1.hashCode();
		System.out.println(code);

		ClothDto cloth2 = new ClothDto();
		cloth2.getAntiOder();
		cloth2.getAppearance();
		cloth2.getAttractive();
		cloth2.getBreathble();
		cloth2.getBurstingStrength();
		cloth2.setColour("white");
		System.out.println(cloth2.getColour());
		cloth2.getColourResistance();
		cloth2.getCompression();
		cloth2.getDimensionallyStable();
		cloth2.getDrape();
		cloth2.getDurable();
		cloth2.getEasyToDispose();
		cloth2.getEconomical();
		cloth2.getGoodSurfaceTexture();
		cloth2.getLongLastingFit();
		cloth2.getLustre();
		cloth2.getMoistureManagement();
		cloth2.getNonAbsorbent();
		cloth2.getPerspiration();
		cloth2.getQuickDrying();
		cloth2.getRecovery();
		cloth2.getRegistanceToAbrasion();
		cloth2.getRegistanceToMonth();
		cloth2.getRegistanceToSnagging();
		cloth2.getRegustanceToStain();
		cloth2.getSoilResistence();
		cloth2.setType("fabric");
		System.out.println(cloth2.getType());

		int code1 = cloth2.hashCode();
		System.out.println(code1);

		if (cloth1.hashCode() == cloth2.hashCode()) {
			cloth1.equals(cloth2);
			System.out.println("is equal");
		} else {
			System.out.println("it is not equal");
		}

	}

}
