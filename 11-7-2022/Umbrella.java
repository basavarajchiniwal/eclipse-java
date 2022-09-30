/*Umbrella --> protectFromRain(),protectFromSun(),
shut(),open()
invoke open from protectFromRain()
invoke open from protectFromSun()
Invoke protectFromRain() of Umbrella from main method 
Invoke protectFromSun() of Umbrella from main method 
Invoke shut() of Umbrella from main method */

class Umbrella
{
	public static void main(String[] args)
	{
	protectFromRain();
	protectFromSun();
	shut();
	
	}
	static void protectFromRain()
	{
		open();
	}
	static void protectFromSun()
	{
		open();
	}
	static void open()
	{
		System.out.println("OPen Umbrella is protect us From Rain ");
		System.out.println("OPen Umbrella is protect us From Sun ");
	}
	static void shut()
	{
		System.out.println("Umbrella is shutted");
	}


}