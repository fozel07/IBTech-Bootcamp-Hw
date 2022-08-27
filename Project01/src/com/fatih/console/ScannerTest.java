package com.fatih.console;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("uzun:");
		long l=scanner.nextLong();
		
		System.out.println("Sicim:");
		String s=scanner.next();
		
		System.out.println("İkişer:");
		double d=scanner.nextDouble();
		
		
	
	}

}
