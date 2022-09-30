public class Radio {

	
		static void radio(String rName) {
			System.out.println("Radio name is::"+rName );
			
		}
		static void radio(double channelNumber) {
			System.out.println("Radio chennal is is::"+channelNumber );

		}
		static void radio(int channelFreq) {
			System.out.println("Radio frequency is::"+channelFreq );

		}
		static void radio(String[] programlList) {
			for (int i = 0; i < programlList.length; i++) {
				System.out.println(i+1+") "+programlList[i]);
				
			}
			
		}
		
		static void radio(int newsTime,  String reader) {
			System.out.println("news time::"+newsTime+"     reader is  "+reader);
		}

		static void radio(int jackyNumber,String name, String namee) {
			System.out.println("fav radio jacky num::"+jackyNumber+ "  first anme;;;"+name+"   &  "+namee);
			
		}

		

	}
	public class RadioTester {

	public static void main(String[] args) {
		Radio.radio("BIG FM");
		Radio.radio(108.8);
		Radio.radio(12);
		String[] listProgram= {"songs","news","weather","films","talks","yoga","gassips","sports"};
		Radio.radio(listProgram);
		Radio.radio(8, "sheetal");
		Radio.radio(6, "Sheetal", "prajwal");
	}

}