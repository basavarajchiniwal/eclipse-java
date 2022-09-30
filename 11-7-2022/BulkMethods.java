/* Bottle--> open(),break()
invoke break() from open();
Watch--> set(),setAlarm(),setTime()
invoke setAlarm() & setTime() from set();
Declare info of watch in set() 
Umbrella --> protectFromRain(),protectFromSun(),
shut(),open()
invoke open from protectFromRain()
invoke open from protectFromSun()

Invoke open() of Bottle from main method 
Invoke set() of Watch from main method 
Invoke protectFromRain() of Umbrella from main method 
Invoke protectFromSun() of Umbrella from main method 
Invoke shut() of Umbrella from main method */

class BulkMethods
{
	 static void main(String[] args)
	{
	open1();
	Watch.set();
	protectFromRain();
	protectFromSun();
	shut();
		
	}
	static void open1()
	{
		System.out.println("The Bottle is Opened ");
		break1();
	}
	static void break1()
	{
		System.out.println("The broken Watch will not show time");
	}
	/*public static void main(String[] args)
	{
		
			
		
	}*/
	static void set()
	{
		setAlarm();
		setTime();      
		
	}
	static void setAlarm()
	{
		System.out.println("Set the Alarm to go for class");
		System.out.println("Morning Alarm At 6:00 AM \n");
	}
	public static void setTime()
	{
		System.out.println("Method setTime()");
		System.out.println("\n Setting Time for Daily Routine");
		System.out.println("Wake up at 6:00 am");
		System.out.println("Attend the Java Class  at 9:00 am To 11:00 am");
		System.out.println("Refreshening After Java Class  at 11:00 am To 12:00 pm");
		System.out.println("Doing Home Work of Java Class  at 12:00 pm To 2:00 pm");
		System.out.println("Sleepig Time  at 2:00 pm To 5:00 pm");
		System.out.println("Tea Time  at 5:00 pm To 5:30 pm");
		System.out.println("Work Time  at 5:30 pm To 9:00 pm");
		System.out.println("Lunch and Walk TIme at 9:00 pm To 10:30 pm");
		System.out.println("Sleeping Time At 10:30\n ");		

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