package com.paran.exception;

public class ExceptionDemo {
	static void methodA(){
		try{
			methodB();
		}catch(Exception e){
			//to to something
		}
	}
	static void methodB(){
		System.out.println("before calling methodC");
		methodC();
		System.out.println("after calling methodC");
	}
	static void methodC(){
		System.out.println("before exception occured");
		int i = 0;
		i = i/0;
		System.out.println("After exception occured in methodC");
	}
	public static void main(String[] args){
		methodA();
		System.out.println("main 정상 종료");
	}
}
