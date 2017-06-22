package com.paran.chapter2;

public class InstanceDemo {
	public static void main(String[] args){
		String msg = "hello printer!";
		Printer ssPrinter = new Printer("삼성", true);// new 생성자(함수)**1 <--인스턴스를 만드는 형식/ 밑의 생성자함수에서 파라미터를 2개를 써놨으니 똑같이 두개를 받아야된다
		Printer hpPrinter = new Printer("HP", false);
		Printer epsonPrinter = new Printer("Epson", false);
		
		ssPrinter.print(msg);
		hpPrinter.print(msg);
		epsonPrinter.print(msg);
		epsonPrinter.print(msg,12321);
		
		epsonPrinter.printA(msg, false); //스태틱(클래스)함수를 인스턴스처럼 써서(인스턴스로 스태틱함수를 호출해서) 주의표시뜸
		Printer.printA(msg, false);
		System.out.println(epsonPrinter.add(9,9));
		System.out.println(epsonPrinter.add(9.2f,9.2f));
		System.out.println(epsonPrinter.add(9.4,9.5));
	}
}

class Printer{ // 일종의 틀, 이 틀로 여러 인스턴스를 찍어낸다. 여러 인스턴스들이 스태틱을 참조 할 수있다.
	String manufacture;//인스턴스 멤버 변수 
	boolean isColorPrinter;
	static int A = 0; //클래스변수, 클래스 내 모든 인스턴스가 공유하는 변수
	final static int MAX_NO = 5;//상수, 재할당 불가
	
	public Printer(String manufacture, boolean isColorPrinter/*파라미터(지역변수라고 생각해야됨)*/){    //생성자함수(리턴 타입이 없다)**1
		this.manufacture = manufacture;//쉐도잉 - 멤버변수가 지역변수에 의해 가려진다 
		this.isColorPrinter = isColorPrinter;
	}

	public void print(String msg){ //인스턴스 멤버 함수
		if(isColorPrinter){
			System.out.println(manufacture +" is color print " + msg);
		}
		else{
			System.out.println(manufacture+ " is mono print " + msg);
		}
		A=A+1;
	}
	
	//오버라이딩 : 상속과 관련됨
	//오버로딩 : 파라미터가 다른 동일한 이름의 함수
	public void print(String msg, int p){ //인스턴스 멤버 함수
		if(isColorPrinter){
			System.out.println(manufacture +" is color print " + msg+p);
		}
		else{
			System.out.println(manufacture+ " is mono print " + msg+p);
		}
		A=A+1;
	}
	public int add(int op1, int op2){
		return op1+op2;
	}
	public float add(float op1, float op2){
		return op1+op2;
	}
	/**
	 * 자바독설명
	 * @param op1 더블1
	 * @param op2 더블2
	 * @return 합
	 */
	public double add(double op1, double op2){
		return op1+op2;
	}

	
	public static String abc = "static";//클래스 변수
	public static void printA(String msg, boolean isColor){//클래스 함수, 클래스 변수/함수만 사용가능
		System.out.println(abc+A);
	}
}


/*
지역변수 - 함수내부(클래스 블록을 제외함) 블록내부의 변수
인스턴스변수
클래스변수 - static 한정자를 사용

데이터 타입 - 기본형(primitive data type), 참조형(reference data type) 
	기본형 - int, long, byte, double 등등
	참조형 - class(interface 포함), 배열 

명명규칙 - camel표기법으로 한다 소문자로시작(예 youLoveMe) 상수변수만 대문자로 시작 그리고 _사용(예 final static int MAX_NO = 5)
*/