package com.paran.thread;

public class ThirdThreadDemo implements Runnable {//이렇게 하면 다른 클래스를 상속받을 수 있다
	String name;
//	private Thread t;

	public ThirdThreadDemo(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);// 0.1초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name+" i = > " + i);
		}
	}

//	public void start() {
//		System.out.println("Starting " + name);
//		if (t == null) {
//			t = new Thread(this, name);
//			t.start();
//		}
//
//	}

	public static void main(String[] args) {
		//ThirdThreadDemo t = new ThirdThreadDemo("Thread-1")
		Thread t = new Thread(new ThirdThreadDemo("Thread-1"));
		Thread t2 = new Thread(new ThirdThreadDemo("Thread-2"));
		t.start();
		t2.start();
	}
}
