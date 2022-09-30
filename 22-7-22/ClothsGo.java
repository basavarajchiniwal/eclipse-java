class ClothsGo
{
	public static void main(String[] args)
	{
	 byte type=Cloths.type;
	 System.out.println(type);
	 
	 byte brands=Cloths.brands;
	 System.out.println(brands);
	 
	 byte styleOfWear=Cloths.styleOfWear;
	 System.out.println(styleOfWear);
	  
	 String officialType=Cloths.officialType;
	 System.out.println(officialType);
	 
	 String bestBrand=Cloths.bestBrand;
	 System.out.println(bestBrand);
	 
	 String mostSelling=Cloths.mostSelling;
	 System.out.println(mostSelling);
	 
	 byte platformToSale=Cloths.platformToSale;
	 System.out.println(platformToSale);
	 
	 short startPrice=Cloths.startPrice;
	 System.out.println(startPrice);
	 
	 short highPrice=Cloths.highPrice;
	 System.out.println(highPrice);
	 
	 
	 System.out.println("Re Assign values");
	 Cloths.type=10;
	 System.out.println( Cloths.type);
	 
	 Cloths.brands=12;
	 System.out.println( Cloths.brands);
	 
	 Cloths.styleOfWear=4;
	 System.out.println( Cloths.brands);
	 
	 Cloths.officialType="Formal Dressing";
	 System.out.println(Cloths.officialType);
	 
	 Cloths.bestBrand="Nika Brand";
	 System.out.println(Cloths.bestBrand);
	 
	 Cloths.mostSelling="jeans";
	 System.out.println( Cloths.mostSelling);
	 
	 Cloths.platformToSale=2;
	 System.out.println( Cloths.platformToSale);
	 
	 Cloths.startPrice=500;
	 System.out.println( Cloths.startPrice);
	 
	 Cloths.highPrice=10000;
	 System.out.println( Cloths.highPrice);
	  
	}

}