package com.xworkz.jdbcreadoperation.personrepositoryimpl;

import lombok.Getter;

@Getter
public enum MysqlConstant {
	URL("jdbc:mysql://Localhost:3306/jdbc"), DONTSEE("xworkz@123"), NAME("root");

	private String value;

	private MysqlConstant(String value) {
		this.value = value;

	}
}
