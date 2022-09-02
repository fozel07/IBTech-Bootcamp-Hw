package com.fatih.interfaceHW;

public class FunctionDrawer {
	
	void draw(MathFunction function,double x1, double x2, int n){
		double dx = (x2-x1)/n;
		double x = 0;
		double y = 0;
		for (double i = x1; i < x2; i++) {
			x+=dx;
			y=function.evaluate(x);
			System.out.println("x: "+x+" y: "+y);
			
			
			
		}
		 
	}

	
	

}
