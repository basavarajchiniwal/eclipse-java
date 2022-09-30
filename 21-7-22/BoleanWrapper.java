class BoleanWrapper
{
	public static void main(String[] args) //boolean
	{
		int a=Boolean.compare(true,true);
		System.out.println(a);
		boolean b=Boolean.getBoolean("man");
		System.out.println(b);
		boolean c=Boolean.logicalAnd(true,false);
		System.out.println(a);
		boolean d=Boolean.logicalOr(false,false);
		System.out.println(d);
		boolean e=Boolean.logicalXor(true,false);
		System.out.println(e);
		boolean f=Boolean.parseBoolean("age");
		System.out.println(f);
		String g=Boolean.toString(true);
		System.out.println(g);
		boolean h=Boolean.valueOf("gap");
		System.out.println(h);
		int i=Boolean.hashCode(false);
		System.out.println(g);
	
	}
}