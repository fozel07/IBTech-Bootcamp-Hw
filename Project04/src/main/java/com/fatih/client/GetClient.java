package com.fatih.client;
import static com.fatih.utils.StreamUtilities.*;



public class GetClient {
	public static void main(String[] args) throws Exception {
		String address="http://localhost:8080/Project04/me";
		String text=get(address);
		System.out.println("İçerik:");
		System.out.println(text);
		
	}

	
}
