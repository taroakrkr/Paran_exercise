package com.paran.chapter3;

public class CastingDemo {
	int num1;
	long num2;
	float num3;
	
	public void printNum(){
		System.out.println(num1+", "+num2+", "+num3);
	}
	
	public static void main(String[] args){
		CastingDemo cFn = new CastingDemo();
		cFn.num1 = 100000;
		cFn.num2 = 10000000000l;
		cFn.num3 = 12.45f;
		cFn.printNum();
	}
}
