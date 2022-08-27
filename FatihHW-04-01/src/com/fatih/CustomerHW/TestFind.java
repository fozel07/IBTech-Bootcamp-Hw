package com.fatih.CustomerHW;

import java.util.List;

public class TestFind {
	public static void main(String[] args) throws Exception {
		CustomerManager customerManager=new CustomerManager();
		Customer customer=customerManager.find(5);
		
		
		System.out.println(
				customer.getCustomerId() + " " +
				customer.getCustomerName() + " " + 
				customer.getTotalCredit());
			
		
		
		
	}

}
