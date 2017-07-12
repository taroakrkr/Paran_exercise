package com.paran.interface_demo;

interface Animal{
	public void eat(); // public 앞에 abstract가 생략되어있다.
	public void travel(); // public도 생략가능
}
interface Walkable{
	abstract public void walk();
}

class Mammal implements Animal, Walkable{//다중상속가능
	@Override
	public void eat(){
		System.out.println("Mammal eat method");
	}
	@Override
	public void travel(){
		System.out.println("Mammal travel method");		
	}
	@Override
	public void walk(){
		System.out.println("Mammal walk method");
	}
}

class Amphibian implements Animal, Walkable{
	@Override
	public void eat(){
		System.out.println("Amphibian eat method");
	}
	@Override
	public void travel(){
		System.out.println("Amphibian travel method");		
	}
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Amphibian walk method");
	}
}

public class InterFaceDemo {
	public static void main(String[] args){
		Animal obj1 = new Mammal();//클래스 상속 처럼 상위 껍데기로 담을 수 있다
		Animal obj2 = new Amphibian();
		obj1.eat();
		obj2.eat();
		//obj1.walk(); //Animal에는 walk가 없다
		
		Walkable obj3 = (Walkable)obj1;
		obj3.walk();
		

		
	}
}
