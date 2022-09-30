/*Pub
4 properties 
Declare two Constructor in each class 
In Main method init all instance variable 
Least one static property
5 instances "*/
class PubGo
{
public static void main(String[] args)
{
Pub.camera="RED LION PUB IS UNDER CC CAMERA SURVILANCE ";
System.out.println(Pub.camera);
Pub pub1;
pub1=new Pub("RAJENDRAPRASAD",true);
System.out.println("\n1st instances\n");
System.out.println("OWNER OF RED LION PUB: "+pub1.pubOwner);
System.out.println("THIS PUB IS LICENCED"+pub1.license);
System.out.println("\n2nd instances\n");
Pub pub2;
pub2=new Pub("RAVISHANKAR",false);
System.out.println("OWNER OF RED LION PUB: "+pub2.pubOwner);
System.out.println("THIS PUB IS UNDER PROCESS OF LICENSE"+pub2.license);
System.out.println("\n3rd instances\n");
Pub pub3;
pub3=new Pub("ASHOK REDDY",false);
System.out.println("OWNER OF RED LION PUB: "+pub3.pubOwner);
System.out.println("THIS PUB IS NOT LICENCED"+pub3.license);
System.out.println("\n4TH instances\n");
Pub pub4;
pub4=new Pub(800,"7:00PM TO 5:00AM IST");
System.out.println("NUMBER OF PUBS IN INDIA"+pub4.noOfPubs);
System.out.println("RED LION PUB IS STARTS AND CLOSE @ ==>"+pub4.timing);
System.out.println("\n5TH instances\n");
Pub pub5;
pub5=new Pub(406,"8:30PM TO 4:00AM IST");
System.out.println("NUMBER OF PUBS IN BENGALURU"+pub5.noOfPubs);
System.out.println("RED LION PUB IS (CHANGE IN TIME)STARTS AND CLOSE @ ==>"+pub5.timing);


}

}