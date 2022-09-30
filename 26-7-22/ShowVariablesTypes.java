class ShowVariablesTypes
{
public static void main(String[] args)
{
System.out.println("\n1st Properties\n");   
System.out.println(Mobiles.brand);        //literals
Mobiles.types=3;							//class names
System.out.println(Mobiles.types);
Mobiles.setFunction();						//method without parameter
String type ="Android Phone";				//method with parameter	
Mobiles.setFunction(type);

System.out.println("\n2nd Properties\n");
System.out.println(Bikes.color);
Bikes.types=6;
System.out.println(Bikes.types);
Bikes.setFunction();
String type1 ="BS6 Engine Two Wheeler";
Bikes.setFunction(type1);

System.out.println("\n3rd Properties\n");
System.out.println(Laptops.color);
Laptops.types=6;
System.out.println(Laptops.types);
Laptops.setFunction();
Laptops.setFunction(3);

System.out.println("\n4th Properties\n");
System.out.println(Beds.color);
Beds.types=14;
System.out.println(Beds.types);
Beds.setFunction();
Beds.setFunction(3.5f);

System.out.println("\n5th Properties\n");
System.out.println(Chairs.name);         
Chairs.type="sitting chairs";
System.out.println(Chairs.type);
Chairs.function();
Chairs.function(4);
System.out.println("\n6th Properties\n");
System.out.println(Bags.types);
Bags.function="to carry the things";
System.out.println(Bags.function);
Bags.setFunction();
Bags.setFunction(3.5f);

System.out.println("\n7th Properties\n");

Books.name="mahabharath";				//Re-assigning value to the class name
System.out.println(Books.name);
Books.type=5;
System.out.println(Books.type);			//class name
Books.bookGo();
String index="1 to 100 chapters are there";
Books.bookGo(index);

System.out.println("\n8th Properties\n");
System.out.println(Mouse.name) ;
Mouse.types=2;
System.out.println(Mouse.types);
Mouse.function();

Mouse.function("two types are as follows");  

System.out.println("\n9th Properties\n");  






}


}