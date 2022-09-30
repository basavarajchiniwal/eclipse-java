class IceCreamGo
{
public static void main(String[] args)
{
	IceCream icecream=new IceCream();									 
    System.out.println("FIRST CONSTRUCTOR WITH DEFAULT CONTRUCTOR");
	System.out.println(icecream.flavour);
	System.out.println(icecream.price);
	System.out.println(icecream.type);
	System.out.println(icecream.color);
	System.out.println(icecream.brand);
	System.out.println(icecream.weight);
	System.out.println(icecream.quantity);
	System.out.println(icecream.dryFruit);
	System.out.println(icecream.goodTaste);
	System.out.println(icecream.since);
	
	
	IceCream icecream1=new IceCream("VANILLA");	
 System.out.println("CONSTRUCTOR WITH ONE PARAMETER");
	System.out.println(icecream1.flavour);
	System.out.println(icecream1.price);
	System.out.println(icecream1.type);
	System.out.println(icecream1.color);
	System.out.println(icecream1.brand);
	System.out.println(icecream1.weight);
	System.out.println(icecream1.quantity);
	System.out.println(icecream1.dryFruit);
	System.out.println(icecream1.goodTaste);
	System.out.println(icecream1.since);
	
	
	IceCream icecream2=new IceCream("VANILLA",250.50d);	
    System.out.println("CONSTRUCTOR WITH TWO PARAMETER");
	System.out.println(icecream2.flavour);
	System.out.println(icecream2.price);
	System.out.println(icecream2.type);
	System.out.println(icecream2.color);
	System.out.println(icecream2.brand);
	System.out.println(icecream2.weight);
	System.out.println(icecream2.quantity);
	System.out.println(icecream2.dryFruit);
	System.out.println(icecream2.goodTaste);
	System.out.println(icecream2.since);
	
	
	IceCream icecream3=new IceCream("VANILLA",250.50d,"Day-Neutral");			
System.out.println("CONSTRUCTOR WITH THREE PARAMETER");	
    
	System.out.println(icecream3.flavour);
	System.out.println(icecream3.price);
	System.out.println(icecream3.type);
	System.out.println(icecream3.color);
	System.out.println(icecream3.brand);
	System.out.println(icecream3.weight);
	System.out.println(icecream3.quantity);
	System.out.println(icecream3.dryFruit);
	System.out.println(icecream3.goodTaste);
	System.out.println(icecream3.since);
	System.out.println(icecream3.flavour);
	
	IceCream icecream4=new IceCream("VANILLA",250.50d,"Day-Neutral","blue");									 
    System.out.println("CONSTRUCTOR WITH FOUR PARAMETER");
	System.out.println(icecream4.flavour);
	System.out.println(icecream4.price);
	System.out.println(icecream4.type);
	System.out.println(icecream4.color);
	System.out.println(icecream4.brand);
	System.out.println(icecream4.weight);
	System.out.println(icecream4.quantity);
	System.out.println(icecream4.dryFruit);
	System.out.println(icecream4.goodTaste);
	System.out.println(icecream4.since);
		
	IceCream icecream5=new IceCream("VANILLA",250.50d,"Day-Neutral","blue","Blue Bunny.");									 
    System.out.println("CONSTRUCTOR WITH FIVE PARAMETER");
	System.out.println(icecream5.flavour);
	System.out.println(icecream5.price);
	System.out.println(icecream5.type);
	System.out.println(icecream5.color);
	System.out.println(icecream5.brand);
	System.out.println(icecream5.weight);
	System.out.println(icecream5.quantity);
	System.out.println(icecream5.dryFruit);
	System.out.println(icecream5.goodTaste);
	System.out.println(icecream5.since);
	
	
	IceCream icecream6=new IceCream("STRAWBERRY",101.50d,"Frageria","blue","Blue Bunny.",50.50);									 
    System.out.println("CONSTRUCTOR WITH SIX PARAMETER");
	System.out.println(icecream6.flavour);
	System.out.println(icecream6.price);
	System.out.println(icecream6.type);
	System.out.println(icecream6.color);
	System.out.println(icecream6.brand);
	System.out.println(icecream6.weight);
	System.out.println(icecream6.quantity);
	System.out.println(icecream6.dryFruit);
	System.out.println(icecream6.goodTaste);
	System.out.println(icecream6.since);
		
	IceCream icecream7=new IceCream("STRAWBERRY",101.50d,"Day-Neutral","Red","Blue Bunny",50.50,100);									 
    System.out.println("CONSTRUCTOR WITH SEVEN PARAMETER");
	System.out.println(icecream7.flavour);	
	System.out.println(icecream7.price);
	System.out.println(icecream7.type);
	System.out.println(icecream7.color);
	System.out.println(icecream7.brand);
	System.out.println(icecream7.weight);
	System.out.println(icecream7.quantity);
	System.out.println(icecream7.dryFruit);
	System.out.println(icecream7.goodTaste);
	System.out.println(icecream7.since);
		
	IceCream icecream8=new IceCream("STRAWBERRY",101.50d,"Day-Neutral","Red","Blue Bunny",50.50,150,true);									 
    System.out.println("CONSTRUCTOR WITH NINE PARAMETER");
	System.out.println(icecream8.flavour);
	System.out.println(icecream8.price);
	System.out.println(icecream8.type);
	System.out.println(icecream8.color);
	System.out.println(icecream8.brand);
	System.out.println(icecream8.weight);
	System.out.println(icecream8.quantity);
	System.out.println(icecream8.dryFruit);
	System.out.println(icecream8.goodTaste);
	System.out.println(icecream8.since);
	
	
	IceCream icecream9=new IceCream("STRAWBERRY",101.50d,"Day-Neutral","Red","Blue Bunny",50.50d,150d,true,false);									 
    System.out.println("CONSTRUCTOR WITH EIGHT PARAMETER");
	System.out.println(icecream9.flavour);
	System.out.println(icecream9.price);
	System.out.println(icecream9.type);
	System.out.println(icecream9.color);
	System.out.println(icecream9.brand);
	System.out.println(icecream9.weight);
	System.out.println(icecream9.quantity);
	System.out.println(icecream9.dryFruit);
	System.out.println(icecream9.goodTaste);
	System.out.println(icecream9.since);
	
	
	IceCream icecream10=new IceCream("STRAWBERRY",101.50d,"Frageria","Red","Blue Bunny",50.15,200.00,true,true,1994);									 
    System.out.println("CONSTRUCTOR WITH EIGHT PARAMETER");
	System.out.println(icecream10.flavour);
	System.out.println(icecream10.price);
	System.out.println(icecream10.type);
	System.out.println(icecream10.color);
	System.out.println(icecream10.brand);
	System.out.println(icecream10.weight);
	System.out.println(icecream10.quantity);
	System.out.println(icecream10.dryFruit);
	System.out.println(icecream10.goodTaste);
	System.out.println(icecream10.since);

	
	
}
	
	
}
 