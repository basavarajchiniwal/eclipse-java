class InvokeStringMethod
{
	public static void main(String[] args)
	{
		
		String name="Basavaraj ";
		String a=name.toUpperCase();
		System.out.println(a);
		String b=name.trim();
		System.out.println(b);
		boolean c=name.contains("M");
		System.out.println(c);
		String m="mahesh";
		int d=name.compareTo(m);
		System.out.println(d);
		char e=name.charAt(1);
		System.out.println(e);
		int f=name.codePointAt(1);
		System.out.println(f);
		int g=name.codePointCount(0,7);
		System.out.println(g);
		String str="MN";
		String h=name.concat(str);
		System.out.println(h);
		boolean i=name.endsWith(" ");
		System.out.println(i);
		String j=name.replace('g','m');
		System.out.println(j);
		int k=name.length();
		System.out.println(k);
		boolean l=name.matches("Raj");
		System.out.println(l);
		String n=name.intern();
		System.out.println(n);
		boolean p=name.isEmpty();
		System.out.println(p);
		String q=name.substring(0,6);
		System.out.println(q);
		
		
		
	}
}