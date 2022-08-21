package com.xworkz.inheritance.parent;

public class Alcohol{

		public String brandname;
		public double price;
		public String ownername;
		public int manufacturedyear;
		public int expirydate;

		public void torisu() {
			System.out.println(this.brandname);
			System.out.println(this.expirydate);
			System.out.println(this.manufacturedyear);
			System.out.println(this.ownername);
			System.out.println(this.price);
	}
}
