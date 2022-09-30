class ChocolateGo
{
public static void main(String[] args)
{
Chocolate chocolate=new Chocolate();
System.out.println("CONSTRUCTOR WITH DEFAULT PARAMETER\n");
System.out.println(chocolate.name);
System.out.println(chocolate.flavour);
System.out.println(chocolate.brand);
System.out.println(chocolate.price);

Chocolate chocolate1=new Chocolate("MILKY BAR");
System.out.println("CONSTRUCTOR WITH ONE PARAMETER\n");
System.out.println(chocolate1.name);
System.out.println(chocolate1.flavour);
System.out.println(chocolate1.brand);
System.out.println(chocolate1.price);

Chocolate chocolate2=new Chocolate("MILKY BAR","BUTTER MILK");
System.out.println("CONSTRUCTOR WITH TWO PARAMETER\n");
System.out.println(chocolate2.name);
System.out.println(chocolate2.flavour);
System.out.println(chocolate2.brand);
System.out.println(chocolate2.price);

Chocolate chocolate3=new Chocolate("MILKY BAR","BUTTER MILK","NESTLE INDIA");
System.out.println("CONSTRUCTOR WITH THREE PARAMETER\n");
System.out.println(chocolate3.name);
System.out.println(chocolate3.flavour);
System.out.println(chocolate3.brand);
System.out.println(chocolate3.price);

Chocolate chocolate4=new Chocolate("MILKY BAR","BUTTER MILK","NESTLE INDIA",35.5d);
System.out.println("CONSTRUCTOR WITH FOUR PARAMETER\n");
System.out.println(chocolate4.name);
System.out.println(chocolate4.flavour);
System.out.println(chocolate4.brand);
System.out.println(chocolate4.price);
}

}