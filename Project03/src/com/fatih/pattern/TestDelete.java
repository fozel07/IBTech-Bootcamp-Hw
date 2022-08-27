package com.fatih.pattern;

public class TestDelete {
	public static void main(String[] args) {
		try {
		ProductManager productManager=new ProductManager();
		boolean inserted=productManager.delete(4);
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
