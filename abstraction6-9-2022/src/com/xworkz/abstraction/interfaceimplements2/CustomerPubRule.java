package com.xworkz.abstraction.interfaceimplements2;

public class CustomerPubRule implements PubRule {
	@Override
	public int age() {
		System.out.println("Age is above 18");
		return 18;
	}

	@Override
	public boolean dressCodeFollowed() {
		System.out.println("Dress Code is not Mandatory");
		
		return true;
	}

	@Override
	public boolean validProof() {
		System.out.println("Aadhaar Proof is Mandatory");
		return false;
	}

}
