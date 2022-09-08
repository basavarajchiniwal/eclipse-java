package com.xworkz.daoconcepts;

public class LakeGo {

	public static void main(String[] args) {
		LakeDAOImplementor implementor = new LakeDAOImplementor();
		
			implementor.save("Byrasandra Lake");
			implementor.save("Madiwala Lake");
			implementor.save("Arekere Lake");
			implementor.save("Sarakki Lake");
			implementor.save("Lalbagh Lake");
			implementor.save("Agara Lake");
			implementor.save("Akshayanagara Lake");
			implementor.save("Yelachenahalli Kere");
			implementor.save("Begur Lake");
			implementor.save("Sampangee lake");
			implementor.save("Kasavanahalli Lake,");
			implementor.save("Bellandur Lake");
		

		// implementor.
		// System.out.println(implementor.lakeNames[0] + implementor.lakeNames[1]);
		// System.out.println(implementor);
		implementor.printAllLakes();
	}

}
