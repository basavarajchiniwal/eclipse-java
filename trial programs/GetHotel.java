class GetHotel
{
public static void main(String[] args)
{
	String hotelName=Hotel.name;
	String hotelPlace=Hotel.place;
	String hotelType=Hotel.type;  //holding the address hotel type(Hotel.type) in hotelType varible 
	double openTime=Hotel.openTime;
	double hotelCloseTime=Hotel.closeTime;
	//boolean orderType=Hotel.onlineOrder;
	
	System.out.println(hotelName);
	System.out.println(hotelPlace);
	System.out.println(hotelType);
	System.out.println(openTime);
	System.out.println(hotelCloseTime);
	System.out.println(Hotel.onlineOrder);
	
	String hotelName1=Hotel.name1;
	String hotelPlace1=Hotel.place1;
	String hotelType1=Hotel.type1;
	double openTime1=Hotel.openTime1;
	double hotelCloseTime1=Hotel.closeTime1;
	boolean orderType1=Hotel.onlineOrder1;
	 int price=Hotel.price;
   char floor=Hotel.floor;
 long contact=Hotel.contact;
  byte menuNo=Hotel.menuNo;
 short haltingCharge=Hotel.haltingCharge;
	
	System.out.println(hotelName1);
	System.out.println(hotelPlace1);
	System.out.println(hotelType1);
	System.out.println(openTime1);
	System.out.println(hotelCloseTime1);
	System.out.println(orderType1);
	
	System.out.println(price);          
	System.out.println(floor);          
	System.out.println(contact);          
	System.out.println(menuNo);          
	System.out.println(haltingCharge);  

	
	
	
}
}