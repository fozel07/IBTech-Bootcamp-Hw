package com.fatih.ConsoleAppHW;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleApplication {
	private static Scanner scanner = new Scanner(System.in);
	private static List<Supplier> supplierList = new ArrayList<>();
	private final static String PATH = "C:\\Users\\fatbj\\IbtecProjeler\\out.txt";

	private static void printMenu() {

		System.out.println("Menü:");
		System.out.println("1. Yükle:");
		System.out.println("2. Sakla:");
		System.out.println("3. Dizelgele:");
		System.out.println("4. Bul:");
		System.out.println("5. Ekle:");
		System.out.println("6. Güncelle:");
		System.out.println("7. Sil:");
		System.out.println("0. Çık");

	}

	private static int scanChoice() {
		System.out.println("Seçiniz:");
		int choice = scanner.nextInt();
		System.out.println("Seçilen: " + choice);
		return choice;
	}

	private static void doList() {
		System.out.println("Dizelgeleniyor...");
		if (supplierList.size() > 0) {
			for (Supplier supplier : supplierList) {
				System.out.println(
						supplier.getSupplierId() + " " + supplier.getSupplierName() + " " + supplier.getTotalCredit());
			}

		} else {
			System.out.println("Liste boş, yeni sağlayıcı ekleyiniz");
		}
	}
	private static void doStore() throws IOException {
		System.out.println("Saklanıyor...");
		System.out.println();

		SupplierFiler supplierFiler = new SupplierFiler(PATH);
		supplierFiler.store(supplierList);

		System.out.println("saklandı");
	}
	private static void doLoad() throws IOException {
		System.out.println("Yükleniyor...");
		System.out.println();
		SupplierFiler supplierFiler = new SupplierFiler(PATH);
		supplierList = supplierFiler.load();
		System.out.println("Yüklendi");
	}

	private static void doFind() {
		System.out.println("Sağlayıcı ID giriniz: ");
		long supplierId = scanner.nextLong();
        boolean flag=false;
		for (Supplier supplier : supplierList) {
			if (supplier.getSupplierId() == supplierId) {
				System.out.println(
						supplier.getSupplierId() + " " + supplier.getSupplierName() + " " + supplier.getTotalCredit());
				flag=true;
			}
		}
		if(!flag) {
			System.out.println("Sağlayıcı bulunamadı.");
		}

	}
	private static void doAdd() {
		System.out.println("Sağlayıcı ID giriniz: ");
		long supplierId = scanner.nextLong();
		scanner.nextLine();
		boolean flag=false;
		for (Supplier supplier : supplierList) {
			if (supplier.getSupplierId() == supplierId) {
				flag=true;
			}
		}
		if (!flag) {
			System.out.println("Sağlayıcı ismi giriniz: ");
			String supplierName = scanner.nextLine();

			System.out.println("Supplier Total Credit giriniz: ");
			double totalCredit = scanner.nextDouble();
			System.out.println(totalCredit);

			System.out.println("Ekleniyor...");
			supplierList.add(new Supplier(supplierId, supplierName, totalCredit));
			System.out.println("Eklenidi");
		} else {
			System.out.println("Girdiyiniz sağlayıcı id'si zaten listede var");
		}

	}
	private static void doDelete() {
		System.out.println("Supplier ID giriniz: ");
		long supplierId = scanner.nextLong();
		boolean flag=false;
		Supplier supp = null ;
		for (Supplier supplier : supplierList) {
			if (supplier.getSupplierId() == supplierId) {
				 supp = supplier ;
				flag=true;
			}
		}
		if (flag) {
			supplierList.remove(supp);
			System.out.println("Silinidi");
		} else {
			System.out.println("Böyle bir sağlayıcı yok");
		}

	}
	private static void doUpdate() {
		System.out.println("Sağlayıcı ID giriniz: ");
		long supplierId = scanner.nextLong();
		scanner.nextLine();
		boolean flag=false;
		Supplier supp = null ;
		for (Supplier supplier : supplierList) {
			if (supplier.getSupplierId() == supplierId) {
				supp=supplier;
				flag=true;
			}
		}
		if(!flag) {
			
			System.out.println("Sağlayıcı bulunamadı");
		}
					
		else {

			System.out.println("Sağlayıcı İsmi  giriniz: ");
			String supplierName = scanner.nextLine();
			supp.setSupplierName(supplierName);

			System.out.println("Sağlayıcı toplam kredi giriniz: ");
			double totalCredit = scanner.nextDouble();
			supp.setTotalCredit(totalCredit);

			
			System.out.println("Güncellendi");
		} 

	}
	private static void doExit() {
		System.exit(0);
	}


	
	public static void main(String[] args) throws IOException {
		while (true) {
			printMenu();
			int choice = scanChoice();
			switch (choice) {
			case 0:
				doExit();
				break;
			case 1:			
					doLoad();				
			
				break;
			case 2:
					doStore();
				
				break;
			case 3:
				doList();
				break;
			case 4:
				doFind();
				break;
			case 5:
				doAdd();
				break;
			case 6:
				doUpdate();
				break;
			case 7:
				doDelete();
				break;
			default:
				System.out.println("Geçersiz seçim: " + choice);
			}

		}
	}

}
