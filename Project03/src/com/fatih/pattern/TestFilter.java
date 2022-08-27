package com.fatih.pattern;

import java.util.List;

public class TestFilter {
	public static void main(String[] args) throws Exception {
		ProductManager productManager=new ProductManager();
		List<Product> productList=productManager.listBySalesPriceGreater(4000);
		
		for (Product product : productList) {
			System.out.println(product.getProductId()+" "
					+product.getProductName()+" "
					+product.getSalesPrice());
			
		}
	}

}
