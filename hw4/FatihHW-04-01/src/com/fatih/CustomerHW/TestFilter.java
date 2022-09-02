package com.fatih.CustomerHW;

import java.util.List;

public class TestFilter {
	public static void main(String[] args) throws Exception {
		CustomerManager customerManager=new CustomerManager();

		List<Customer> customerList=customerManager.listBySalesPriceGreater(4000);
		
		for (Customer customer : customerList) {
			System.out.println(customer.getCustomerId() + " "  + 
							   customer.getCustomerName() + " " +
							   customer.getTotalCredit());
				
		}
		
	}

}
