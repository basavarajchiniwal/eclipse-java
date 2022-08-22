package com.xworkz.InheritanceOverriding;

public class CricketGo {

	public static void main(String[] args) {
		Cricket cricket = new TestCricket();
		cricket.presentation();
		cricket.setCaptain("MS Dhoni");
		cricket.setCountry("India");
		cricket.setGender(true);
		System.out.println(cricket);
		TestCricket testcric = new TestCricket();
		testcric.setGroundTypes("Chinnaswamy Stadium");
		System.out.println("Ground Nmae" + testcric);
		double pre = cricket.presentation();
		System.out.println(pre);

		System.out.println("==========================================");

		Cricket cricket1 = new OneDayCricket();
		cricket1.setCaptain("Virat");
		cricket1.setCountry("INDIA");
		cricket1.setGender(false);
		System.out.println(cricket1);

		double entry = cricket1.presentation(); // from class Cricket method over ride invoking in main method
		System.out.println(entry);

		OneDayCricket oneday = new OneDayCricket();
		oneday.setBestBatsman("Rohith");
		oneday.setBestBowler("Bhuvaneshwar Kumar");
		System.out.println("Best Batsman is" + oneday.bestBatsman);
		System.out.println("Best Bowler is" + oneday.bestBowler);
		String manOfSeries = oneday.manOfTheSeries();
		System.out.println(manOfSeries);

		System.out.println("=================================================================");
		Cricket cricket2 = new T20Cricket(); // doubt Cricket cricket2=new T20Cricket(); not worked
		boolean entertain = cricket2.entertainment();
		System.out.println(entertain);
		T20Cricket t20cric = new T20Cricket();
		t20cric.setManOfTheMatch("Rohith Sharma");
		System.out.println("Mna of the Match is for" + t20cric);

	}

}
