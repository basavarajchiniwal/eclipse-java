/*getFruitByPrice---> 179
getPriceByFruit*/

class Fruits
{
static String[] fruitByPrice(int price)
{
	String[] f={"Acerola","Apple","Apricots","Avocado","Banana","Blackberries","Blackcurrent","Blueberries","Breadfruit","Cantaloupe",
				"Carambola","Cherimoya","Cherries","clementine","coconut meat","cranberries","custard apple","date fruit","durian",
				"elder berries","feijoe","Figs","Goose berries","Grape fruit","Grapes","guava","honeydew melon","Jack fruit",
				"java plum","jujube fruit","kiwi fruit","kumquat","lemon","longan","loquat","lychee","mandarin","mango","mangosteen",
				"mulberris","nectarine","olives","orange","papaya","passion fruit","peaches","pear","persimmon","pitaya","pineapple",
				"pitanga","plantain","plums","pomegranate","prickley pear","prunes","pummelo","quince","raspberries","rhubarb",
				"rosse apple","sapodilla","sapote","soursop","strawberries","sugar apple","tamarind","tangerine","watermelon"};
				
			int i;
				for(i=0;i<f.length;i++)
				{
					if(i==65)
					{						
					System.out.println(f[i]);
					return f;
					}
					
					
				
				}	
				return f;

}
public static void main(String[] args)
{
	fruitByPrice(800);
}

}