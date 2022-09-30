class ByteWrapper
{
	public static void main(String [] args)
	{
		long a=Byte.valueOf((byte)8);
		System.out.println(a);
		int b=Byte.valueOf((byte)5);
		System.out.println(b);
		byte c=Byte.valueOf("56");
		System.out.println(c);
		//byte d=Byte.valueOf("rat",13);
		//System.out.println(d);
		int e=Byte.hashCode((byte) 9);
		System.out.println(e);
		//byte f=Byte.decode("2154");
		//System.out.println(f);
		int g=Byte.compare((byte) 7, (byte) 8);
		System.out.println(g);
		//byte h=Byte.parseByte("Small");
		//System.out.println(h);
		//byte i=Byte.parseByte("Small", 5);
		//System.out.println(i);
		String j=Byte.toString((byte) 5);
		System.out.println(j);
		char z=Byte.getDirectionality('a');
		System.out.println(z);
		
	}
}