package com.fatih.thread;

public class MyThreadTest {
	public static void main(String[] args) {
		MyThread thread=new MyThread();
		thread.start();
			while(true) {
			
			System.out.println("sürüyor...");
			try {
				Thread.sleep(750);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
