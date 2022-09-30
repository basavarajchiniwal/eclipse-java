 /*Gym : name,fees, equipments;
 trainer(class);
printData()--> this.trainer.printData();
 
Trainer : name,contactNo,exp,gender(enum),age
printData()

Hospital: name,specialization(enum),equipments([]),
consultationFees,Founder
printData();-->this.founder.printData();

Founder : name,from,profession(enum with String const),since,alive,income
printData();*/

class Gym
{
String name;
double fees;
Trainer trainer;
String[] equipments;
Gym(String name,double fees,String[] equipments)
{
this.name=name;
this.fees=fees;
this.equipments=equipments;

}

//Trainer trainer=new Trainer ();



void printData()
{
System.out.println(this.name);
System.out.println(this.fees);
//System.out.println(this.equipments);
for(int count=0;count<this.equipments.length;count++)
	{
	System.out.println(this.equipments[count]);
	}




}


}




