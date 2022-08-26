package com.xworkz.invokingmethods.main;

import com.xworkz.invokingmethods.Fish;

public class FishGo {

	public static void main(String[] args) {
		Fish fish = new Fish("Fighter", "Fresh Water");
		System.out.println(fish); // implicitly printing tostring and its runtime poly getClass().getName() + '@'
									// + Integer.toHexString(hashCode())
		Fish fish1 = new Fish("Fighter", "Fresh Water");
		fish = fish1;
		boolean compare = fish.equals(fish);
		System.out.println(compare);
		System.out.println(fish1.breed);
		System.out.println(fish1.type);
	}

}
