package com.fatih.inheritance;

public class Test {
	public static void main(String[] args) {
		Customer customer=new Customer(401,"Neşet","Ertaş",3450);
		customer.setEmailAddress("neset@godoro.com");
		
		Person person=new Customer(402,"Mahsuni","Şerif",6430);
		person.setEmailAddress("mahsuni@godoro.com");
		
		Supplier supplier=new Supplier(701,"Orhan","Gencebay",8125);
		supplier.setEmailAddress("orhan@godor.com");
		
		System.out.println(customer.getGreeting()+" "+customer.getFullName());
		System.out.println(person.getGreeting()+" "+person.getFullName());
		System.out.println(supplier.getGreeting()+" "+ supplier.getFullName());
		
		sendMail(customer);
		sendMail(person);
		sendMail(supplier);
		
		
	}
	
	private static void sendMail(Person person) {
		System.out.println();
		System.out.println("Kime: "+person.getEmailAddress());
		System.out.println("Konu: "+person.getGreeting());
		System.out.println("Gövde: "+person.getFullName());
		
		
	}
	
	

}
