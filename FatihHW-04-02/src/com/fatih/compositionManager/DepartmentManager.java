package com.fatih.compositionManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.fatih.compositionHW.Department;

public class DepartmentManager extends BaseManager<Department> {

	public Department find(long departmentId) throws Exception {
		Department department = null;
		connect();

		String sql = "SELECT * FROM employee WHERE employeeId=?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setLong(1, departmentId);
		ResultSet resultSet = statement.executeQuery();
		if (resultSet.next()) {
			department = parse(resultSet);
		}
		disconnect();
		return department;
	}

	public List<Department> list() throws Exception {
		connect();
		String sql = "SELECT * FROM department";
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultSet = statement.executeQuery();
		List<Department> departmentList = parseList(resultSet);
		disconnect();
		return departmentList;
	}


	protected Department parse(ResultSet resultSet) throws Exception {

		long departmentId = resultSet.getLong("departmentId");
		String departmentName = resultSet.getString("departmentName");

		Department department = new Department(departmentId, departmentName);

		return department;
	}

}
