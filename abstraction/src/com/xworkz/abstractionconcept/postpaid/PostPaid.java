package com.xworkz.abstractionconcept.postpaid;

import com.xworkz.abstractionconcept.SimCard;

public class PostPaid extends SimCard{
	@Override
	public void network() {
	System.out.println("Network is Available");
		
	}
@Override
public void smsService() {
	System.out.println("SMS Service is Over");
	
}
@Override
public void checkBalance() {
System.out.println("Balance is 719");	
}
@Override
public void call() {
		System.out.println("Not Reachable");
}
}
