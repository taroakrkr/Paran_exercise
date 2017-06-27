package com.paran.chapter5;

public class BreakContinueDemo {
	public static void main(String[] args){
		int count = 10;
		for(int i = 0 ; i<count ; i++){
			/*
			System.out.println(i);
			if( i == 5 ) break;
			*/
			if( (i%2 != 0) || i==0 ){
				continue;
			}
			else{
				System.out.println(i);
			}
		}
		count = 4;
		for(int i = 1 ; i<count ; i++){
			for(int j = 1 ; j<count ; j++){
				if( i == 2 )break;
				System.out.println("iner i : "+i+"/ j : "+j);
			}
			System.out.println("outer i : "+i);
		}
	}
}
