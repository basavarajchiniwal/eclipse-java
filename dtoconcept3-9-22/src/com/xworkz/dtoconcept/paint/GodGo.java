package com.xworkz.dtoconcept.paint;

public class GodGo {

	public static void main(String[] args) {
		GodDto god = new GodDto();
		god.setMission("Moksha");
		god.setMystry("Invisible");
		GodDto god1 = new GodDto();
		god1.setMission("Moksha");
		god1.setMystry("Invisible");
		int code = god.hashCode();
		System.out.println(code);
		if (god.hashCode() == god1.hashCode()) {
			System.out.println(god.equals(god1));
		} else {
			System.err.println(false);
		}

	}

}
