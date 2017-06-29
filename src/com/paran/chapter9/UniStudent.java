package com.paran.chapter9;
import com.paran.chapter7.Student;

public class UniStudent extends Student{//상속하는 클래스의 기본생성자가 없기때문에 부모의 생성자함수를 호출못해서 오류
	public UniStudent(String name, String stuId, boolean isMilSer){
		super(name, stuId, isMilSer);//superclass의 생성자 함수 호출(부모)
	}
	@Override
	public void showInfo(){//오버라이딩
		super.showInfo();
		System.out.println(/*"이름 : "+stuName+*/"/ 학번 : "+stuId);//다른클래스이기 때문에 protected붙은 변수만 사용가능
	}
}
