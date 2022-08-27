package com.fatih.thread;

public class MyThread extends Thread{
	
	@Override
	public void run() {
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
