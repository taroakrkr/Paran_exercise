package com.paran.interface_demo;

public class DoItDemo {
	public static void main(String[] args){
		DoSomething obj1 = new DoSomething();
		obj1.doSomething(1, 1.1);
		obj1.doSomethingElse("obj1");
	}
}

interface DoIt {

	void doSomething(int i, double x);

	int doSomethingElse(String s);

	default boolean didItWork(int i, double x, String s) {
		// do something
		System.out.println("DoIt");
		return true;
	}
}

interface DoItPlus extends DoIt {
	default boolean didItWork(int i, double x, String s) {
		DoIt.super.didItWork(i, x, s);
		System.out.println("DoItPlus");
		return true;
	}
}

class DoSomething implements DoItPlus {

	@Override
	public void doSomething(int i, double x) {
		didItWork(1, 1.1, "a");
	}

	@Override
	public int doSomethingElse(String s) {
		return 0;
	}

}