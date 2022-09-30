/*Hotel, Cab, Helmet ,Cloth, Hospital, ShowRoom


13 Properties  declare using literal/ keep it default


13*6 = 78 
6 main methods == print + re-assing + print 
39 * 6 = 234

312 */
class Hotel1
{
	static String name;
	static String address="Near Richmond Cirlce 8th Cross";
	static boolean HotelWithLodge=true;
	static byte noOfFloors=4;
	static boolean type=true;
	static double openTime=10.00d;
	static double closeTime=10.30;
	static String morning="AM";
	static String night="PM";
	static long contact=9036650757l;
	static boolean onlineOrder=false;
	static int perDayHalt=1500;
	static float googleRating=4.5f;
	static short noOfBranches=100;
	static boolean onlineRoomBooking=true;
}
	class Hotel2
	{
		
public static void main(String[] args)
{
//String hotelName=name;
//System.out.println(name);    //literal way


String hotelAddress=Hotel1.address;
System.out.println(hotelAddress);

/*boolean hotelWithLodge=HotelWithLodge;
//System.out.println(hotelWithLodge);

//byte hotelNoOfFloors=noOfFloors;
//System.out.println(hotelNoOfFloors);

//boolean hotelType=type;
System.out.println(hotelType);

double hotelOpenTime=openTime;
String hotelMorning=morning;
System.out.println(hotelOpenTime+hotelMorning);

double hotelCloseTime=closeTime;
String hotelNight=night;
System.out.println(hotelCloseTime+hotelNight);

long hotelContact=contact;
System.out.println(hotelContact);

boolean hotelOnlineOrder=onlineOrder;
System.out.println(hotelOnlineOrder);

int hotelPerDayHalt=perDayHalt;
System.out.println(hotelPerDayHalt);

float hotelGoogleRating=googleRating;
System.out.println(hotelGoogleRating);

short hotelNoOfBranches=noOfBranches;
System.out.println(hotelNoOfBranches);

boolean hotelOnlineRoomBooking=onlineRoomBooking;
System.out.println(hotelOnlineRoomBooking);

System.out.println("\n\n*****After Re-Assigning Values*****\n\n");
String hotelName="dimond hotel";
System.out.println(hotelName);

 hotelAddress="JP NAGAR 7th CROSS BENGALURU";
System.out.println(hotelAddress);

 hotelWithLodge=false;
System.out.println(hotelWithLodge);

hotelNoOfFloors=3;
System.out.println(hotelNoOfFloors);

 hotelType=false;
System.out.println(hotelType);

 hotelOpenTime=8.30;
 hotelMorning="AM";
System.out.println(hotelOpenTime+hotelMorning);

 hotelCloseTime=9.00;
 hotelNight="PM";
System.out.println(hotelCloseTime+hotelNight);

 hotelContact=9449034951l;
System.out.println(hotelContact);

hotelOnlineOrder=true;
System.out.println(hotelOnlineOrder);

hotelPerDayHalt=2500;
System.out.println(hotelPerDayHalt);

 hotelGoogleRating=3.5f;
System.out.println(hotelGoogleRating);

 hotelNoOfBranches=5;
System.out.println(hotelNoOfBranches);

 hotelOnlineRoomBooking=false;
System.out.println(hotelOnlineRoomBooking);*/


}

	
}