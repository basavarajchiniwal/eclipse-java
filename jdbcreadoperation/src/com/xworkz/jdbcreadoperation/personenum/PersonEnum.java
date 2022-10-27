package com.xworkz.jdbcreadoperation.personenum;

import lombok.Getter;

@Getter
public enum PersonEnum {

	URL("jdbc:mysql://Localhost:3306/persons"), NAME("root"), SECRET("xworkz@123"), DRIVER("com.mysql.cj.jdbc.Driver");

	private String value;

	private PersonEnum(String value) {
		this.value = value;
	}

}
