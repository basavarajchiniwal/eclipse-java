package com.collection.lamdaExpression.enumclasses;

import java.util.ArrayList;
import java.util.List;

import com.collection.lamdaExpression.HouseDto;

public class HouseDTOImpl {

	public static void main(String[] args) {
		
		//int id, String name, String owner, int noOfFloors, boolean loan, double sqFeet, Type type,
		//OwningType owntype
		HouseDto housedto1=new HouseDto(1, "Levender", "Gagan", 12, true, 1300.00, Type.APARTMENTS, OwningType.OWN);
		HouseDto housedto2=new HouseDto(2,"Brahmakamal","Jagan",13,false,1400.00,Type.VILLA,OwningType.OWN);
		HouseDto housedto3=new HouseDto(3,"Manolasa","Ragav",10,true,1000.00,Type.INDIVIDUAL,OwningType.LEASE);
		HouseDto housedto4=new HouseDto(4,"RaajKamal","Mahesh",5,false,900.00,Type.APARTMENTS,OwningType.RENT);
		HouseDto housedto5=new HouseDto(5,"Vrindavan","Madhav",6,true,790.00,Type.VILLA,OwningType.OWN);
		HouseDto housedto6=new HouseDto(6, "Brigade Utopia", "Basavaraj", 15, false, 47.00, Type.APARTMENTS, OwningType.OWN);
		HouseDto housedto7=new HouseDto(7, "Prestige Finsbury","Raam", 10, true, 25.00, Type.VILLA, OwningType.RENT);
		HouseDto housedto8=new HouseDto(8, "Prestige WaterFord","John",5,true, 7.00,Type.INDIVIDUAL,OwningType.LEASE);
		HouseDto housedto9=new HouseDto(9, "Presige Primrose hills", "David", 8, true, 15.3, Type.APARTMENTS,OwningType.RENT);
		HouseDto housedto10=new HouseDto(10, "Arvind Bel Air", "Karthik", 9, false,3.25,Type.INDIVIDUAL,OwningType.RENT);
	    HouseDto housedto11=new HouseDto(11, "WoodField", "Rohith Sharma", 3, true,20.00, Type.INDIVIDUAL, OwningType.LEASE);
	    HouseDto housedto12=new HouseDto(12, "LakeView","Virendra Sehwag",5, false, 800.0,Type.VILLA,OwningType.LEASE);
	    HouseDto housedto13=new HouseDto(13, "Falcon City", "Pankaj", 3, true, 81.24, Type.VILLA, OwningType.RENT);
	    HouseDto housedto14=new HouseDto(14, "Kew sms", "Prajwal", 16, false,15.00,Type.INDIVIDUAL,OwningType.OWN);
	    HouseDto housedto15=new HouseDto(15, "Kew Gardens", "manoj", 1, false,158.00,Type.VILLA,OwningType.OWN);
	    HouseDto housedto16=new HouseDto(16, "Kew jupeter", "mangya", 12, false,150.74,Type.INDIVIDUAL,OwningType.LEASE);
	    HouseDto housedto17=new HouseDto(17, "Kew supeter", "kothi", 11, true,158.74,Type.INDIVIDUAL,OwningType.OWN);
	    HouseDto housedto18=new HouseDto(18, "Kew sun", "monkey", 16, true,25.74,Type.VILLA,OwningType.OWN);
	    HouseDto housedto19=new HouseDto(19, "Kew moon", "lion", 12, false,30.74,Type.INDIVIDUAL,OwningType.LEASE);
	    HouseDto housedto20=new HouseDto(20, "Kew lake", "tiger", 16, false,80.74,Type.VILLA,OwningType.OWN);
	    
	    
	    List<HouseDto> list = new ArrayList<HouseDto>();
	    list.add(housedto1);
	    list.add(housedto2);
	    list.add(housedto3);
	    list.add(housedto4);
	    list.add(housedto5);
	    list.add(housedto6);
	    list.add(housedto7);
	    list.add(housedto8);
	    list.add(housedto9);
	    list.add(housedto10);
	    list.add(housedto11);
	    list.add(housedto12);
	    list.add(housedto13);
	    list.add(housedto14);
	    list.add(housedto15);
	    list.add(housedto16);
	    list.add(housedto17);
	    list.add(housedto18);
	    list.add(housedto19);
	    list.add(housedto20);
	   // ref ="manoj";
	   // ref2="masu";
	  //ref.compareto(ref2);//-2
	    // basu manoj
	    //manoj masu
	    
	    //return type int // 0//+121//-255
	    //op//fil/sor/sorted method (comparator(int))
	    System.err.println("sort ascending order  by id\n");
	    list.stream().sorted((ref1,ref2)->ref1.getId().compareTo(ref2.getId())).forEach((ref1)->System.out.println(ref1));
	    
	    System.err.println("sort Descending order  by id\n");
	    list.stream().sorted((ref1,ref2)->ref2.getId().compareTo(ref1.getId())).forEach((ref1)->System.out.println(ref1));
	    
	    System.err.println("Sort Ascending By Name\n");
	    list.stream().sorted((ref1,ref2)->ref1.getName().compareTo(ref2.getName())).forEach((ref1)->System.out.println(ref1));
	    
	    
	    System.err.println("Sorting Based on Type by Descending Order\n");
	    list.stream().sorted((ref1,ref2)->ref2.getType().compareTo(ref1.getType())).forEach((ref1)->System.out.println(ref1));
	    
	   
	    System.err.println("sort Descending By SqFeet \n");
	    list.stream().sorted((ref1,ref2)->ref2.getSqFeet().compareTo(ref1.getSqFeet())).forEach((ref1)->System.out.println(ref1));

	    System.err.println("Print all elements with loan and sort descending order by owner\n");
	    list.stream().filter((ref)->ref.getLoan()==true).sorted((ref1,ref2)->ref2.getOwner().compareTo(ref1.getOwner())).forEach((any)->System.out.println(any));
	    
	    System.err.println("Print all elements with loan and sort descending order by owner\n");
	    list.stream().filter((ref)->ref.getLoan()!=true).sorted((ref1,ref2)->ref2.getOwner().compareTo(ref1.getOwner())).forEach((any)->System.out.println(any));
	    
	    System.err.println("Print all elements where Owning Type is Lease\n");
	    list.stream().filter((ref)->ref.getOwntype()==OwningType.LEASE).forEach((ref)->System.out.println(ref));
	    
	    System.err.println("Print all elements where  Type is Apartment\n");
	    list.stream().filter((ref)->ref.getType()==Type.APARTMENTS).forEach((ref)->System.out.println(ref));
	    
	    System.err.println("Print all elements where  Type is Villa\n");
	    list.stream().filter((ref)->ref.getType()==Type.VILLA).forEach((ref)->System.out.println(ref));
	    
	    System.err.println("Print all elements order by  Type and owning type in Ascending Order\n");
	    list.stream().sorted((m1,m2)->{
		int m=	m1.getType().compareTo(m2.getType());
		if(m==0) {
		return	m1.getOwntype().compareTo(m2.getOwntype());
			
		}	
		return m;		
		}).forEach((ref)->System.out.println(ref));
	    
		System.err.println("Print all elements order by name and descending by id\n");
		list.stream().sorted((m1,m2)->{
			int m=	m2.getName().compareTo(m1.getName());
			if(m==0) {
			return	m2.getId().compareTo(m1.getId());
				
			}	
			return m;		
			}).forEach((ref)->System.out.println(ref));

	    		}
}
