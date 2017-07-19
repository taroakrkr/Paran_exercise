package com.paran.thread;

public class Signal {
	public static void main(String[] args){
		String buffer = new String();
		Queue<String> queue = new Queue<String>(buffer);
		Thread rThread = new Thread(new ReadThread<String>(queue));
		Thread wThread = new Thread(new WriteThread<String>(queue));
		rThread.start();
		wThread.start();
	}
}
class ReadThread<T> implements Runnable{
	Queue<T> buffer;
	public ReadThread(Queue<T> buffet){
		this.buffer=buffet;
	}
	@Override
	public void run() {
		while(true){
			Long time = System.currentTimeMillis();
			try{
				T ele = (T) buffer.get();
				System.out.println(ele);				
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("R"+e.getMessage());
				break;
			}
		}
	}
}
class WriteThread<T> implements Runnable{
	Queue<T> buffer;
	public WriteThread(Queue<T> buffet){
		this.buffer=buffet;
	}
	@Override
	public void run() {
		while(true){
			Long time = System.currentTimeMillis();
			try{
				buffer.put((T)time.toString());
				System.out.println("write completely"+time);				
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("W"+e.getMessage());
				break;
			}
		}
	}
}

class Queue<T>{
	T item;
	boolean available = false;
	public Queue(T item){
		this.item = item;
	}
	public synchronized void put(T value){
		while(available == true){
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		item = value;
		available = true;
		notify();
	}
	public synchronized T get(){
		while(available == false){
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		available = false;
		notify();
		return item;
	}
}