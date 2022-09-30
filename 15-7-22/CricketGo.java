 public class CricketGo {

	public static void main(String[] args) {
		Cricket.player(12);
		String[] nameOfPlayer= {"sachin","dravid","kohli","dohni","shewag,","raina","K L Rahul","Rohith Sharma","YUvaraj singh","R Aswhin","jadeja","Karthik"};
		Cricket.player(nameOfPlayer);
		Cricket.player("india");
		Cricket.overs(46, 100);
		Cricket.overs(8);
		byte runsout=6;
		Cricket.overs(runsout);
	}

}
public class Cricket
{
	
	
static void	player(int nOfPlayer)
	{
	
	System.out.println("no of players in the team"+nOfPlayer);
		
	}
static void player(String[] nameOfPlayer){
	for (int i = 0; i < nameOfPlayer.length; i++) 
	{
		System.out.println(i+1+")player name :::::"+nameOfPlayer[i]);
		
	}
	}
static void player(String nation) 
{
	System.out.println("playing for:::"+nation);
	
}
static void overs(int balls, int runs) 
{
	System.out.println("played over is::"+balls+"and score is::"+runs);
}
static void overs(int wicketes) {
	System.out.println("wickets in 15 over::"+wicketes);
}
static void overs(byte runsout) {
	System.out.println("runout in 15 over::"+runsout);
}

}