package com.paran.chapter11;

public class Animal {
	public static void testClassMethod(){
		System.out.println("the static method in Animal");
	}
	public void testInstanceMethod(){
		System.out.println("the Instance method in Animal");
	}
}

class Cat extends Animal{
	public static void testClassMethod(){
		System.out.println("The static method in Cat");
	}
	public void testInstanceMethod(){
		System.out.println("The Instance method in Cat");
	}
	
	public static void main(String[] args){
		Cat myCat = new Cat();
		Animal myAnimal = myCat;//묵시적 형변환(upcasting)
		myAnimal.testInstanceMethod();//알맹이 따라감
		//아래문장2개는 하면안됨
		myCat.testClassMethod();//껍데기따라감
		myAnimal.testClassMethod();//껍데기따라감
		Animal.testClassMethod();
	}
}

//인스턴스 매서드만 오버라이딩 ?
//Is A 관계는 형변환이 가능