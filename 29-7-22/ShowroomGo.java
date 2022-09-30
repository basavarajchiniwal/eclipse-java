class ShowroomGo
{
	public static void main(String[] args)
	{
		System.out.println("*************1st instances***********");
		Showroom showroom=new Showroom();
		System.out.println("EVERY RESTAURENT WIIL HAVE DEFAULT CAMERA :"+Showroom.camera);
		showroom.name="Atlas Showroom";
		System.out.println("NAME OF SHOWROOM: "+showroom.name);
		showroom.type="Automobile ";
		System.out.println("TYPE OF SHOWROOM: "+showroom.type);
		showroom.noOfMaterials=20;
		System.out.println("NUMBER OF BIKES: "+showroom.noOfMaterials);
		System.out.println("*************2nd instances***********");
		Showroom showroom1=new Showroom();
		showroom1.name="A-ONE FURNITURE SHOWROOM";
		System.out.println("NAME OF SHOWROOM: "+showroom1.name);
		showroom1.type="FURNITURE SHOWROOM ";
		System.out.println("TYPE OF SHOWROOM: "+showroom1.type);
		showroom1.noOfMaterials=30;
		System.out.println("NUMBER OF FURNITURES : "+showroom1.noOfMaterials);
		System.out.println("*************3rd instances***********");
		Showroom showroom2=new Showroom();
		showroom2.name="HI-FI CAR SHOWROOM";
		System.out.println("NAME OF SHOWROOM: "+showroom2.name);
		showroom2.type="CAR SHOWROOM";
		System.out.println("TYPE OF SHOWROOM: "+showroom2.type);
		showroom2.noOfMaterials=50;
		System.out.println("NUMBER OF CARS : "+showroom2.noOfMaterials);
		System.out.println("*************4TH instances***********");
		Showroom showroom3=new Showroom();
		showroom3.name="ELENTHRA SHOWROOM";
		System.out.println("NAME OF SHOWROOM: "+showroom3.name);
		showroom3.type="ELECTRONIC SHOWROOM";
		System.out.println("TYPE OF SHOWROOM: "+showroom3.type);
		showroom3.noOfMaterials=100;
		System.out.println("NUMBER OF ELECTRONICS MATERIALS : "+showroom3.noOfMaterials);
		
		System.out.println("*************5TH instances***********");
		
		Showroom showroom4=new Showroom(6000000f,"BTM LAYOUT",false);
		System.out.println("EVERY RESTAURENT WIIL HAVE DEFAULT CAMERA :"+Showroom.camera);
	
	}
}