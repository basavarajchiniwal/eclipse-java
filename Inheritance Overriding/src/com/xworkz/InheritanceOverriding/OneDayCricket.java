package com.xworkz.InheritanceOverriding;

public class OneDayCricket extends Cricket {
	String bestBowler;
	String bestBatsman;

	public void setBestBowler(String bestBowler1) {
		this.bestBowler = bestBowler1;
	}

	public void setBestBatsman(String bestBatsman) {
		this.bestBatsman = bestBatsman;
	}

	String manOfTheSeries() {
		System.out.println("Man of The Series" + bestBatsman);
		return bestBatsman;
	}

	@Override // Annotation
	double presentation() {
		System.out.println("presentation over ride");
		return 0.0d;
	}

}
