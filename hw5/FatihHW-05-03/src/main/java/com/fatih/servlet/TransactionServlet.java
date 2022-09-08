package com.fatih.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fatih.TransactionHW.Transaction;
import com.fatih.TransactionHW.TransactionConverter;


@WebServlet("/transaction")
public class TransactionServlet extends HttpServlet{
	
	@Override
	protected void doGet (HttpServletRequest request , HttpServletResponse response)
	throws ServletException, IOException
	{	response.setContentType("text/html; charset=UTF-8");
		Transaction transaction=new Transaction(501,"Elektirk Ödemesi",5460);
		TransactionConverter transactionConverter=new TransactionConverter();
		
		String line = transactionConverter.format(transaction);
		response.getWriter().write(line);
		
		
		
	}

}
