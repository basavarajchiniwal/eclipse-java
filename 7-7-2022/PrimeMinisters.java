/*write a program with a main method 
1:Declare and init array with 10 prime ministers of india 
2: Access and print all elements using for loop
3: update elements at index 4,7,9 as NA (primeministers="NA");
4: Access and print all elements using for loop*/

class PrimeMinisters
{
	public static void main(String[] args)
	{
		String primeMinister[]={"Lal Bahadur Shastri","Indira Gandhi","Morarji Desai",
								"Rajiv Gandhi","V.P. Singh","P.V.Narasimha Rao","Atal Bihari Vajpayee",
								"H.D Devegouda","Manmohan Singh","Narendra Modi"};
								int a;
								for( a=0;a<primeMinister.length;a++)
									
									{
								 
									System.out.println(primeMinister[a]+"\n");
								  		}
						
									primeMinister[4]="NA";
									primeMinister[7]="NA";
									primeMinister[9]="NA";
									System.out.println("After Re-assigning Index 4,7,9\n");
									//System.out.println(+primeMinister[]);
									
									for( a=0;a<primeMinister.length;a++)
									{
									System.out.println(primeMinister[a]+"\n");
									}
								
	}
}