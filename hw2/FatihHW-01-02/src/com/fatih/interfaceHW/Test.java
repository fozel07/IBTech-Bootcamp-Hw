package com.fatih.interfaceHW;

public class Test {
	
	public static void main(String[] args) {
		
		IdentityFunction f1=new IdentityFunction();
		
		
		QuadraticPolynomial f2=new QuadraticPolynomial(2,4,-5);

		
		SinusoidalPolynomial f3=new SinusoidalPolynomial(1,2,3);
		
		
		
		FunctionDrawer drawer=new FunctionDrawer();
		
		System.out.println("Identity Function");
		drawer.draw(f1,10,15,100);
		System.out.println("Quadratic Polynomial ");
		drawer.draw(f2, -5, 5, 100);
		System.out.println("Sinusoidal Polynomial ");
		drawer.draw(f3, -5, 5, 100);
		
		
	}

}
