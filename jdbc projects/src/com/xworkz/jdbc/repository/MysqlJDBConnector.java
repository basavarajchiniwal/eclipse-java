package com.xworkz.jdbc.repository;

import lombok.Getter;

@Getter
public  enum MysqlJDBConnector {
	URL("jdbc:mysql://Localhost:3306/jdbcconnetion"), NAME("root"), SECRET("xworkz@123"),DRIVER("com.mysql.cj.jdbc.Driver");

	private String value;

	private MysqlJDBConnector(String value) {
		this.value = value;
	}
}
