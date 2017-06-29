package com.paran.chapter11;

public class StringDemo {
	public static void main(String[] args){
		String str1 = "A";
		String str2 = "B";
		String str3 = "A";
		String str4 = new String("A");
		
		if( str1 == str2 ){
			System.out.println("1,2비교");
		}
		if( str1 == str3 ){
			System.out.println("1,3비교");
		}
		if( str1 == str4 ){
			System.out.println("1,4비교");
		}

	}
}
