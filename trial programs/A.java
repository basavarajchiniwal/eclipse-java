public class A  
{  
    static int m=100;//static variable  
    void method var(int a)  
    {    
        int n=90;//local variable 
		System.out.println(n);
    }  
    public static void main(String args[])  
    {  
        int data=50;//instance variable 
		System.out.println(data);		
		
		A.var=10;
			System.out.println(var);
    }  
	/*m=50;
	System.out.println(m);*/
}//end of class   
