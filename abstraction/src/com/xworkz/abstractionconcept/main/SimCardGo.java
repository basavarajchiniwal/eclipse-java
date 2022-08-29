package com.xworkz.abstractionconcept.main;

import com.xworkz.abstractionconcept.SimCard;
import com.xworkz.abstractionconcept.postpaid.PostPaid;
import com.xworkz.abstractionconcept.prepaid.Prepaid;

public class SimCardGo {

	public static void main(String[] args) {
	//	Prepaid.call();
		SimCard prepaid=new Prepaid();
		//prepaid.call();
		prepaid.checkBalance();
		//prepaid.network();
		prepaid.smsService();
		Prepaid con = (Prepaid)prepaid;  //type casting
		con.display();
		System.out.println("Post Paid Class Properties");
		PostPaid postpaid=new PostPaid();
		postpaid.call();
		postpaid.checkBalance();
		postpaid.smsService();
		postpaid.network();
		System.out.println("Type Casting");
		
		
		
		
	}

}
