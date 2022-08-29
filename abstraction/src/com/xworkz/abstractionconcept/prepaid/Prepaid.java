package com.xworkz.abstractionconcept.prepaid;

import com.xworkz.abstractionconcept.SimCard;

public class Prepaid extends SimCard{
	@Override
	public  void call() {
		System.out.println("Call Service Available");

	}

	@Override
	public void checkBalance() {
		System.out.println("Balance is Available");
	}

	@Override
	public void smsService() {
	System.out.println("SMS Service Available");	
	}

	@Override
	public void network() {
		System.out.println("Network is Not Available");
	}
	
	public void display()
	{
		System.out.println("display the values");
	}
}
