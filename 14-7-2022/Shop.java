class Shop
{
	public static void shopNo()
	{
	System.out.println("No Parameters and No arguments");
	}
	public static void shopName(String name)
	{
	System.out.println("The Shop Nmae is "+name);
	}
	public static void shopPrtners(String partner1,String partner2)
	{
		System.out.println("The Grocery Shop partners Are"+partner1+"\n"+partner2);
		
	}
	public static void shopItemsList(String vegetables,String groceries,String stationaries)
	{
	System.out.println("SHop items lists are"+vegetables+"\n"+groceries+"\n"+stationaries);
	}
	
	public static void shopLedger(int profit,int loss,double investement,short dayProfit )
	{
		System.out.println("monthly profit of shop"+profit);
		System.out.println("monthly loss of shop"+loss);
		System.out.println("monthly investment of shop"+investement);
		System.out.println("monthly dayprofit of shop"+dayProfit);
	}
	public static void shopAddress(byte shopNo1,String landMark,String road,long contact,boolean availability)
	{
		
		System.out.println("shop adress: "+shopNo1);
		System.out.println(road);
		System.out.println(contact);
		
		System.out.println(availability);
		System.out.println(contact);
		
	}
}
