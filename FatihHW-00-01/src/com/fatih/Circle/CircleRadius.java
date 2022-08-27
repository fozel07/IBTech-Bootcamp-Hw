package com.fatih.Circle;

public class CircleRadius {
	private int r;

	public CircleRadius(int r) {
		this.r = r;
	}

	public int getR() {
		return r;
	}
	
	

	public void setR(int r) {
		this.r = r;
	}
	public double getArea() {				
		return  Math.PI*(r*r);  
	}
	
	

}
