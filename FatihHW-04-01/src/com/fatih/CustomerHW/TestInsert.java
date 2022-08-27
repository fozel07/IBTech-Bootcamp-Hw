package com.fatih.CustomerHW;

public class TestInsert {
	public static void main(String[] args) {
		try {
		Customer customer=new Customer(0,"Fatih",4350);
		CustomerManager customerManager = new CustomerManager();

		boolean inserted=customerManager.insert(customer);
		if(inserted) {
		   System.out.println("Ürün sokuldu");
		}
		else {
			System.out.println("Ürün eklenemedi");
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
