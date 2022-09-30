/*Bottle--> open(),break1()
invoke break() from open();*/
class Bottle
{
	public static void main(String[] args)			//main class declaration
	{
	open();											//Invoke open() method from main method 
 
	}
	public static void open()						//open() method declaration
	{
	System.out.println("Note: Dont put the bottle open ");	//println method() declaration
	Bottle.break1();						//calling(Invoke) break1()from open() method
															

	}
	public static void break1()					//break1() method declaration
	{
	System.out.println("Broken Bottles Cant fill water");
	}

	}