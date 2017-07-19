package com.paran.thread;

public class ThreadInterrupt implements Runnable{

	@Override
	public void run() {
		for(int i = 0 ; i<5 ; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("인터럽트 발생");
				e.printStackTrace();
				break;
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args){
		System.out.println("main started");
		Thread t = new Thread(new ThreadInterrupt());
		t.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.interrupt();
		System.out.println("main ends");
		
	}
}
