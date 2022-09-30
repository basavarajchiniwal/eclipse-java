/*Date 
        int day;
        int month;
        int year;
        String day;

*/

	class Date
	{

		int day;
        int month;
        int year;
        String week;	
	Date()
	{
	System.out.println("IN THE YEAR 365 DAYS");
	}
	Date(int day)
	{
		this();
		this.day=day;
		
	}
	Date(int day,int month)
	{this(day);
	this.month=month;
	
	}
	Date(int day,int month,int year)
	{
		this(day,month);
		this.year=year;
	}
	Date(int day,int month,int year,String week)
	{
		this(day,month,year);
		this.week=week;

	}
	
	
	}
	

        