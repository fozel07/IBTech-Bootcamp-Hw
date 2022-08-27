package com.fatih.filer;

import java.util.ArrayList;
import java.util.List;

public class TestStore {
	public static void main(String[] args) {
		
		
		try {
		List<Supplier> supplierList=new ArrayList<>();
		supplierList.add((new Supplier(601, "Cem karaca", 6540)));
		supplierList.add((new Supplier(602, "Barış Manço", 6540)));
		supplierList.add((new Supplier(603, "Fikret Kızılok", 6540)));
		
		
		String filePath="C:\\Users\\fatbj\\IbtecProjeler\\out.txt";
		SupplierFiler supplierFiler=new SupplierFiler(filePath);
		
		supplierFiler.store(supplierList);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
