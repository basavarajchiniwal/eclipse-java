class GetProgram
{
public static void main(char[] args)
{
	System.out.println("\ngetPriceOfVegetables\n");
int a=Vegetables.getPriceOfVegetables("Tomato");


String b=Vegetables.getVegetableByPrice(20);
System.out.println("\ngetVegetableByPrice\n");
//System.out.println(Vegetables.getPriceOfVegetables("Chickpea"));
System.out.println(a);


System.out.println(b);

}

}