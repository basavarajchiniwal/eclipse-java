package com.xworkz.inheritancetypecast4;

public class TouchPad extends Keyboard 
{
	public String company;
	public boolean working;
	public String type;

	public TouchPad(String company, boolean working, String type) 
	{
		super(2540, "black", 104);
		this.company = company;
		this.working = working;
		this.type = type;
		super.color = color;
		super.noOfKeys = noOfKeys;
		super.price = price;
	}

	public void torisu() 
	{
		System.out.println(this.company);
		System.out.println(this.price);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.color);
		System.out.println(this.noOfKeys);
		System.out.println("==============");
	}

}
