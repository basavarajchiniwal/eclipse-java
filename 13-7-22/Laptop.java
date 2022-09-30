/*Laptop--> 
model(String no)
price(double price)
companyAndMadeIn(String company,String country)*/
class Laptop
{
	static void model(String no)
	{
		System.out.println("Laptop Model no is "+no);
	}
	static void price(double price)
	{
		System.out.println("Laptop Price is "+price);
		
	}
	public static void main(String[] computer)
	{
		model("15TX10563");
		price(68560d);
		
	}
}