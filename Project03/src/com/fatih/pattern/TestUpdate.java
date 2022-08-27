package com.fatih.pattern;

public class TestUpdate {
public static void main(String[] args) {
	try {
		Product product=new Product(4,"Mikser",450);
		ProductManager productManager=new ProductManager();
		boolean inserted=productManager.update(product);
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
