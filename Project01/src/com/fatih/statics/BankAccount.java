package com.fatih.statics;

public class BankAccount {
	
	public final static int MONTHS=12;
	private double investment;
	
	private static double rate;
	
	public double getAmount(int month) {
	      return investment*(1+month*rate/(MONTHS*100));	
	}
	public double getAmount() {
		return getAmount(MONTHS);
	}
	
	

	public double getInvestment() {
		return investment;
	}

	public void setInvestment(double investment) {
		this.investment = investment;
	}

	public static double getRate() {
		return rate;
	}

	public static void setRate(double rate) {
		BankAccount.rate = rate;
	}
	
	

}
