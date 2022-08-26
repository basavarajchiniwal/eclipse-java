package com.xworkz.invokingmethods;

public class Fish {
	public String breed;
	public String type;

	public Fish() {
		System.out.println("default contstructor");
	}

	public Fish(String breed, String type) {
		this.breed = breed;
		this.type = type;

		// System.out.println("breed of fish is" + breed);
		// System.out.println("fish type is" + type);
	}

	@Override
	public String toString() { // Method String toString() Overriding
		System.out.println("Method Override");
		return super.toString();
	}

	public String getType() {
		return this.type;
	}

	public String getBreed() {
		return this.breed;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj != null) 
		{
			System.out.println("object is not null,can check");
			if (obj instanceof Fish)
			{
				System.out.println("instnace is fish, its comaprig");
				Fish converted = (Fish) obj;
				String convertedBreed = converted.breed;
				String convertedType = converted.type;
				if (this.breed.equals(convertedBreed) && this.type.equals(convertedType)) 
				{
					System.out.println("fish is euals");
					return true;
				} else 
				{
					System.out.println("fish is not equal");
				}

				System.out.println("object is null");
				

			}

		}
		return super.equals(obj);
	}
}
