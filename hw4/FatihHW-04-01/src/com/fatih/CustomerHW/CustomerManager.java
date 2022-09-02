package com.fatih.CustomerHW;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class CustomerManager {
	private String url="jdbc:postgresql://localhost/postgres";
	private String user="postgres";
	private String password="1234";
	private String driver="org.postgresql.Driver";

	public CustomerManager() {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean insert(Customer customer) throws Exception {

		Connection connection = DriverManager.getConnection(url, user, password);

		String sql = "INSERT INTO customer(customerName,totalCredit) VALUES(?,?)";

		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, customer.getCustomerName());
		statement.setDouble(2, customer.getTotalCredit());

		int affected = statement.executeUpdate();
		connection.close();

		return affected > 0;
	}

	public boolean update(Customer customer) throws Exception {

		Connection connection = DriverManager.getConnection(url, user, password);
		String sql = "UPDATE customer SET customerName=?, totalCredit=? WHERE customerId=?";

		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, customer.getCustomerName());
		statement.setDouble(2, customer.getTotalCredit());
		statement.setLong(3, customer.getCustomerId());

		int affected = statement.executeUpdate();
		connection.close();

		return affected > 0;
	}

	public boolean delete(long customerId ) throws Exception {

		Connection connection = DriverManager.getConnection(url, user, password);
		String sql="delete from Product where customerId=?";

		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setDouble(1, customerId);

		int affected = statement.executeUpdate();
		connection.close();

		return affected > 0;
	}

	public List<Customer> list() throws Exception {
		Connection connection = DriverManager.getConnection(url, user, password);
		String sql = "select * from customer";

		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultSet = statement.executeQuery();

		List<Customer> customerList = parseList(resultSet);
		connection.close();

		return customerList;
	}

	public List<Customer> list(double totalCredit) throws Exception {

		Connection connection = DriverManager.getConnection(url, user, password);
		String sql = "select * from customer WHERE totalCredit>=?";

		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setDouble(1, totalCredit);

		ResultSet resultSet = statement.executeQuery();

		List<Customer> customerList = parseList(resultSet);
		connection.close();

		return customerList;
	}

	public Customer find(long customerId) throws Exception {
		Customer customer = null;
		Connection connection = DriverManager.getConnection(url, user, password);
		String sql = "SELECT * FROM customer WHERE customerId=?";

		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setLong(1, customerId);

		ResultSet resultSet = statement.executeQuery();
		

		if (resultSet.next()) {
			customer = parse(resultSet);
		}

		connection.close();
		return customer;
	}

	public Customer parse(ResultSet resultSet) throws Exception {

		long customerId = resultSet.getLong("customerID");
		String customerName = resultSet.getString("customerName");
		double totalCredit = resultSet.getDouble("totalCredit");

		return new Customer(customerId, customerName, totalCredit);
	}

	public List<Customer> parseList(ResultSet resultSet) throws Exception {

		List<Customer> customerList = new ArrayList<>();

		while (resultSet.next()) {
			Customer customer = parse(resultSet);
			customerList.add(customer);
		}

		return customerList;
	}
	public List<Customer> listBySalesPriceGreater(double salesPriceMin) throws Exception{
		List<Customer> customerList=new ArrayList<>();
		Connection connection=DriverManager.getConnection(url,user,password);
		String sql = "select * from Product where salesPrice >= ?";
		PreparedStatement statement=connection.prepareStatement(sql);
		statement.setDouble(1, salesPriceMin);
		ResultSet resultSet=statement.executeQuery();
		while(resultSet.next()) {
			
			long customerId=resultSet.getLong("customertId");
			String customerName=resultSet.getString("customerName");
			double totalCredit=resultSet.getDouble("totalCredit");
			Customer customer= new Customer(customerId,customerName,totalCredit);
			customerList.add(customer);
		}
		

		connection.close();
		
		
		return customerList;	
	}
	
	

}
