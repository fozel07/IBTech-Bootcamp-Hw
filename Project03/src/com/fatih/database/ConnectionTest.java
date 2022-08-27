package com.fatih.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	
	public static void main(String[] args) throws Exception {
		
		String url="jdbc:postgresql://localhost/postgres";
		String user="postgres";
		String password="1234";
		
		String driver="org.postgresql.Driver";
		Class.forName(driver);
		//Class.forName(driver).newInstance();
		
		Connection connection=DriverManager.getConnection(url,user,password);
		
		System.out.println(connection.getMetaData().getDatabaseProductName());
	
		connection .close();
		
	}

}
