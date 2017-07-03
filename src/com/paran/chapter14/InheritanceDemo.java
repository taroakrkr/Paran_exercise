package com.paran.chapter14;

//B is a A 관계
//C is a B 관계
//C is a A 관계

public class InheritanceDemo {
	public static void main(String[] args){
		C instC = new C(100);
		A instA;
		B instB;
		/*
		instB.methodA();
		instB.salary=1;
		instB.age=1;
		*/
		
		instA = instB = instC;
		
		/*
		instA = instB;//is a 관계라 자동으로 형변환(업캐스팅)이 된다
		instA.methodA();//껍데기만 A고 인스턴스는 B
		instA.methodB();//A에는 메서드B에 대한 정보가 없다
		*/
		
		Object obj = instB; //OBject는 어디에서는 최상위 클래스
	
		System.out.println(instA.age);
		System.out.println(instB.age);
		System.out.println(instC.age);
		System.out.println(((B)instA).age);
		//멤버 변수는 다형성과 아무련 상관이 없다 멤버 함수만
	}
}


class A{
	public int age;
	
	public A(int age){
		this.age = age;
	}
	
	public void methodA(){
		System.out.println("methodA in A class");
	}

}

class B extends A{
	public int age;
	public int salary;
	
	public B(int age){
		super(age);//상위 클래스의 생성자 함수를 먼저 호출해줘야 한다
		this.age = age;
	}
	
	@Override
	public void methodA(){
		System.out.println("methodA in B class");
	}
	public void methodB(){
		System.out.println("methodB in B class");
	}
	public void methodC(){
		System.out.println(super.age);
	}
}

class C extends B{
	public int age;
	
	public C(int age){
		super(age);
		this.age = age;
	}
}
