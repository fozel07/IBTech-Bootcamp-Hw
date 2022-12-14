package com.fatih.player.database.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

abstract public class BaseManager<E> {
	private String url="jdbc:postgresql://localhost/postgres";
	private String user="postgres";
	private String password="1234";
	private String driver="org.postgresql.Driver";
	protected Connection connection;


	public BaseManager() {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void connect() throws Exception {
		connection = DriverManager.getConnection(url, user, password);
	}

	protected void disconnect() throws Exception {
		connection.close();
	}

	protected List<E> parseList(ResultSet resultSet) throws Exception {
		List<E> entityList = new ArrayList<>();
		while (resultSet.next()) {
			entityList.add(parse(resultSet));
		}
		return entityList;
	}

	protected abstract E parse(ResultSet resultSet) throws Exception;



}
