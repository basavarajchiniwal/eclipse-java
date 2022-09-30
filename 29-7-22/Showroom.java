/*"Showroom
CarromBoard
Speaker
Pub
Alcohol


4 properties 
Declare two Constructor in each class 
In Main method init all instance variable 
Least one static property
5 instances "*/
class Showroom
{
	static boolean camera=true;
	String name;
	String type;
	int noOfBikes;
	int noOfMaterials;
	
	 
	Showroom()
	{
		
		System.out.println("Welcome to the Atlas Showroom");
		
	}
	Showroom(float investment,String place,boolean firstService)
	{
		
		
		System.out.println("Total investment is"+investment);
		System.out.println("The Place of Showroom is @ "+place);
		if(firstService=firstService)
		{
			System.out.println("You purchased new Bike @our Showroom");
			System.out.println("First Service will be Free @ our Showroom");
		}
		else
		{
			System.out.println("You have not purchased any Bikes");
		}
	}
	
}
	
