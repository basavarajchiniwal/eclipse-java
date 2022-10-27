package com.xworkz.jdbcreadoperation.personservice;

import com.xworkz.jdbcreadoperation.persondto.PersonDTO;

public interface PersonService {
	boolean validateAndSave(PersonDTO dto);

	void displayAll();

	void displayAllAgeGreaterThenOrderByName(int age);

	void displayAllByGenderDescOrderByName(String gender);

	void displayAllBySalaryGreaterThanOrderByDesc(double salary);

	void displatCount();

	void displaySumOfSalary();
}
