package com.fatih.CustomerHW;

public class TestUpdate {
public static void main(String[] args) {
	try {
		Customer customer=new Customer(4,"Ahmet",450);
		CustomerManager customerManager = new CustomerManager();
		boolean inserted=customerManager.update(customer);
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
