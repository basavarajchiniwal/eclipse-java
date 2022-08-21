package com.xworkz.inheritance.child;

import com.xworkz.inheritance.parent.Alcohol;

public class Beer extends Alcohol {
	public Beer(String brandname, double price, String ownername, int manufacturedyear, int expirydate) {
		super.brandname = brandname;
		super.expirydate = expirydate;
		super.manufacturedyear = manufacturedyear;
		super.ownername = ownername;
		super.price = price;
	}

	public Beer() {
		// TODO Auto-generated constructor stub
	}



}
