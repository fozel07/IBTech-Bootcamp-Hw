package com.fatih.inheritanceHW;

public class Employee extends Person{
	
	
	
	protected long employeeId;
	
	protected long monthlySalary;

	public Employee(long employeeId, String firstName, String lastName,  long monthlySalary) {
		super(firstName, lastName);
		this.employeeId = employeeId;
		this.monthlySalary = monthlySalary;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public long getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(long monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	@Override
	protected String getGreeting() {
		return "Merhaba";
	}

	
	
	
	

}
