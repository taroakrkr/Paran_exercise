package com.paran.nested;
public class NestedClassDemo {
	private int age;
	class InnerClass{
		public void showAge(){
			System.out.println("age = > "+age);
			//중첩(inner class) 클래스는 자신을 포함하는 클래스의 private 멤버에 대한 접근 권한이 있다.
		}
	}
}
