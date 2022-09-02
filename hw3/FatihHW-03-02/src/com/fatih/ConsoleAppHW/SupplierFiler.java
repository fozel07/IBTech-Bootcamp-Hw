package com.fatih.ConsoleAppHW;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SupplierFiler extends BaseFiler<Supplier>{
	
	
	
	public SupplierFiler(String filePath) {
		super(filePath);
	}

	
	protected String format(Supplier supplier) {
		
		StringBuilder builder=new StringBuilder();
		builder.append(supplier.getSupplierId()).append(DELIMETER);
		builder.append(supplier.getSupplierName()).append(DELIMETER);
		builder.append(supplier.getTotalCredit());
		String line=builder.toString();
		return line;
		
	}

	protected Supplier parse(String line) {
		String [] tokens=line.split(DELIMETER);
		Supplier supplier=new Supplier();
		supplier.setSupplierId(Long.parseLong(tokens [0]));
		supplier.setSupplierName(tokens[1]);
		supplier.setTotalCredit(Double.parseDouble(tokens[2]));
		return supplier;
	}

	
	
	

}
