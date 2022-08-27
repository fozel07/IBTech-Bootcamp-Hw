package com.fatih.inventory;

public class ProductTest1 {
	public static void main(String[] args) {
	Product product=new Product();
	product.setProductId(501);
	product.setProductName("Cep telefonu");
	product.setSalesPrice(1300);
	System.out.println(product.getProductId()+" "+product.getProductName()+" "+product.getSalesPrice());

	
	
	
	}

}
