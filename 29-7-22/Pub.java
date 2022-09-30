/*Pub
4 properties 
Declare two Constructor in each class 
In Main method init all instance variable 
Least one static property
5 instances "*/
class Pub
{
static String camera;
String pubOwner;
boolean license;
int noOfPubs;
String timing;

Pub(String ownerOfPub,boolean legal)
{
	pubOwner=ownerOfPub;
	license=legal;
	System.out.println("WELCOME TO THE RED LION");
}
Pub(int pubsNos,String time)
{
	noOfPubs=pubsNos;
	timing=time;
	
}

}