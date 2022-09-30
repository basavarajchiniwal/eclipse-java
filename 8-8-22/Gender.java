enum Gender
{
	MALE('M'),FEMALE('F'),OTHERS('O');
	
	char type;
	
	
	Gender(char type)
	{
		this.type=type;
		//System.out.println("the owner gender is"+this.gender);
	}
}