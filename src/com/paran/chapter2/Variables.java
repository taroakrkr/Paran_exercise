package com.paran.chapter2;

public class Variables {
	int varType;
	final static int MAX_NO=5;//상수 대문자쓰는게 보편적
	static int MAX_NO1=10;//클래스변수
	
	public static void main(String[] args){
		System.out.println(MAX_NO);
		System.out.println(MAX_NO1);
		//MAX_NO=5;
		MAX_NO1=5;
	}
	public final void showInfo(){
		System.out.println(varType);
	}
}


/* 
final한정자  : 중요하여 수정불가능하게 할때 사용
	-변수 : 재할당 불가
	-함수 : overriding불가
	-클래스 : 이 클래스를 상속 불가, 있는 그대로만 사용할것
*/

/*final*/ class Animal{
	public /*final을 넣으면 밑에서 오버라이딩 불가*/ void breath(){
		System.out.println("동물 숨쉬기");
	}
}

class Person extends Animal{//애니멀 상속
	public void breath(){//오버라이딩(상속의 오버로딩)
		System.out.println("사람 숨쉬기");
	}
	public static void main(String[] arg){
		Person obj = new Person();//지역변수이며 레퍼런스타입
		obj.breath();
	}
}