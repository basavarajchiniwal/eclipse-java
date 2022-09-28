package com.xworkz.registration;

public class RegistrationDto {

	private String name;
	private String email;
	private Long phoneNo;
	private Long altPhoneNo;
	private String gender;
	private String qualification;
	private Integer yop;
	private String University;
	private String address;
	private String skills;
	private String skill1;
	private String skill2;
	private String skill3;
	private String skill4;
	private String skill5;
	private String skill6;
	private String skill7;
	private String skill8;
	private String skill9;
	private String skill10;
	private String skill11;
	private String skill12;
	private String skill13;
	private String skill14;
	private Double salary;
	private Integer exp;
	private String idProof;
	private String idProofNo;

	public RegistrationDto() {
		System.out.println("def constructor");
	}

	public RegistrationDto(String name, String email, Long phoneNo, Long altPhoneNo, String gender,
			String qualification, Integer yop, String university, String address, String skills, String skill1,
			String skill2, String skill3, String skill4, String skill5, String skill6, String skill7, String skill8,
			String skill9, String skill10, String skill11, String skill12, String skill13, String skill14,
			Double salary, Integer exp, String idProof, String idProofNo) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.altPhoneNo = altPhoneNo;
		this.gender = gender;
		this.qualification = qualification;
		this.yop = yop;
		University = university;
		this.address = address;
		this.skills = skills;
		this.skill1 = skill1;
		this.skill2 = skill2;
		this.skill3 = skill3;
		this.skill4 = skill4;
		this.skill5 = skill5;
		this.skill6 = skill6;
		this.skill7 = skill7;
		this.skill8 = skill8;
		this.skill9 = skill9;
		this.skill10 = skill10;
		this.skill11 = skill11;
		this.skill12 = skill12;
		this.skill13 = skill13;
		this.skill14 = skill14;
		this.salary = salary;
		this.exp = exp;
		this.idProof = idProof;
		this.idProofNo = idProofNo;
	}

}
