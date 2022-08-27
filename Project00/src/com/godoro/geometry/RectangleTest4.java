package com.godoro.geometry;

public class RectangleTest4 {
	
	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(3,4);
		rectangle.setWidth(-3);
		rectangle.setHeight(-4);
		int area=rectangle.getArea();
		int perimeter=rectangle.getPerimeter();
		System.out.println("alanı:"+area+" "+"çevresi:"+perimeter);
		
		
		
	}
	

}
