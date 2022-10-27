package com.xworkz.jdbcreadoperation.personrepositoryimpl;

/*import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.Statement;*/
import java.sql.*;

import com.xworkz.jdbcreadoperation.persondto.PersonDTO;
import com.xworkz.jdbcreadoperation.personenum.PersonEnum;
import com.xworkz.jdbcreadoperation.personrepository.PersonRepository;

public class PersonRepositoryImpl implements PersonRepository {

	@Override
	public boolean save(PersonDTO dto) {
		System.out.println("Running Save Method");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(PersonEnum.URL.getValue(), PersonEnum.NAME.getValue(),
					PersonEnum.SECRET.getValue());
			Statement createStatement = connection.createStatement();
			String sql = "insert into person values(" + dto.getId() + ",'" + dto.getName() + "','" + dto.getEmail()
					+ "'," + dto.getMobileNo() + ",'" + dto.getGender() + "','" + dto.getQualification() + "',"
					+ dto.isMarriedStatus() + "," + dto.isWorkStatus() + ",'" + dto.getCompanyName() + "',"
					+ dto.getSalary() + "," + dto.getAge() + "," + dto.getExperience() + ",'" + dto.getLocation()
					+ "','" + dto.getCity() + "','" + dto.getState() + "','" + dto.getCountry() + "',"
					+ dto.getAadhaarNo() + ",'" + dto.getPanNo() + "'," + dto.isAlive() + "," + dto.getAccountNo()
					+ ");";
			int executeUpdate = createStatement.executeUpdate(sql);
			System.out.println(sql);
			System.out.println(executeUpdate);

		} catch (Exception e) {
			e.printStackTrace();
			e.getStackTrace();
		}
		return true;
	}

	@Override
	public void displayAll() {
		System.out.println("Running Save Method");
		try {
			Class.forName(PersonEnum.DRIVER.getValue());
			Connection connection = DriverManager.getConnection(PersonEnum.URL.getValue(), PersonEnum.NAME.getValue(),
					PersonEnum.SECRET.getValue());
			Statement createStatement = connection.createStatement();
			String display = "select * from person";
			ResultSet executeQuery = createStatement.executeQuery(display);
			while (executeQuery.next()) {
				int id = executeQuery.getInt(1);
				String name = executeQuery.getString(2);
				String email = executeQuery.getString(3);
				long mobileNumber = executeQuery.getLong(4);
				String gender = executeQuery.getString(5);
				String qualification = executeQuery.getString(6);
				boolean married = executeQuery.getBoolean(7);
				boolean working = executeQuery.getBoolean(8);
				String companyName = executeQuery.getString(9);
				int salary = executeQuery.getInt(10);
				int age = executeQuery.getInt(11);
				double experience = executeQuery.getDouble(12);
				String location = executeQuery.getString(13);
				String city = executeQuery.getString(14);
				String state = executeQuery.getString(15);
				String country = executeQuery.getString(16);
				long aadhaarNumber = executeQuery.getLong(17);
				String panNumber = executeQuery.getString(18);
				boolean alive = executeQuery.getBoolean(19);
				long bankAccountNo = executeQuery.getLong(20);

				System.out.println(id + " " + name + " " + email + " " + mobileNumber + " " + gender + " "
						+ qualification + " " + married + " " + working + " " + companyName + " " + salary + " " + age
						+ " " + experience + " " + location + " " + city + " " + state + " " + country + " "
						+ aadhaarNumber + " " + panNumber + " " + alive + " " + bankAccountNo);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void displayAllAgeGreaterThenOrderByName(int age) {

		try {
			Class.forName(PersonEnum.DRIVER.getValue());
			Connection connection = DriverManager.getConnection(PersonEnum.URL.getValue(), PersonEnum.NAME.getValue(),
					PersonEnum.SECRET.getValue());
			Statement connStatement = connection.createStatement();
			String sql = "select * from person where age>25 order by name";
			ResultSet executeQuery = connStatement.executeQuery(sql);
			while (executeQuery.next()) {
				String name = executeQuery.getString("name");
				int age1 = executeQuery.getInt("age");

				System.out.println(name + " " + age1);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void displayAllByGenderDescOrderByName(String gender) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("data loaded and  register");
			Connection connection = DriverManager.getConnection(PersonEnum.URL.getValue(),
					PersonEnum.NAME.getValue(), PersonEnum.SECRET.getValue());
			String sql = "select * from person where gender='male' order by name desc";

			Statement createStatement = connection.createStatement();
			ResultSet execute = createStatement.executeQuery(sql);

			while (execute.next()) {

				String gender1 = execute.getString("gender");
				String name = execute.getString("name");

				System.out.println(name + " " + gender1);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void displayAllBySalaryGreaterThanOrderByDesc(double salary) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("data loaded and register");
			Connection connection = DriverManager.getConnection(PersonEnum.URL.getValue(),
					PersonEnum.NAME.getValue(), PersonEnum.SECRET.getValue());
			String sql = "select * from person where salary>=25000 order by salary desc";
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(sql);
			while (executeQuery.next()) {
				String name = executeQuery.getString("name");
				double salary1 = executeQuery.getDouble("salary");

				System.out.println(name + " " + salary1);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void displatCount() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("data loaded and register");
			Connection connection = DriverManager.getConnection(PersonEnum.URL.getValue(),
					PersonEnum.NAME.getValue(), PersonEnum.SECRET.getValue());
			String sql = "select count(*)as id from person";
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(sql);
			while (executeQuery.next()) {

				int id = executeQuery.getInt("id");
				System.out.println("total counts id" + id);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void displaySumOfSalary() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("data loaded and register");
			Connection connection = DriverManager.getConnection(PersonEnum.URL.getValue(),
					PersonEnum.NAME.getValue(), PersonEnum.SECRET.getValue());
			String sql = "select sum(salary) as salary from person";
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(sql);
			while (executeQuery.next()) {
				double salary = executeQuery.getDouble("salary");
				System.out.println("total salary" + salary);

			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
