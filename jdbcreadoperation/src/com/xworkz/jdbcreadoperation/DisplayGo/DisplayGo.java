package com.xworkz.jdbcreadoperation.DisplayGo;

import com.xworkz.jdbcreadoperation.personrepository.PersonRepository;
import com.xworkz.jdbcreadoperation.personrepositoryimpl.PersonRepositoryImpl;

public class DisplayGo {

	public static void main(String[] args) {
		PersonRepository personRepository = new PersonRepositoryImpl();
		personRepository.displayAll();
		System.out.println("==================================");
		personRepository.displayAllAgeGreaterThenOrderByName(25);
		System.out.println("<================================================>");
		personRepository.displayAllByGenderDescOrderByName("male");
		System.out.println("<================================================>");
		personRepository.displayAllBySalaryGreaterThanOrderByDesc(25000);
		System.out.println("<================================================>");
		personRepository.displatCount();
		System.out.println("<================================================>");
		personRepository.displaySumOfSalary();
	}

}
