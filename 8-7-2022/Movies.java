/*write a program and declare array and store 10 elements of movie data
1: Access all elements and display it in Reverse Order */
class Movies
{
	public static void main(String[] args)
	{
	String[] movies={"Bahubali Part1","K.G.F Chapter1","Birbal","Gultoo","Harry Potter","Avengers",
					"Spider Man","The Hulk","Bat Man","RRR"};
					System.out.println("\nReverse Order\n");
					for(int i=movies.length-1;i>=0;i--)
					{
					
					System.out.println(movies[i]);
					}
	
	
	}


}