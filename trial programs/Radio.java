class Radio
{
static void  button()
{
System.out.println("4 buttons");
}
static void button(String antenna)
{
//antenna="stainless antenna"
System.out.println(antenna);
}
static void button(float hurtz,boolean network,int price)
{
	System.out.println(hurtz);
	System.out.println(network);
	System.out.println(price);
}
static void button(int rating)
{
	System.out.println(rating);
}
public static void main(String [] args)
{
	button();
	button("stainless steel");
	button(3.5f,true,1500);
}
}
/*same method name with different parameters
(String antenna=)("stainless steel")
method declare     main method value ref to antenna*/