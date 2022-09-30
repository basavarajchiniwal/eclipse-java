class Trainer 
{
String name;
int age;
double exp;
Gender gender;
long contact;


void setTrainer(String name,int age,double exp,Gender gender,long contact)
{
	this.name=name;
	this.age=age;
	this.exp=exp;
	this.gender=gender;
	this.contact=contact;
	
	
//System.out.println("Gym Owners Details ");
}


void printData()
{
	System.out.println(this.name);
	System.out.println(this.age);
	System.out.println(this.exp);
	System.out.println(this.gender.type);
	System.out.println(this.contact);
	
}

}