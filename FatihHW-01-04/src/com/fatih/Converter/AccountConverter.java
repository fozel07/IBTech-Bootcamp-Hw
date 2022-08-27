package com.fatih.Converter;



public class AccountConverter {
	
     private long accountId;
	
	 private String accountName;
	
	 private double amountLocal;

	public AccountConverter(long accountId, String accountName, double amountLocal) {
		this.accountId = accountId;
		this.accountName = accountName;
		this.amountLocal = amountLocal;
	}
	public AccountConverter() {
		
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getAmountLocal() {
		return amountLocal;
	}

	public void setAmountLocal(double amountLocal) {
		this.amountLocal = amountLocal;
	}
	
	
	public AccountConverter parse(String line) {
		
		AccountConverter account=new AccountConverter();
		
		String tokens[]=line.split(";");
		
		account.setAccountId(Long.parseLong(tokens[0]));
		account.setAccountName(tokens[1]);
		account.setAmountLocal(Long.parseLong(tokens[2]));
		
		return account;
	}
	public String format(AccountConverter account) {
		String str=new StringBuilder("")
				.append(account.getAccountId()).append(";")
				.append(account.getAccountName()).append(";")
				.append(account.getAmountLocal()).toString();
		
		
		
		return str;				
	}
	
	

}
