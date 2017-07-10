package com.paran.nested;
//중첩 테스트

class Student{
	String name;
	int score;
	public Student(String name, int score){
		this.name = name;
		this.score = score;
	}
}

interface IInterface{//인터페이스는 상수와 추상 메서드만 가진다 
	public abstract boolean test(Student stu);
}

public class NestedDemo {
	public static void main(String[] args){
		Student[] stuArr = new Student[3];
		stuArr[0] = new Student("홍길동", 100);
		stuArr[1] = new Student("임꺽정", 40);
		stuArr[2] = new Student("변사또", 55);
		
		checkGreaterThanFifty(stuArr, new IInterface(){ //함수형 프로그래밍
			public boolean test(Student stu){
				if(stu.score >= 50) return true;
				return false;
			}
		});
		
	}
	
	public static void checkGreaterThanFifty(Student[] stuArr, IInterface tester){
		for (Student ele : stuArr){
			if(tester.test(ele)){
				System.out.println(ele.name);
			}
		}
	}
}
