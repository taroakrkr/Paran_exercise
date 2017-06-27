package com.paran.chapter5;
public class Student{ // public을 붙여서 챕터7에서 사용가능
	//접근지정자 private은 내 클래스 안에서만 public는 모두 다 접근가능
	private boolean isMilSer;//전역여부
	private String stuName;
	private String stuId;
	/*
	public Student(){
	//기본생성자	, private에 접근할 방법이없어서 기본생성자 함수는 쓸모가없다.
	}
	*/
	public Student(String stuName, String stuId, boolean isMilSer){
		this.stuName = stuName;
		this.stuId = stuId;
		this.isMilSer = isMilSer;
	}
	public void showInfo(){
		System.out.println("이름 : "+stuName+"/ 학번 : "+stuId);
	}
	public boolean getIsMilSer(){//게더함수
		return isMilSer;
	}
	public void setIsMilSer(boolean isMilSer){//셋터함수
		this.isMilSer = isMilSer;
	}
}