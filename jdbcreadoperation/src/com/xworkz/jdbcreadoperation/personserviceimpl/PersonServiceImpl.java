package com.xworkz.jdbcreadoperation.personserviceimpl;

import com.xworkz.jdbcreadoperation.persondto.PersonDTO;
import com.xworkz.jdbcreadoperation.personrepository.PersonRepository;
import com.xworkz.jdbcreadoperation.personrepositoryimpl.PersonRepositoryImpl;
import com.xworkz.jdbcreadoperation.personservice.PersonService;

public class PersonServiceImpl implements PersonService {

	@Override
	public boolean validateAndSave(PersonDTO dto) {
		System.out.println("Running Validate and Save Method");
		int id = dto.getId();
		String name = dto.getName();
		String email = dto.getEmail();
		long mobileNo = dto.getMobileNo();
		String gender = dto.getGender();
		String qualification = dto.getQualification();
		boolean marriedStatus = dto.isMarriedStatus();
		boolean workStatus = dto.isWorkStatus();
		String companyName = dto.getCompanyName();
		double salary = dto.getSalary();
		int age = dto.getAge();
		int experience = dto.getExperience();
		String location = dto.getLocation();
		String city = dto.getCity();
		String state = dto.getState();
		String country = dto.getCountry();
		long aadhaarNo = dto.getAadhaarNo();
		String panNo = dto.getPanNo();
		boolean alive = dto.isAlive();
		long accountNo = dto.getAccountNo();
		if (id > 0 && id <= 50) {
			System.out.println("Valid ID");
			if (name != null && name.length() >= 2 && name.length() <= 50) {
				System.out.println("Valid name");
				if (email != null && email.length() >= 10 && email.length() <= 50) {
					System.out.println("valid email");
					if (mobileNo > 999999999l && mobileNo < 99999999999l) {
						System.out.println("Valid Mobile Number");
						if (gender != null && gender == "male" || gender == "female") {
							System.out.println("valid Gender");
							if (qualification.length() >= 2 && qualification.length() <= 5) {
								System.out.println("valid Qualification");
								if (marriedStatus == true || marriedStatus == false) {
									System.out.println("valid Married Status");
									if (workStatus == true || workStatus == false) {
										System.out.println("valid Work Status ");
										if (companyName != null && companyName.length() >= 2
												&& companyName.length() <= 50) {
											System.out.println("Valid Company Name");
											if (salary >= 10000 && salary <= 100000) {
												System.out.println("Valid Salary");
												if (age >= 18 && age <= 60) {
													System.out.println("Valid Age");
													if (experience >= 0 && experience <= 42) {
														System.out.println("Valid Experience");
														if (location != null && location.length() >= 2
																&& location.length() <= 200) {
															System.out.println("Valid Location");
															if (city != null && city.length() >= 3
																	&& city.length() <= 15) {
																System.out.println("Valid City");
																if (state != null && state.length() >= 4
																		&& state.length() <= 15) {
																	System.out.println("valid state");
																	if (country != null && country.length() >= 5
																			&& country.length() <= 15) {
																		System.out.println("valid Country");
																		if (aadhaarNo != 0 && aadhaarNo > 9999999999l
																				&& aadhaarNo < 99999999999999l) {
																			System.out.println("Valid Aadhaar Number");
																			if (panNo != null && panNo.length() > 2
																					&& panNo.length() < 15) {
																				System.out.println("Valid Pan Number");
																				if (alive == true || alive == false) {
																					System.out.println("Valid ALive");
																					System.out.println("check");
																					if (accountNo != 0
																							&& accountNo >= 99999999l
																							&& accountNo <= 999999999999l) {
																						System.out.println(
																								"Valid Account Number");

																						PersonRepository personRepository = new PersonRepositoryImpl();
																						personRepository.save(dto);

																					} else {
																						System.err.println(
																								"Invalid Account Number");
																					}
																				} else {
																					System.err.println("Invalid Alive");
																				}

																			} else {
																				System.err
																						.println("Invalid Pan Number");
																			}
																		} else {
																			System.err
																					.println("Invalid Aadhaar Number");
																		}
																	} else {
																		System.err.println("Invalid Country");
																	}
																} else {
																	System.err.println("Invalid State");
																}
															} else {
																System.err.println("Invalid City");
															}
														} else {
															System.err.println("Invalid Location");
														}
													} else {
														System.err.println("Invalid Experience");
													}
												} else {
													System.err.println("Invalid Age");
												}
											} else {
												System.err.println("Invalid Salary");
											}
										} else {
											System.err.println("Invalid Company Name");
										}
									} else {
										System.err.println("Invalid Work Status");
									}
								} else {
									System.err.println("Invalid Married status");
								}
							} else {
								System.err.println("Invalid Qualification");
							}

						} else {
							System.err.println("Invalid Gender");
						}

					} else {
						System.err.println("Invalid Mobile Number");
					}
				} else {
					System.err.println("Invalid Email");
				}
			} else {
				System.err.println("Invlid Name");
			}
		} else {
			System.err.println("Invalid ID");
		}

		return true;
	}

	@Override
	public void displayAll() {
		System.out.println("Read operation");
		PersonRepository personRepository = new PersonRepositoryImpl();
		personRepository.displayAll();
	}

	@Override
	public void displayAllAgeGreaterThenOrderByName(int age) {
		System.out.println("display all age who is having Greater then order By name");
		PersonRepository personRepository = new PersonRepositoryImpl();
		personRepository.displayAllAgeGreaterThenOrderByName(age);
	}

	@Override
	public void displayAllByGenderDescOrderByName(String gender) {
		System.out.println("display descending order By name");
		PersonRepository personRepository = new PersonRepositoryImpl();
		personRepository.displayAllByGenderDescOrderByName(gender);
	}

	@Override
	public void displayAllBySalaryGreaterThanOrderByDesc(double salary) {
		System.out.println("display all by salary Greater then order By descending");
		PersonRepository personRepository = new PersonRepositoryImpl();
		personRepository.displayAllBySalaryGreaterThanOrderByDesc(salary);

	}

	@Override
	public void displatCount() {
		System.out.println("display at count");
		PersonRepository personRepository = new PersonRepositoryImpl();
		personRepository.displatCount();

	}

	@Override
	public void displaySumOfSalary() {
		System.out.println("display sum of salary");
		PersonRepository personRepository = new PersonRepositoryImpl();
		personRepository.displaySumOfSalary();

	}

}
