/*Name--> String getFullName(String,String)--> arguments frm main method 
String getFullNameWithAbbrevation(String,String,boolean)*/

class Name
{
	static String getFullName(String fname,String lname)
	{
	String space=" ";
	String fullName=fname+space+lname;
	System.out.println(fullName);
	return fullName;
	
	}
	static String getFullNameWithAbrevation(String fname,String lname,boolean gender)
	{
		String space=" ";
		String fullname=fname+space+lname;
		
		if(gender)
	{
		String getAbrevation="Mr";
		String newName=getAbrevation+fullname;
		System.out.println(newName);
		return fullname;
		
	}
	else
	{
		String getAbrevation="Ms";
		String newName=getAbrevation+fullname;
		System.out.println(newName);
		
		return fullname;
	}
	//return fullname;
	}
	public static void main(String[] getresult)
	{
		String fname=getresult[0];
		String lname=getresult[1];
		//System.out.println(getresult[2]);
		Name.getFullName(fname,lname);
		boolean sex=true;
		Name.getFullNameWithAbrevation(fname,lname,sex);
		
		
	}
}