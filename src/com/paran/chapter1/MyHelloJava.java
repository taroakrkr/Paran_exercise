package com.paran.chapter1;
//자바 클래스(ㅁㅁㅁㅁ.java)의 이름과 public클래스 이름은 동일해야한다.
//클래스 = 변수(필드,요소) + 함수(행위,메소드)
public class MyHelloJava {
	String helloStr = "Hello! World."; //<-인스턴스 멤버 변수, 아래 셋은 멤버 함수 // static클래스 멤버함수/변수 그외 인스턴스 멤버함수/변수
	static int Max_NUMBER = 10; // 클래스 멤버 변수
	
	public MyHelloJava(){
		//따로 안만들어도 존재하는 생성자 함수
	}
	public void printMsg(String msg){//인스턴스 함수
		System.out.println(msg);
	}
	public static void printMsg2(String msg){//클래스 함수
		System.out.println(msg);
	}
	public static void main(String[] args){//static가 붙으면 클래스 변수/함수, 인스턴스화 없이 사용가능, 이 클래스를 통한 인스턴스에서는 공유된다
		MyHelloJava obj = new MyHelloJava();//obj라는 변수에 인스턴스 생성문장
		obj.printMsg("Hello");
		//static 함수 내에서는 static멤버함수/변수만 사용가능
		//obj.printMsg2(helloStr);//변수가 인스턴스라 안됨
		//obj.printMsg(Max_NUMBER);//함수가 인스턴스라 안됨
	}
}
//static 멤버변수는 모든 인스턴스가 공유한다
//static 멤버함수는 클래스의 멤버함수이긴 한데 단일기능 펑션(인스턴스와 상관없는 단일기능 함수를 만들기 위해)

// .java 파일을 컴파일하면 -> .class 파일이 된다 (바이트코드)
// 컨트롤 + 쉬프트 + C = 주석설정