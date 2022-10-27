package com.xworkz.jdbcreadoperation.personrepository;

import com.xworkz.jdbcreadoperation.persondto.PersonDTO;

public interface PersonRepository {
	boolean save(PersonDTO dto);

	void displayAll();

	void displayAllAgeGreaterThenOrderByName(int age);

	void displayAllByGenderDescOrderByName(String gender);

	void displayAllBySalaryGreaterThanOrderByDesc(double salary);

	void displatCount();

	void displaySumOfSalary();

}
