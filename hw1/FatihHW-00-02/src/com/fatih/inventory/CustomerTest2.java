package com.fatih.inventory;

public class CustomerTest2 {
	public static void main(String[] args) {
		Customer customer=new Customer(501,"Neşet Ertaş",4350);
		System.out.println("Müşteri id: " +customer.getCustomerId());
		System.out.println("Müşteri Adı:  "+customer.getCustomerName());
		System.out.println("Toplam borç: "+customer.getTotalDebit());
	}

	
}
