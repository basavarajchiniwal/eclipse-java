class Reassignvar                           //declaration of class
{                         
   public static void main(String[] args)       //declaration of methods
  {     
   byte a=10;                                  //declaration of variable
        a=50;                                   //Re-assign of variable
    System.out.println(a);                       //statements
   byte b=50;
	    b=10;
    System.out.println(b);
   byte c=(byte)(a+b);
	    
	System.out.println(c);
   byte d=10*5;
	    d=50*2;
	System.out.println(d);   
   byte e=5/5;
        e=50/10;
    System.out.println(e);   		
  }			  
}