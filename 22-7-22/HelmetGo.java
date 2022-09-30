class HelmetGo
{
	public static void main(String[] args)
	{
		System.out.println("Passing values as a Default\n");
		 byte helmetTypes=Helmet.helmetTypes;
		 System.out.println(helmetTypes);
		 int priceOfHelmet=Helmet.priceOfHelmet;
		 System.out.println(priceOfHelmet);
		 boolean isoHallmark=Helmet.isoHallmark;
		 System.out.println(isoHallmark);
		 int fineOfRto=Helmet.fineOfRto;
		 System.out.println(fineOfRto);
		 String frontDriverHelmet=Helmet.frontDriverHelmet;
		 System.out.println(frontDriverHelmet);
		 String secondSeatPassenger=Helmet.secondSeatPassenger;
		 System.out.println(secondSeatPassenger);
		 String madeUpOfHelmet=Helmet.madeUpOfHelmet;
		 System.out.println(madeUpOfHelmet);
		 boolean protectHelmet=Helmet.protectHelmet;
		 System.out.println(protectHelmet);
		 String sloaganForHelmet=Helmet.sloaganForHelmet;
		  System.out.println(sloaganForHelmet);
		 float ratings=Helmet.ratings;
		 System.out.println(ratings);
		 int origin=Helmet.origin;
		 System.out.println(origin);
		 String invented=Helmet.invented;
		  System.out.println(invented);
		  String firstUsedBy=Helmet.firstUsedBy;
		    System.out.println(firstUsedBy);
			
			System.out.println("\nRe-Assigning of values\n");
			
			Helmet.helmetTypes=3;
			System.out.println(Helmet.helmetTypes);
			Helmet.priceOfHelmet=1500;
			 System.out.println(Helmet.priceOfHelmet);
			 Helmet.isoHallmark=true;
			  System.out.println(Helmet.isoHallmark);
			  Helmet.fineOfRto=1000;
			  System.out.println(Helmet.fineOfRto);
			  Helmet.frontDriverHelmet="Mandatory";
			  System.out.println( Helmet.frontDriverHelmet);
			  Helmet.secondSeatPassenger="Hlaf or Full  helmet is Mandatory";
			  System.out.println( Helmet.secondSeatPassenger);
			  Helmet.madeUpOfHelmet="Polycarbonate Helmet";
			  System.out.println( Helmet.madeUpOfHelmet);
			  Helmet.protectHelmet=true;
			  System.out.println(  Helmet.protectHelmet);
			  Helmet.sloaganForHelmet="Keep safe And wear a helmet.";
			  System.out.println(  Helmet.sloaganForHelmet);
			  Helmet.ratings=6.5f;
			  System.out.println(  Helmet.ratings);
			  Helmet.origin=1914;
			   System.out.println(  Helmet.origin);
			   Helmet.invented="Dr. Eric Gardner";
			   System.out.println(    Helmet.invented);
			    Helmet.firstUsedBy="English cricketer Dennis Amiss";
				 System.out.println( Helmet.firstUsedBy);
		 
	}

}