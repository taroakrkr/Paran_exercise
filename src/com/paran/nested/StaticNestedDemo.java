package com.paran.nested;

public class StaticNestedDemo {

	public String name;

	public StaticNestedDemo(String name) {
		this.name = name;
	}

	static class NestedDemo {
		public int age;
		public NestedDemo(int age) {
			this.age = age;
		}
		public void myMethod() {
			System.out.println("This is my nested class " + age);
		}
	}

	public void showInfo() {
		System.out.println(name);
	}

	public static void main(String args[]) {
		//StaticNestedDemo인스턴스를 생성 안해줘도 접근할 수 있다.
		StaticNestedDemo.NestedDemo obj1 = new StaticNestedDemo.NestedDemo(10);
		StaticNestedDemo.NestedDemo obj2 = new StaticNestedDemo.NestedDemo(20);
		obj1.myMethod();
		obj2.myMethod();
	}
}