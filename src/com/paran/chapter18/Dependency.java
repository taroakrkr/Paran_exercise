package com.paran.chapter18;

public class Dependency {//Dependency가 Students에 의존성이 있다, 함수의 파라미터나 리턴타입에 쓰일때
	public void showInfo(Students instStu){//Students를 참조
		System.out.println(instStu.getInfo());
	}
}

class Students{
	String name;
	String stuId;
	public Students(String name, String stuId){
		this.name = name;
		this.stuId = stuId;
	}
	public String getInfo(){
		return name + " " + stuId;
	}
}

//association 멤버변수로 참조
class Association{
	private Students stuInfo;//멤버로 참조하고 있을때
}