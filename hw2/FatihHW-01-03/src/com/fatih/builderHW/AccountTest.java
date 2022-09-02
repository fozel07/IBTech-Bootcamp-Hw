package com.fatih.builderHW;



public class AccountTest {
	public static void main(String[] args) {
		
		String line="601;Kasa Hesabı;23560";
		
		Account account=new Account();
		
		String tokens[]=line.split(";");
		
		account.setAccountId(Long.parseLong(tokens[0]));
		account.setAccountName(tokens[1]);
		account.setAmountLocal(Long.parseLong(tokens[2]));
		System.out.println(account.getAccountId()+" "+account.getAccountName()+" "+ account.getAmountLocal());

		
		String str=new StringBuilder("")
				.append(account.getAccountId()).append(";")
				.append(account.getAccountName()).append(";")
				.append(account.getAmountLocal()).toString();
		System.out.println(str);
		
		
		
		
		
  }
}
