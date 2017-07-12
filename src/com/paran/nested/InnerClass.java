package com.paran.nested;

class OuterDemo {
	// private variable of the outer class
	private int num;
	private InnerDemo innerObj;
	// inner class

	public class InnerDemo {
		int inNum=0;
		public int getNum() {
			System.out.println("This is the getnum method of the inner class");
			return num;
		}
		public void incrementNum(){
			num++;
			inNum++;
		}
		public void showIn(){
			System.out.println(inNum);
		}
	}

	public OuterDemo(int num) {
		this.num = num;
		innerObj = new InnerDemo();
	}

	public InnerDemo getInnerObj() {
		return innerObj;
	}
}

public class InnerClass {
	public static void main(String args[]) {
		// Instantiating the outer class
		OuterDemo outer = new OuterDemo(100);
		
		// Instantiating the inner class
		OuterDemo.InnerDemo inner1 = outer.new InnerDemo();
		OuterDemo.InnerDemo inner2 = outer.new InnerDemo();
		inner1.incrementNum();
		inner1.incrementNum();
		inner2.incrementNum();
		System.out.println(inner1.getNum());
		System.out.println(inner2.getNum());
		inner1.showIn();
		inner2.showIn();
		
		OuterDemo outer1 = new OuterDemo(200);
		System.out.println(outer1.getInnerObj().getNum());
		

	}
}
