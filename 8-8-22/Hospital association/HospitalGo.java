class HospitalGo
{
public static void main(String[] args)
{

String [] eqp={"NEBLIZER","OXYGEN CYLINDER"," surgical tables"," anesthesia machines","sterilizers"};
Hospital hospital=new Hospital("Aashraya Hospital",eqp,150);
for (int count=0;count<eqp.length;count++)
{
System.out.println(eqp[count]);
}
//Hospital.printData();
//Specialization specialization=new Specialization();
Founder founder=new Founder("Shridhar k",1994,2000,true,100500d);
}
}