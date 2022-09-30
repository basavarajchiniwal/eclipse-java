/*1.Create instance of string by calling all constructors 
2. Invoke least 15 instance methods of String 
3. Invoke least 5 static methods of String */
import java.nio.charset.Charset;
class InvokeConstructor
{
	public static void main(String[] args)
	{
		String string=new String();
		System.out.println(string);
		
		
		//String(byte[] bytes) 
        byte[] bytes = "Welcome to Java".getBytes(); 
for(int y=0;y<bytes.length;y++)
{
	System.out.println(bytes[y]);
}
		//converting byte to string
		String string1=new String(bytes);
		System.out.println(string1);
		
	//String(byte[] bytes, Charset charset)
		
		byte[] bytes1 ={65,66,67,68};
		String string2=new String(bytes1);
		System.out.println(string2);
		
		//String(byte[] bytes, int offset, int length)
		String string3=new String(bytes1,1,3);
		System.out.println(string3);
		
	 //String(byte[] bytes, int offset, int length, String charsetName)
	  byte[] bytes5 = "basavaraj".getBytes();
	 String string4=new String(bytes1,Charset.forName("ISO-8859-1"));
	 System.out.println(string4);
		
	}
}
