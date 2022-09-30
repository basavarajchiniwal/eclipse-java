/*?? ticketPrice(String place), return price based on price 
Least 10 places */

class Airplane
{
	public static float ticketPrice(String place)
	{
		String[] placeName={"USA","India","Uk","Canada","Itally","Japan","China","Russia","Newyork","Ukraine","Dubai"};
	
		int[] price={100000,74800,58900,97500,45000,56000,38000,75000,80000,55000,45746};
		for(int i=0;i<10;i++)
		{
			if(placeName[i]==placeName[i])//USA==USA
			{
			
				System.out.println("place Name: "+placeName[i]+"\nPrice: "+price[i]);
				//return 2.5f;
			}
			else
			{
				System.out.println("place of Price are not matched ");
			}
		}
		return 5;
	}
	public static void main(String[] args)
	{
		
		//	String placeId=
		
		
		Airplane.ticketPrice("India");
		

		
	}
}