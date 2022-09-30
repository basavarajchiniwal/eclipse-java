/*??? passengerName(int id)
return 10 names based on id , id < or id > 0 , INVALID */

class Airport
{
	public static String passengerName(int id)
	{
	String[] name={"Basavaraj","Shivu","Prajwal","Dyamanna","Dada","Abhishek","Santosh","Parashuram","Divya","Sushma"};
	
		for(int a=0;a<=10;a++)
		{
		if(id==a)
		{
			System.out.println(name[id]);
			return "id";
		}
		}
		if(id<0||id>0)
		{
			System.out.println("INVALID");
			return "INVALID";
		}
		return "";
	}
	public static void main(String[] args)
	{
		Airport.passengerName(0);
	}
	

}