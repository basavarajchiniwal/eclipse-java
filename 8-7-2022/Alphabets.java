/*write a program and declare array of char's store all characters in small case 
1:Access all elements in Forward Direction 
2:Access all elements in Backward Direction*/

class Alphabets 
{
	public static void main(String[] args)
	{
		char[] alphabets={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r',
						's','t','u','v','w','x','y','z'};
						int b;
						System.out.println("Forward Order Of Alphabets");
						for(b=0;b<alphabets.length;b++)
						{
							System.out.println(alphabets[b]);
						}
						System.out.println("Reverse Order Of Alphabets");
						for(b=alphabets.length-1;b>=0;b--)
						{
							System.out.println(alphabets[b]);
						}
	}
}