package com.paran.thread;

public class SecondThreadDemo extends Thread {
	String name;
	public SecondThreadDemo(String name){
		super();
		this.name = name;
	}
	public void run(){
		for(int i = 0; i<10 ; i++){
			try {
				Thread.sleep(100);//0.1초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name+"'s i = > " +i);//콘솔출력은 실제 시간과 다를 수 있다
		}
	}
	public static void main(String[] args){
		Thread t = new Thread("t1"){//Anonymous Class
			public void run(){
				System.out.println(this.getName());
			}
		};
		t.start();
		Thread t2 = new SecondThreadDemo("t2"){//Anonymous Class
			public void run(){
				System.out.println(this.getName());
			}
		};
		t2.start();//run할 준비가 된다 runable
	}
}
