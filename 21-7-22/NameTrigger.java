/*Write a program to take info of person from main method argument and print on console

Collect 
name,email,age,area

Print Eligible for voting if age > 18
Print Eligible for Marriage if age > 21

Write Program to use least 10 methods of each wrapper class 
8 Main Methods --> Wrapper --> 10 methods*/ 

class NameTrigger
{
public static void main(String[] parse)
{
	//System.out.println("got four args");
	if(parse.length>=4)
	{
		String name=parse[0];
		String email=parse[1];
		String age=parse[2];
		String area=parse[3];
		System.out.println(name);
		System.out.println(email);
		System.out.println(age);
		System.out.println(area);
		
		int no=Integer.parseInt(age);
		System.out.println(no);
		if(no>=18)
		{
			System.out.println("Eligable for voting");
		}
		if(no>=21)
		{
			System.out.println("Eligable for marriage");
		}
	}
	else
	{		
		System.err.println("out of args");
	}
		

}

}
