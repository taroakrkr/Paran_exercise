package com.paran.chapter13;

import com.paran.chapter5.Student;

public class ArrayDemo{
	
	public static void main(String[] args){
		int[] intArray = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("인트배열");
		for(int obj : intArray){
			System.out.println(obj);
		}
		
		System.out.println("리버스함수 호출 후");
		reverseArrayValue(intArray);
		
		for(int obj : intArray){
			System.out.println(obj);
		}
	}

	static void reverseArrayValue(int[] array){
		int[] temp= new int[array.length];

		for(int i = 0; i < array.length; i++){
			temp[array.length-(i+1)]=array[i];
		}
		for(int i = 0; i < array.length; i++){
			array[i]=temp[i];
		}

	}
}