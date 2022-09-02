package com.fatih.scannerHW;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		
		Account account=new Account();
		System.out.print("Kullanıcı id'si:");
		Scanner input1 = new Scanner(System.in);
		account.setAccountId(input1.nextInt());
		
		System.out.print("Kullanıcı ismi:");
		Scanner input2 = new Scanner(System.in);
		account.setAccountName(input2.nextLine());
		
		System.out.print("Tutar:");
		Scanner input3 = new Scanner(System.in);
		account.setAmountLocal(input3.nextDouble());
		
		
		System.out.println("Kullanıcı id'si: "+account.getAccountId()+" Kullanıcı ismi: "+account.getAccountName()+" Tutar: "+account.getAmountLocal());
		
		
	}

}
