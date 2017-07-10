package com.paran.exception;

public class ExceptionDemo {
	static void mm(){
		methodA();
	}
	static void methodA(){
		try{
			methodB();
		}catch(Exception e){
			//to to something
			//e.printStackTrace();
		}
		System.out.println("aa");
	}
	static void methodB(){
		System.out.println("before calling methodC");
		methodC();// exception handler가 없음, A로 전파
		System.out.println("after calling methodC");
	}
	static void methodC(){
		System.out.println("before exception occured");
		int i = 0;
		i = i/0; // 예외 발생 B로 전파
		System.out.println("After exception occured in methodC");
	}
	public static void main(String[] args){
		mm();
		System.out.println("main 정상 종료");
	}
}
