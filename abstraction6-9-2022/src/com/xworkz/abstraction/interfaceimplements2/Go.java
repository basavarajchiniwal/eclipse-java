package com.xworkz.abstraction.interfaceimplements2;

public class Go {

	public static void main(String[] args) {
		PubRule pubRule = new CustomerPubRule();

		DownTownPub downTownPub = new DownTownPub(pubRule);
		downTownPub.checkRules();

	}
}
