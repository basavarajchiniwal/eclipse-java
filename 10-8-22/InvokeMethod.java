class InvokeMethod
{
	public static void main(String[] args)
    {
String str="raj";
		str.toUpperCase();
		String a=str.toUpperCase();
		System.out.println(a);
		String b=str.concat(str);
		System.out.println(b);
		String c=str.intern();
		System.out.println(c);
		//replace(char oldChar, char newChar)
		String string=new String();
		String d=string.replace('a','b');
		System.out.println(d);
			//replace(CharSequence target, CharSequence replacement)
			String e=replace('ba','ab');
			System.out.println(e);
		
	}
}		