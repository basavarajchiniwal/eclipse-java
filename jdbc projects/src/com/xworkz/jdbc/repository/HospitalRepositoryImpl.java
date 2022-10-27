package com.xworkz.jdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import static com.xworkz.jdbc.repository.MysqlJDBConnector.*;
import com.xworkz.jdbc.dto.HospitalDTO;

public class HospitalRepositoryImpl implements HospitalRepository {

	@Override
	public boolean save(HospitalDTO dto) {
		System.out.println("Running Save Method To Repository");
		try {
			System.out.println("load the driver");
			Class.forName(DRIVER.getValue());
			System.out.println("register the driver");

			Connection connection = DriverManager.getConnection(URL.getValue(),
					NAME.getValue(), SECRET.getValue());
			String sql = "insert into hospital values(" + dto.getId() + ",'" + dto.getName() + "','" + dto.getFounder()
					+ "'," + "'" + dto.getSpecialization() + "'," + dto.getSince() + ");";
			System.out.println(sql);
			Statement createStatement = connection.createStatement();
			int execute = createStatement.executeUpdate(sql);
			if(execute>0) {
				System.out.println(execute);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return true;
	}

}
