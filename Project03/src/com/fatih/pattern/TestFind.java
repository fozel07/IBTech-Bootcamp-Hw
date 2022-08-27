package com.fatih.pattern;

import java.util.List;

public class TestFind {
	public static void main(String[] args) throws Exception {
		ProductManager productManager=new ProductManager();
		Product product=productManager.find(5);
		
		
			System.out.println(product.getProductId()+" "
					+product.getProductName()+" "
					+product.getSalesPrice());
			
		
		
		
	}

}
