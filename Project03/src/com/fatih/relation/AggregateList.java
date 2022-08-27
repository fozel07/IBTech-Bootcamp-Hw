package com.fatih.relation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AggregateList {
	
	public static void main(String[] args) throws Exception {

		String url = "jdbc:postgresql://localhost/postgres";
		String user = "postgres";
		String password = "1234";

		String driver = "org.postgresql.Driver";
		Class.forName(driver);
		// Class.forName(driver).newInstance();

		Connection connection = DriverManager.getConnection(url, user, password);

		String sql = "select e.departmentid, departmentname ,sum(monthlySalary) as salarySum\r\n"
				+ "from employee e \r\n"
				+ " right join department d on e.departmentid  = d.departmentid\r\n"
				+ "group by e.departmentid ,d.departmentname";
		PreparedStatement statement=connection.prepareStatement(sql);
		ResultSet resultSet=statement.executeQuery();
		while(resultSet.next()) {
			
			long departmentId=resultSet.getLong("departmentid");
			String departmentName=resultSet.getString("departmentName");
			double salarySum=resultSet.getDouble("salarySum");
			
			
			System.out.println(departmentId+" "+departmentName+" "+salarySum);
		}
		

		connection.close();

		

	}

}
