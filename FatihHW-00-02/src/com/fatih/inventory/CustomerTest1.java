package com.fatih.inventory;

public class CustomerTest1 {
	public static void main(String[] args) {
		Customer product=new Customer();
		product.setCustomerId(501);
		product.setCustomerName("Neşet Ertaş");
		product.setTotalDebit(4350);
		System.out.println(product.getCustomerId()+" "+product.getCustomerName()+" "+product.getTotalDebit());

		
		
		
		}

}
