class MetroGo
{
public static void main(String[] args)
{
Metro b=new Metro();
b.metroName="Shakthidham Express";
System.out.println(b.metroName);

b.metroProjectName="NAMMA METRO PROJECT";
System.out.println(b.metroProjectName);
b.cost=40000000d;
System.out.println(b.cost);
b.capacityToCarry=500;
System.out.println(b.capacityToCarry);
b.startStation="KSR Bengaluru";
System.out.println(b.startStation);
b.stopStation="YELECHENAHALLI";
System.out.println(b.stopStation);
b.perPassengerPrice=50;
System.out.println(b.perPassengerPrice);
b.traffic=false;
System.out.println("Metro is made to traffic\n"+b.traffic);
}
}