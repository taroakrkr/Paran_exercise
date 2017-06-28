package com.paran.chapter9;

import com.paran.chapter7.Student;

public class AccessModifierDemo {
	public static void main(String[] args){
		Student stuObj = new Student("1","2",true);
	}
}

/*
 접근지정자 accessmodifier
private 클래스내부
no modifier 같은 패키지내
protected 다른패키지에서 상속하면 사용가능
public 모두 사용가능
*/

