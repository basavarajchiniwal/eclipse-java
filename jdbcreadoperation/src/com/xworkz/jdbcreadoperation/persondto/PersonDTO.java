package com.xworkz.jdbcreadoperation.persondto;

import java.io.Serializable;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class PersonDTO implements Serializable {
	private int id;
	private String name;
	private String email;
	private long mobileNo;
	private String gender;
	private String qualification;
	private boolean marriedStatus;
	private boolean workStatus;
	private String companyName;
	private double salary;
	private int age;
	private int experience;
	private String location;
	private String city;
	private String state;
	private String country;
	private long aadhaarNo;
	private String panNo;
	private boolean alive;
	private long accountNo;

}
