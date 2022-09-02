package com.fatih.filerHW;

import java.util.ArrayList;
import java.util.List;



public class TestStore2 {
public static void main(String[] args) {
		
		
		try {
		List<Customer> customerList =new ArrayList<>();
		customerList .add((new Customer(601, "Cem karaca", 6540)));
		customerList .add((new Customer(602, "Barış Manço", 6540)));
		customerList .add((new Customer(603, "Fatih Özel", 6540)));
		
		
		String filePath="C:\\Users\\fatbj\\IbtecProjeler\\out.txt";
		CustomerFiler supplierFiler=new CustomerFiler(filePath);
		
		supplierFiler.store(customerList);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}

}
}
