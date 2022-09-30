class Course
{
	static void course() 
	{
		System.out.println("course");
	}
	static void name(String name)
	{
		System.out.println("course name :"+name);
	}
	static void time(double opentime,double closetime)
	{
        System.out.println("course opening time :"+opentime);
	    System.out.println("course closing time :"+closetime);
	}
	static void college(String location,String address,int pincode)
	{
		System.out.println("college location :"+location);
		System.out.println("college address :"+address);
	    System.out.println("college pincode:"+pincode);
	}
	static void info(String degree,int lectures,int students,long number)
	{
		System.out.println("course type :"+degree);
		System.out.println("no of lectures :"+lectures);
		System.out.println("no of students :"+students);
		System.out.println("contact number :"+number);
	}
	static void branch(String[] branch)
	{
		//String[] a={"CE","IS","EEE","ME","CSE"};
		for(int i=0;i<branch.length;i++)
		System.out.println("Branch namnes:"+branch[i]);
	}
	
	
}