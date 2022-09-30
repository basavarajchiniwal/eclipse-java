/*Bag-->
----
carryItems(String[] items)
capacity(double inLiters)
properties(String color,double weight,String type,String brand)
invoke capacity() from properties(..) method*/

class Bag
{
	static void carryItems(String items[])
	{
		
		
		//String items[]={"Books","Compass Box","Pens","Pencils","Tiffin Box","Water Bottle"};
		for(int i=0;i<items.length;i++)
		{
		System.out.println("Bag can carry items like " +items[i]);
		}
	}
	static void capacity(double inLiters)
	{
		System.out.println(inLiters);
		properties("Sky Blue", 6.26,"College Bag","AirCraft");
	}
	static void properties(String color, double weight, String type, String brand)
	{
		System.out.println(color);
		System.out.println(weight);
		System.out.println(type);
		System.out.println(brand);
		
		capacity(2.5D);
	}
	public static void main(String[] args)
	{
		//carryItems(items[i]);
		capacity(2.6D);
		String []a = {"Books","Compass Box","Pens","Pencils","Tiffin Box","Water Bottle"};
		carryItems(a);
		properties("Sky Blue", 6.26,"College Bag","AirCraft");
	}
	


}