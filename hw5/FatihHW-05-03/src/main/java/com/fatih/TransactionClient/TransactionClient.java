package com.fatih.TransactionClient;

import static com.fatih.utils.StreamUtilities.get;

import com.fatih.TransactionHW.Transaction;
import com.fatih.TransactionHW.TransactionConverter;

public class TransactionClient {
	public static void main(String[] args) throws Exception {
		String address="http://localhost:8081/FatihHW-05-03/transaction";
		String text=get(address);
		
		TransactionConverter converter = new TransactionConverter();
		Transaction transaction = converter.parse(text);
		
		System.out.println(transaction.getTransactionId() + " " + transaction.getTransactionName() + " " + transaction.getAmountLocal());
		
	}

}
