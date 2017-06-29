package com.paran.chapter5;

public class ControlStatementDemo {
	public static void main(String[] args){
		Student[] stuArr = new Student[3];//배열생성, 인스턴스생성이아님 뒤에것도 생성자함수가 아님
		/*
		stuArr[0] = new Student();
		stuArr[1] = new Student();
		stuArr[2] = new Student();	
		stuArr[0].stuName="a"; //private라서 접근이 불가능
		*/
		stuArr[0] = new Student("홍길동", "123456", true);
		stuArr[1] = new Student("임꺽정", "170789", false);
		stuArr[2] = new Student("변사또", "100936", true);	
		
		int j = 0;
		while(j<stuArr.length){
			stuArr[j].showInfo();
			j++;
		}
		
		for(int i = 0; i < stuArr.length; i++){
			if(stuArr[i].getIsMilSer() ){
				stuArr[i].showInfo();
			}
		}
		
		for(Student stu : stuArr){//for each문
			if(stu.getIsMilSer() ){
				stu.showInfo();
				//stu = new Student("a","a",true); for each문에서는 오류는 없으나 실제반영이 안되는 문장
			}
		}
	}
}
//클래스는 무조건 대문자로 시작 String도 클래스(프리미티브 데이터 타입이 아님)