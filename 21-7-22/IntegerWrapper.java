class IntegerWrapper
{
public static void main(String[] args) //static int	bitCount(int i)
{
//String b=args[0];
//int c=Integer.parseInt(b);
int a=Integer.bitCount(78);  //Returns the number of one-bits in the two's complement binary representation of the specified int value.
System.out.println(a);

int d=Integer.compare(10,59);          //static int	compare(int x, int y)
System.out.println(d);               //Compares two int values numerically.

int e=Integer.compareUnsigned(58,65); //static int	compareUnsigned(int x, int y)
System.out.println(e);                //Compares two int values numerically treating the values as unsigned.

int f=Integer.decode("58");
System.out.println(f);

int g=Integer.divideUnsigned(5,50);       
System.out.println(g); 

int h=Integer.hashCode(60);     
System.out.println(h);   

int i=Integer.highestOneBit(89);    
System.out.println(i);

int j=Integer.lowestOneBit(56);       
System.out.println(j);

int k=Integer.max(56,47);       
System.out.println(k);  

int l=Integer.min(89,53);     
System.out.println(l);

int m=Integer.numberOfLeadingZeros(28);
System.out.println(m);
       
         
		 

}



}