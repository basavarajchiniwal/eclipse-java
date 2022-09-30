class InvokeStaticMethod
{
	public static void main(String[] args)
	{
		// static String	valueOf(long b)
		long b=987654321987654l;
		String.valueOf(b);
		System.out.println(String.valueOf(b));
		
		String value1=String.valueOf('S');
		System.out.println(value1);
		
		char[] data={'G','B','D'};
		String value2=String.copyValueOf(data);
		System.out.println(value2);
		
		String value3=String.valueOf(true);
		System.out.println(value3);
		
		String value4=String.valueOf(6.6d);
		System.out.println(value4);
		
		char[] data1={'F','A','N'};
		String value5=String.valueOf(data1,0,2);
		System.out.println(value5);
	}
}