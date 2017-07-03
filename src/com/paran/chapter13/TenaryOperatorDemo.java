package com.paran.chapter13;

public class TenaryOperatorDemo {
	public static void main(String[] args){
		String result = 1>3 ? "크다" : "작다"; // 3항 연산자
		String result1 = 1>3 ? "크다" : 1>2? "중복1" : "중복2"; // 3항 연산자 중복
		System.out.println(result);
		System.out.println(result1);
	}
}
