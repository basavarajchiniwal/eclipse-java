class DateGo
{
public static void main(String[] args)
{
Date date=new Date();
System.out.println(date.day);
System.out.println(date.month);
System.out.println(date.year);
System.out.println(date.week);
Date date1=new Date(1);
System.out.println(date1.day);
System.out.println(date1.month);
System.out.println(date1.year);
System.out.println(date1.week);
Date date2=new Date(1,8);
System.out.println(date2.day);
System.out.println(date2.month);
System.out.println(date2.year);
System.out.println(date2.week);
Date date3=new Date(1,8,2022);
System.out.println(date3.day);
System.out.println(date3.month);
System.out.println(date3.year);
System.out.println(date3.week);
Date date4=new Date(1,8,2022,"MONDAY");
System.out.println(date4.day);
System.out.println(date4.month);
System.out.println(date4.year);
System.out.println(date4.week);
}

}