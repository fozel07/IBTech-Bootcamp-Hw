package com.fatih.CustomerHW;

public class TestDelete {
	public static void main(String[] args) {
		
		
		
		try {
		CustomerManager customerManager=new CustomerManager();
		boolean inserted=customerManager.delete(4);
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
