/* Watch--> set(),setAlarm(),setTime()
invoke setAlarm() & setTime() from set();
Declare info of watch in set()  */

class Watch
{
	public static void main(String[] args)
	{
		Watch.set();
			
		
	}
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
}