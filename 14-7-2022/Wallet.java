class Wallet
{
	static void wallet()
	{
		System.out.println("wallet");
	}
	static void name(String name)
	{
		System.out.println("Wallet Name:" +name);
	}
	static void type(String type1, String type2)
	{
		System.out.println("Type of NewsPaper:" +type1);
		System.out.println("Type of NewsPaper:" +type2);
	}
	static void brands(String brand1, String brand2, String brand3)
	{
		System.out.println("language of NewsPaper:" +brand1);
		System.out.println("language of NewsPaper:" +brand2);
		System.out.println("language of NewsPaper:" +brand3);
	}	
		static void color(String[] color)
	{
		//String [] a = {"Blue","Brown","Black","White"};
		for(int i=0;i<color.length;i++)
		System.out.println("Color Of Wallet:" +color[i]);
	}
	static void purchaseAddress(int number, String street, String area, String city,int pincode)
	{
		System.out.println("Office Number:" +number);
		System.out.println("Street:" +street);
		System.out.println("Area:" +area);
		System.out.println("City:" +city);
		System.out.println("Pincode:" +pincode);
	}
}