package com.xworkz.inheritancetypecast5;

public class FruitGo {

	public static void main(String[] args) {

		Mango mango = new Mango("yellow", true, "parabolic");
		mango.torisu();

		Fruit fruit = new Mango("yellow", true, "parabolic");
		Mango convert = (Mango) fruit;
		convert.fruitName = "orange";
		convert.taste = "sour";
		convert.season = "winterseason";
		convert.torisu();
	}

}
