class LongWrapper
{
	public static void main(String[] args)//long
	{
		long a=Long.decode("23");
		System.out.println(a);
		long b=Long.getLong("45",568751l);
		System.out.println(b);
		long c=Long.valueOf(546453l);
		System.out.println(c);
		int d=Long.compare(45454546l,121512l);
		System.out.println(d);
		long e=Long.getLong("1245l",4565245454l);
		System.out.println(e);
		long f=Long.valueOf("456",10);
		System.out.println(f);
		String g=Long.toBinaryString(4546652l);
		System.out.println(g);
		long h=Long.reverseBytes(4578555l);
		System.out.println(h);
		String i=Long.toOctalString(216546114l);
		System.out.println(i);
		int j=Long.signum(45845892l);
		System.out.println(j);
	}
}