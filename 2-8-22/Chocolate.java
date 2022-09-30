/*create class Chocolate
and instances of name,flavour,brand,price variable by creating contructor*/

class Chocolate
{
String name;
String flavour;
String brand;
double price;

Chocolate()
{
	System.out.println("THERE ARE SEVERAL TYPES OF CHOCOLATES LET'S TASTE IT\n");
	
}

Chocolate(String name)
{
	this();
	this.name=name;
	
}
Chocolate(String name,String flavour)
{
	this(name);
	this.flavour=flavour;
	
}
Chocolate(String name,String flavour,String brand)
{
	this(name,flavour);
	this.brand=brand;
	
}
Chocolate(String name,String flavour,String brand,double price)
{
	this(name,flavour,brand);
	this.price=price;
	
}



}
