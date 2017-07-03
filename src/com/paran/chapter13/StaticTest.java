package com.paran.chapter13;

class StaticTest{
	//클래스 멤버변수
	static String name="홍길동";
	
	//인스턴스 멤버변수
	String address="대한민국 순천시 조례동";
	
	//인스턴스 멤버 함수
	public void showAddress(){
		System.out.println(address); // 가능
	}
	
	//클래스 멤버 함수
	public static void showName(){
		System.out.println(name); // 가능
		System.out.println(address); // 불가능
		System.out.println(this.name); // 불가능
		showAddress(); // 불가능
		
		StaticTest obj = new StaticTest();
		System.out.println(obj.address);
	}
}

class B{
	
}
//지역변수는 항상 초기화 해줘야함, 멤버 변수는 자동
class A{
	public B instB;
	public void testLocalVariable(){
		B localObj = new B();
		instB = localObj;//이 문장 때문에 지역변수 참조가 쓰레기 값으로 삭제되지않고 남음
	}
}