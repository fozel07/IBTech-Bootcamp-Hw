package com.fatih.thread;

public class MyLambaTest {
	public static void main(String[] args) {
		
	//	Runnable runnable=()-> walk();
	//	Thread thread=new Thread(runnable);
	//	thread.start();
				
	
	//	Thread thread=new Thread(() -> walk());
	//	thread.start();
		
		
		new Thread(() -> walk()).start();
	    process();
			
			
	}

	private static void process() {
		while(true) {
		
		System.out.println("sürüyor...");
		try {
			Thread.sleep(750);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  }
	}

	private static void walk() {
		while(true) {
			
			System.out.println("Koşuyor...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
