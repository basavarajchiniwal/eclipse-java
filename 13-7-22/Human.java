/*Human-->
eat(String item,double time);
sleep(double start,double end);
burnCalories();
run(double distance);
invoke run() from burnCalories();

Invoke All methods in a main method*/

class Human
{
	public static void eat(String start,double end)
	{
	System.out.println("Eating is start"+start);
	System.out.println(end);
	}
	static void burnCalories()
	{
	//System.out.println("walking is reduce Calories");
	run(6.3d);
	}
	static void run(double distance)
	{
	System.out.println("daily atleast 5 kilo meter"+distance);
	}
	public static void main(String[] args)
	{
		String tt="tesst";
		eat(tt,5564.5d);
		burnCalories();
		run(4.5d);
		
	}

}