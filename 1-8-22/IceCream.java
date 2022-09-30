/*IceCream
        String flavour;
    double price;
    String type;
    String color;
    String brand;
    double weight;
    double quantity;
    boolean dryFruit;
    boolean goodTaste;
    int since;*/
	class IceCream
	{
	String flavour;
    double price;
    String type;
    String color;
    String brand;
    double weight;
    double quantity;
    boolean dryFruit;
    boolean goodTaste;
    int since;
	
	IceCream()
	{
		
	}
	IceCream(String flavour)
	{
	this();
	this.flavour=flavour;
		
	}
	IceCream(String flavour, double price)
	{
	this(flavour);
	this.price=price;
		
	}
	IceCream(String flavour, double price,  String type)
	{
	this(flavour,price);
	this.type=type;
		
	}
	  	IceCream(String flavour, double price,  String type,String color)
	{
	this(flavour,price,type);
	this.color=color;
		
	}
	  	IceCream(String flavour, double price,  String type,String color,String brand)
	{
	this(flavour,price,type,color);
	this.brand=brand;
		
	}
	
	  	IceCream(String flavour, double price,  String type,String color,String brand,double weight)
	{
	this(flavour,price,type,color,brand);
	this.weight=weight;
		
	}
	IceCream(String flavour, double price,  String type,String color,String brand,double weight,double quantity)
	{
	this(flavour,price,type,color,brand,weight);
	this.quantity=quantity;
		
	}
		IceCream(String flavour, double price,  String type,String color,String brand,double weight,double quantity, boolean dryFruit)
	{
	this(flavour,price,type,color,brand,weight,quantity);
	this.dryFruit=dryFruit;
	
	
		
	}
	
		IceCream(String flavour, double price,  String type,String color,String brand,double weight,double quantity,boolean dryFruit,boolean goodTaste)
	{
	this(flavour,price,type,color,brand,weight,quantity,dryFruit);
	this.goodTaste=goodTaste;
	
		
	}
		IceCream(String flavour, double price,  String type,String color,String brand,double weight,double quantity,boolean dryFruit,boolean goodTaste,int since)
	{
	this(flavour,price,type,color,brand,weight,quantity,dryFruit,goodTaste);
	this.since=since;
		
	}
	
	
	}