class SpeakerGo
{
	public static void main(String[]args)
	{
		
	System.out.println("Static variable through class name references\n");
	System.out.println("SPEAKERS ARE ALWAYS PRODUCE SOUNDS"+Speaker.sound);
	System.out.println("SPEAKERS ARE  "+Speaker.deviceType);
	System.out.println("\n1st instances\n");
	Speaker speaker=new Speaker("JBL",2000);
	System.out.println("\n2nd instances\n");
	Speaker speaker1=new Speaker("SONY",3000);
	System.out.println("\n3rd instances\n");
	Speaker speaker2=new Speaker(true,(byte)9);
	System.out.println("\n4th instances\n");
	Speaker speaker3=new Speaker(false,(byte)9);
	System.out.println("\n 5th instances\n");
	Speaker speaker4=new Speaker("PANASONIC",2500);
	}
	

}