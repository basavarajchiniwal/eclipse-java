/*Hospital: name,specialization(enum),equipments([]),
consultationFees,Founder
printData();-->this.founder.printData();

Founder : name,from,profession(enum with String const),since,alive,income
printData();*/

class Hospital
{
	String name;
	Specialization specialization;
	String[] equipments;
	int consultationFees;
	Founder founder;
	
	 Hospital(String name,String[] equipments,int consultationFees)
	{
		this.name=name;
		this.equipments=equipments;
		this.consultationFees=consultationFees;
		
	}
	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.equipments);
		System.out.println(this.consultationFees);
		System.out.println(this.specialization.spec);  
		this.founder.printData();
	}
	//this.founder.printData();
	
}