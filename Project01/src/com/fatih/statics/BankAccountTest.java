package com.fatih.statics;

public class BankAccountTest {
	
	public static void main(String[] args) {
		
		BankAccount.setRate(24);
		
		BankAccount account1=new BankAccount();
		account1.setInvestment(3000);
		BankAccount.setRate(36);
		System.out.println("Tutar I 9 Aylık: "+account1.getAmount(9));
		System.out.println("Tutar I 12 Aylık: "+account1.getAmount(12));
		
		BankAccount account2=new BankAccount();
		account2.setInvestment(4000);
		System.out.println("Tutar II 9 Aylık: "+account2.getAmount(9));
		System.out.println("Tutar II 12 Aylık: "+account2.getAmount(12));
		
	}

}
