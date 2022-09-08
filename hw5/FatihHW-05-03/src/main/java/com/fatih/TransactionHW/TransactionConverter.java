package com.fatih.TransactionHW;



public class TransactionConverter {
	private final String DELIMETER=";";
	
	
	public String format (Transaction transaction){
        String builder = new StringBuilder().
        append(transaction.getTransactionId()).append(";").
        append(transaction.getTransactionName()).append(";").
        append(transaction.getAmountLocal()).append(";").
        toString();

        return builder;
    }
	public Transaction parse(String line) {
		String [] tokens=line.split(DELIMETER);
		Transaction transaction=new Transaction();
		transaction.setTransactionId(Long.parseLong(tokens [0]));
		transaction.setTransactionName(tokens[1]);
		transaction.setAmountLocal(Double.parseDouble(tokens[2]));
		return transaction;
	}

	

}
