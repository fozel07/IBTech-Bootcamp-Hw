package com.fatih.pattern;

public class TestInsert {
	public static void main(String[] args) {
		try {
		Product product=new Product(0,"Buzdolabı",4350);
		ProductManager productManager=new ProductManager();
		boolean inserted=productManager.insert(product);
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
