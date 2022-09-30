class CharWrapper
{
	public static void main(String [] args)
	{
		int a = Character.charCount(2);
		System.out.println(a);
		char b = Character.forDigit(1, 2);
		System.out.println(b);
		byte c = Character.getDirectionality(7);
		System.out.println(c);
		String d = Character.getName(25);
		System.out.println(d);
		int e = Character.getNumericValue('D');
		System.out.println(e);
		int f = Character.getType('E');
		System.out.println(f);
		int g = Character.hashCode('h');
		System.out.println(g);
		int h = Character.highSurrogate(24);
		System.out.println(h);
		int i = Character.lowSurrogate(20);
		System.out.println(i);
		int j = Character.reverseBytes('d');
		System.out.println(j);
	}


}