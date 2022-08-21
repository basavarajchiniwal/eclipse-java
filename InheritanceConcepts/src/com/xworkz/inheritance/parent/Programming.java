package com.xworkz.inheritance.parent;

public class Programming {
	public String javaInventedBy = "James Gosling";
	public int javastartedYear = 1991;
	public int javaPublishedYear = 1995;
	public String typeOflanguage = "Programming Language";
	public boolean easySoftware = true;

	public Programming() {
		System.out.println("Constructor of programming");
	}

	public void torisu() {
		System.out.println(this.javaInventedBy);
		System.out.println(this.javastartedYear);
		System.out.println(this.javaPublishedYear);
		System.out.println(this.typeOflanguage);
		System.out.println(this.easySoftware);
	}
}
