package com.paran.chapter13;

public class ArrayDemo{
	
	public static void main(String[] args){
		int[] intArray = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("인트배열");
		showArray(intArray); // 원래 이렇게 써줘야 된다 ArrayDemo.showArray(intArray);
		
		System.out.println("리버스함수 호출 후");
		reverseArrayValue(intArray);
		showArray(intArray);
		
		System.out.println("버블소트");
		int[] sortArr = {6,8,4,2,5,1,3};
		System.out.println("정렬전");
		showArray(sortArr);
		System.out.println("오름차순");
		bubbleSort(sortArr, true);
		showArray(sortArr);
		System.out.println("내림차순");
		bubbleSort(sortArr, false);
		showArray(sortArr);
		
	}

	static void showArray(int[] array){
		for(int obj : array){
			System.out.println(obj);
		}
	}
	
	static void reverseArrayValue(int[] array){/*
		int[] temp = new int[array.length];

		for(int i = 0; i < array.length; i++){
			temp[array.length-(i+1)]=array[i];
		}
		for(int i = 0; i < array.length; i++){
			array[i]=temp[i];
		}*/
		int temp = 0, front = 0, rear = array.length-1;
		for(;front<array.length/2;front++,rear--){
			temp=array[front];
			array[front]=array[rear];
			array[rear]=temp;
		}

	}
	/**
	 * 버블소트 메소드
	 * @param array int 배열
	 * @param asc 오름차순 true 내림차순 false
	 */
	static void bubbleSort(int[] array, boolean asc){
		int temp = 0;
		if(asc){
			for(int i = 0; i < array.length - 1; i++){
				for(int j = 0; j<array.length-1-i; j++){
					if(array[j]>array[j+1]){
						temp=array[j];
						array[j]=array[j+1];
						array[j+1]=temp;
					}
				}
			}
		}else{
			for(int i = 0; i < array.length - 1; i++){
				for(int j = 0; j<array.length-1-i; j++){
					if(array[j]<array[j+1]){
						temp=array[j];
						array[j]=array[j+1];
						array[j+1]=temp;
					}
				}
			}
		}
	}
}