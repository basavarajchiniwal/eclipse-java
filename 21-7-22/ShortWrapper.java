class ShortWrapper
{
	public static void main(String[] args)
	{
	
	
		short a=Short.parseShort("45");
		System.out.println(a);
		int g=25;
		short b=Short.parseShort("25",g);
		System.out.println(b);
		
		short f=25;
		short c=Short.reverseBytes(f);
		System.out.println(c);

		short d=Short.decode("256");
		System.out.println(d);
		
		short e=Short.decode("589");
		System.out.println(e);
		
		short i=56;
		short h=Short.decode(i);
		System.out.println(h);
		
		short j=Short.valueOf("45", g);
		System.out.println(j);
		
		
		
		
	}
}