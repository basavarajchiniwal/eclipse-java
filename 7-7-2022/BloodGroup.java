/*write a program with a main method declare and 
1:Initialization of array with all blood groups
2: Access and Print all elements using for loop*/
class BloodGroup
{
	public static void main(String[] args)
	{
	String bloodGroups[]={"A+","O+","B+","AB+","A-","O-","B-","AB-"};
	System.out.println(bloodGroups.length);
	
	for(int i=0;i<bloodGroups.length;i++)
	{

		System.out.println(bloodGroups[i]);
	}	
	}
}