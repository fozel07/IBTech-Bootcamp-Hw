package com.fatih.filerHW;

import java.io.IOException;
import java.util.List;



public class TestLoad2 {
	 public static void main(String[] args) throws IOException {
		    String filePath="C:\\Users\\fatbj\\IbtecProjeler\\out.txt";
			CustomerFiler customerFiler=new CustomerFiler(filePath);
			List<Customer> customerList=customerFiler.load();
			
			for (Customer  customer : customerList) {
				
				System.out.println(
						customer.getCustomerId() + " " + 
				        customer.getCustomerName() + " " + 
						customer.getTotalDebit());
				
			}
		
		 
	 }

}
