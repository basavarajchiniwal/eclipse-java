class NullPointerException
{
	public static void main (String [] args)
	{
		
		Demo demo = null;
		if(demo != null)
		{
			System.out.println(demo.name);
		}
		else
		{
			System.out.println("default");
		}
		demo.setName ("ge");
		
		//System.out.println(demo.name);
	}
}