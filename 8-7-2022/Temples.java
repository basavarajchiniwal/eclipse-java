/*write a class called Temple add Below Static Methods
1: open();
2: close();
3: time();
4: entryFees();
call all above methods in main method*/
class Temples
{
	
	public static void open()
	{
		
	
	System.out.println("          ***** Temples Opening Time *****\n");
	System.out.println(" --> Morning at 04:00 AM");
	System.out.println(" --> Darshan Starts at 05:40 AM\n");
	
	}
  void close()
	{
	System.out.println("          ***** Temples Closing Time *****\n");
	System.out.println(" --> Night at 11:30pm\n");
	
	}
	public static  void time()
	{
	System.out.println("          ***** Aarthi Timings *****\n\n -->Kakad Aarthi 04:30 AM ");
	System.out.println(" --> Mangala Snaan 05:05 AM");
	System.out.println(" --> Aarthi 05:35 AM \n --> Dhuni Pooja At 11:30 AM  ");
	System.out.println(" --> Mid-Day Aarthi At 12:00 PM \n -->Pothi 04:00 PM");
	System.out.println(" --> At Sunset Dhoop Aarthi");
	System.out.println(" --> Shej Aarthi At 10:30 PM \n");
	
	}
	public static void entryFees()
	{
		System.out.println("          ****** Aarthi Fees Chart ***** \n");
	System.out.println(" --> Kakad(Morning) Aarthi Fees INR 600:\n --> Mid-Day Aarthi Fees INR 400 ");
	System.out.println(" --> Shej Aarthi Fees INR 400\n");
	}
}