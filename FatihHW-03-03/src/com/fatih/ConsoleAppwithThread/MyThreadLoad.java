package com.fatih.ConsoleAppwithThread;

import java.io.IOException;
import java.util.List;

public class MyThreadLoad extends Thread {
	
	
	
	private final static String PATH = "C:\\Users\\fatbj\\IbtecProjeler\\out.txt";

	@Override
	public void run() {
		while(true) {
			
			
			try {
				SupplierFiler supplierFiler=new SupplierFiler(PATH);
				List<Supplier> supplierList = supplierFiler.load();
				System.out.println("Yüklendi");
				Thread.sleep(500);
			} catch  (IOException | InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
