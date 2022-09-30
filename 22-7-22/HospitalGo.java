class HospitalGo
{
	public static void main(String[] args)
	{
	String name=Hospital.name;
	System.out.println(name);
	
	boolean multiSpeciality=Hospital.multiSpeciality;
	System.out.println(multiSpeciality);
	
	short noOfStaffs=Hospital.noOfStaffs;
	System.out.println(noOfStaffs);
	
	boolean biometricAttendance=Hospital.biometricAttendance;
	System.out.println(biometricAttendance);
	
	byte visitingDrs=Hospital.visitingDrs;
	System.out.println(visitingDrs);
	 
	byte generalWards=Hospital.generalWards;
	System.out.println(generalWards);
	 
	byte specialWards=Hospital.specialWards;
	System.out.println(specialWards);
	
	int totalMonthSalaries=Hospital.totalMonthSalaries;
	System.out.println(totalMonthSalaries);
	
	int operationCharges=Hospital.operationCharges;
	System.out.println(operationCharges);
	
	double monthlyExpenses=Hospital.monthlyExpenses;
	System.out.println(monthlyExpenses);
	 
	double openTime=Hospital.openTime;
	System.out.println(openTime);
	 
	double closeTime=Hospital.closeTime;
	System.out.println(closeTime);
	 
	byte icuBeds=Hospital.icuBeds;
	System.out.println(icuBeds);

	System.out.println("Re- Assigning values");
	Hospital.name="Aasharayaa Hospital";
	System.out.println(Hospital.name);
	
	Hospital.multiSpeciality=true;
	System.out.println(Hospital.multiSpeciality);
	
	Hospital.biometricAttendance=true;
	System.out.println(Hospital.biometricAttendance);
	
	Hospital.visitingDrs=6;
	System.out.println(Hospital.visitingDrs);
	
	Hospital.generalWards=20;
	System.out.println(Hospital.generalWards);
	
	Hospital.specialWards=30;
	System.out.println(Hospital.specialWards);
	
	Hospital.totalMonthSalaries=50000;
	System.out.println(Hospital.totalMonthSalaries);
	
	Hospital.operationCharges=15000;
	System.out.println(Hospital.operationCharges);
	
	Hospital.monthlyExpenses=250000d;
	System.out.println(Hospital.monthlyExpenses);
	
	Hospital.openTime=10.00d;
	System.out.println(Hospital.openTime);
	
	Hospital.closeTime=10.30d;
	System.out.println(Hospital.closeTime);
	
	Hospital.icuBeds=15;
	System.out.println(Hospital.icuBeds);
 
	}


}