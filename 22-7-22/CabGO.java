class CabGo
{
	public static void main(String[] args)
	{
	String cabId=Cab.id;						//passing default static variable from class cab
	System.out.println(cabId);
	
	String cabType=Cab.type;
	System.out.println(cabType);
	
	double cabDutyTime=Cab.dutyTime;
	System.out.println(cabDutyTime);
	
	int cabIncentive=Cab.incentive;
	System.out.println(cabIncentive);
	
	String cabBooking=Cab.booking;
	System.out.println(cabBooking);
	
	String cabRegister=Cab.register;
	System.out.println(cabRegister);
	
	String cabPickLocation=Cab.pickLocation;
	System.out.println(cabPickLocation);
	
	String cabDropLocation=Cab.dropLocation;
	System.out.println(cabDropLocation);
	
	String cabDriverName=Cab.driverName;
	System.out.println(cabDriverName);
	
	String cabDriverAddress=Cab.driverAddress;
	System.out.println(cabDriverAddress);
	
	double cabDriverContact=Cab.driverContact;
	System.out.println(cabDriverContact);
	
	boolean cabPaymentMode=Cab.paymentMode;
	System.out.println(cabPaymentMode);
	
	boolean cabCancelBooking=Cab.cancelBooking;
	System.out.println(cabCancelBooking);
	
	String cabPassengerDetails=Cab.passengerDetails;
	System.out.println(cabPassengerDetails);
	
	
	byte cabNoOfPassengers=Cab.noOfPassengers;
	System.out.println(cabNoOfPassengers);
	
	System.out.println("After Re-Assigning Variable");
	
	cabId="TR10365D ";
	System.out.println(cabId);
	cabType="Regular Cab";
	System.out.println(cabType);
	cabDutyTime=8.00d;
	System.out.println(cabDutyTime);
	cabIncentive=5000;
	System.out.println(cabIncentive);
	cabBooking="Through OLA PLatform";
	System.out.println(cabBooking);
	cabRegister="www.OLA.com";
	System.out.println(cabRegister);
	cabPickLocation="BTM Layout 2nd Phase";
	System.out.println(cabPickLocation);
	cabDropLocation="Jigani Double Link Road";
	System.out.println(cabDropLocation);
	cabDriverName="Basavaraj";
	System.out.println(cabDriverName);
	cabDriverAddress="K C Rani 8th Cross Gadag 582101";
	System.out.println(cabDriverAddress);
	cabDriverContact=7204814360d;
	System.out.println(cabDriverContact);
	cabPaymentMode=true;
	System.out.println(cabPaymentMode);
	cabCancelBooking=false;
	System.out.println(cabCancelBooking);
	cabPassengerDetails="Name:Raghu Id:123456";
	System.out.println(cabPassengerDetails);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}


}