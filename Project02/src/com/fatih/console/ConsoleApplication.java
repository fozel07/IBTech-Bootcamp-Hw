package com.fatih.console;

import java.util.Scanner;

public class ConsoleApplication {
	private static Scanner scanner=new Scanner(System.in);
	
	private static void printMenu() {
		
		System.out.println("Menü:");
		System.out.println("1. Yükle:");
		System.out.println("2. Sakla:");
		System.out.println("3. Dizelgele:");
		System.out.println("4. Ekle:");
		System.out.println("5. Güncelle:");
		System.out.println("6. Sil:");
		System.out.println("0. Çık");
		
	}
	private static int scanChoice() {
		System.out.println("Seçiniz:");
		int choice=scanner.nextInt();
        System.out.println("Seçilen: "+choice);
        return choice;
	}
	
	public static void main(String[] args) {
	 while(true) {	
		printMenu();
		int choice=scanChoice();
		switch(choice) {
		case 0:
			System.exit(0);
			break;
		default:
			System.out.println("Geçersiz seçim : "+choice);
		}
		
	 }
	}

}
