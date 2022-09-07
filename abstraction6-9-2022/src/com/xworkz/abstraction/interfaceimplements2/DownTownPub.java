package com.xworkz.abstraction.interfaceimplements2;

public class DownTownPub {
	private PubRule rule;

	public DownTownPub(PubRule rule) {
		this.rule = rule;
	}

	boolean checkRules() {
		System.out.println("rules are checking");
		boolean dress = rule.dressCodeFollowed();
		int age = rule.age();
		boolean valid = rule.validProof();
		if (dress && valid && age > 21) {

			System.out.println("All Rules are checked");
		} else {
			System.err.println("All rules are not checked");
		}
		return true;
	}
}