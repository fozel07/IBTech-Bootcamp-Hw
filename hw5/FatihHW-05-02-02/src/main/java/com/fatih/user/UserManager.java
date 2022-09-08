package com.fatih.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




public class UserManager {
	private String url="jdbc:postgresql://localhost/postgres";
	private String user="postgres";
	private String password="1234";
	private String driver="org.postgresql.Driver";

	public UserManager() {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public User findByUserName(String userName) throws Exception {
		User customer = null;
		Connection connection = DriverManager.getConnection(url, user, password);
		String sql = "SELECT * FROM usertable WHERE userName=?";

		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, userName);

		ResultSet resultSet = statement.executeQuery();
		

		if (resultSet.next()) {
			customer = parse(resultSet);
		}

		connection.close();
		return customer;
	}
	
	public User parse(ResultSet resultSet) throws Exception {

		long userId = resultSet.getLong("userId");
		String userName = resultSet.getString("userName");
		String userPassword = resultSet.getString("userPassword");

		return new User(userId, userName, userPassword);
	}
	public boolean create(User user1) throws Exception {

		if(findByUserName(user1.getUserName())==null) {
		Connection connection = DriverManager.getConnection(url, user, password);

		String sql = "INSERT INTO usertable(userName,userpassword) VALUES(?,?)";

		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, user1.getUserName());
		statement.setString(2, user1.getUserPassword());

		int affected = statement.executeUpdate();
		connection.close();

		return affected > 0;
		}	
		else {
			return false;
		}
		
	}
}
