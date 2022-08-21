package com.xworkz.inheritance.parent;

public class Browser {
	String name;
	double version;
	String founder;
	String website;
	int launchyear=2010;

	public Browser() {
		System.out.println("Welcome to Browser");
	}

	public void browser(String name, double version,int launchyear) {
		this.name = name;
		this.version = version;
		this.launchyear=launchyear;


	}

	public Browser(String founder, String website) {
		this.founder = founder;
		this.website = website;

	}

	public void torisu() {
		System.out.println(this.name);
		System.out.println(this.version);
		System.out.println(this.founder);
		System.out.println(this.website);
		System.out.println(this.launchyear);
	}

}
