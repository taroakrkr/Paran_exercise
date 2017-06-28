package com.paran.chapter7;
public class Student{
	boolean isMilSer;//전역여부
	String stuName;
	protected String stuId;

	public Student(String stuName, String stuId, boolean isMilSer){
		this.stuName = stuName;
		this.stuId = stuId;
		this.isMilSer = isMilSer;
	}
	public void showInfo(){
		System.out.println("이름 : "+stuName+"/ 학번 : "+stuId);
	}
	public boolean getIsMilSer(){
		return isMilSer;
	}
	public void setIsMilSer(boolean isMilSer){
		this.isMilSer = isMilSer;
	}
}