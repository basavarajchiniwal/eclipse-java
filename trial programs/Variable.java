class Variable
{
static int a=45;
int i=10;
public static void main(String[]args)
{
int b=25;
Variable obj=new Variable();
System.out.println("Static variable"+a);
System.out.println("instance Variable"+obj.i);
System.out.println("local variable"+b);
}
}