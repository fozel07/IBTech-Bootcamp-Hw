package com.fatih.relation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RelationList {
	
	
	public static void main(String[] args) throws Exception {

		String url = "jdbc:postgresql://localhost/postgres";
		String user = "postgres";
		String password = "1234";

		String driver = "org.postgresql.Driver";
		Class.forName(driver);
		// Class.forName(driver).newInstance();

		Connection connection = DriverManager.getConnection(url, user, password);

		String sql = "select * from employee e \r\n"
				+ "left join department d on e.departmentid =d.departmentid ";
		PreparedStatement statement=connection.prepareStatement(sql);
		ResultSet resultSet=statement.executeQuery();
		while(resultSet.next()) {
			
			long employeeId=resultSet.getLong("employeeId");
			String employeeName=resultSet.getString("employeeName");
			double monthlysalary=resultSet.getDouble("monthlysalary");
			long departmentId=resultSet.getLong("departmentid");
			String departmentName=resultSet.getString("departmentName");
			System.out.println(employeeId+" "+employeeName+" "+monthlysalary+" "+departmentId+" "+departmentName);
		}
		

		connection.close();

		

	}

}
