package com.fatih.inheritanceHW;


public class Test {
	public static void main(String[] args) {
		Employee employee=new Employee(201,"Erkan","Ocaklı",5470);
		employee.setEmailAddress("erkan@godoro.com");

		
		
		  sendMail(employee);

		
		
	}
	
	
	private static void sendMail(Employee employee) {
		System.out.println();
		System.out.println("Kime: "+employee.getEmailAddress());
		System.out.println("Konu: "+employee.getGreeting());
		System.out.println("Gövde: "+employee.getFullName());
		
		
	}
	

}
