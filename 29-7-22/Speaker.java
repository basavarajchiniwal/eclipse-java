class Speaker
{
static boolean sound=true;
static String deviceType="OUTPUT DEVICE";
String speakerBrand;
byte typesOfSpeaker;
float price;
boolean platformAvailable;

Speaker(String brand,float prices)
{
	price=prices;
	speakerBrand=brand;
	System.out.println("SPEAKER BRAND:"+brand);
	System.out.println("SPEAKER BRAND:"+speakerBrand);
	System.out.println("THE PRICE OF SPEAKER IS:"+price);
}
Speaker(boolean available ,byte speakerTypes)
{
	//platformAvailable=available;
	//typesOfSpeaker=speakerTypes;
	System.out.println("SPEAKER IS AVAILABLE AT "+platformAvailable+"PLATFORM");

	System.out.println("TYPES OF SPEAKERS ARE :"+typesOfSpeaker);
}
}