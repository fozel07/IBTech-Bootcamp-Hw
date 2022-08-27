package com.fatih.thread;

public class MyInnerTest {

	public static void main(String[] args) {
		Runnable runnable=new MyRunnable() {
			@Override
			public void run() {
				walk();
				
			}
		};
		Thread thread=new Thread(runnable);
		thread.start();
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
