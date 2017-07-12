package com.paran.nested;

abstract class AnonymousInner {
	public abstract void myMethod();
}

public class AnonymousDemo {
	public static void main(String args[]) {
		AnonymousInner inner = new AnonymousInner() {
			public void myMethod() {	
				System.out.println("This is an example of anonymous inner class");		
			}	
		};
		inner.myMethod();
	}
}
