class FloatWrapper
{
	public static void main(String [] args)
	{
		float a = Float.floatToIntBits(5.26f);
		System.out.println(a);
		float b = Float.intBitsToFloat(5697);
		System.out.println(b);
		boolean c = Float.isFinite(789.58f);
		System.out.println(c);
		boolean d = Float.isNaN(15f);
		System.out.println(d);
		int e = Float.floatToRawIntBits(269.568f);
		System.out.println(e);
		float f = Float.sum(2.4f, 5.6f);
		System.out.println(f);
		String g = Float.toHexString(12.85f);
		System.out.println(g);
		String h = Float.toHexString(89.5f);
		System.out.println(h);
		float i = Float.valueOf("1255");
		System.out.println(i);
		int j = Float.compare(8.2f, 56.1f);
		System.out.println(j);
	}
}