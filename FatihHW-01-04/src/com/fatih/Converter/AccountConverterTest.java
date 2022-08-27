package com.fatih.Converter;

public class AccountConverterTest {
	
	public static void main(String[] args) {
		
		String line="601;Kasa Hesabı;23560";
		
		AccountConverter account=new AccountConverter();
		account=account.parse(line);
		System.out.println(account.getAccountId()+" "+account.getAccountName()+" "+ account.getAmountLocal());
		
		String str=account.format(account);
		System.out.println(str);
		

		
	}

}
