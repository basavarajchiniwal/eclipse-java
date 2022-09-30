class CarromBoard
{
static String boardNeeded="false";
boolean boardNeed=Boolean.parseBoolean(boardNeeded);
int noOfCoins;
float boardSize;
String typesOfBoard;

CarromBoard(String boardType,int coinsNo)
{
	typesOfBoard=boardType;
	noOfCoins=coinsNo;
	System.out.println("BOARD TYPE IS "+typesOfBoard);
	System.out.println("NUMBER OF COINS ARE "+noOfCoins);
}
CarromBoard(float sizeOfBoard)
{
	boardSize=sizeOfBoard;
	System.out.println("THE SIZE OF BOARD IS "+boardSize+"Inches");
}





}