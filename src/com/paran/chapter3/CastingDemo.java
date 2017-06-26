package com.paran.chapter3;

public class CastingDemo {
	//인스턴스변수
	int num1;
	long num2;
	float num3;
	//인스턴스함수
	public void printNum(){
		System.out.println(num1+", "+num2+", "+num3);
	}
	//클래스함수
	public static void main(String[] args){
		CastingDemo cFn = new CastingDemo();//레퍼런스타입변수&지역변수(인스턴스변수가 아니라 지역변수라고 봐야한다. 그래서 클래스 함수내에서 사용가능)
		//num1=10;//인스턴스변수를 클래스함수에서 사용하려해서 오류
		cFn.num1 = 1000000000;
		cFn.num2 = 10000000000L;
		cFn.num3 = (float)12.45;//다운캐스팅
		cFn.printNum();
		
		short s1 = 10;
		short s2 = 20;
		short s3 = (short)(s1+s2);
		System.out.println(s3);
	}
}

/*
연산자
	산술 : +, -, *, /, %
	논리 : ||(or논리합), &&(and논리곱), !(not논리부정)
	대입 :
	관계 : >= == <
	bit :
	기타연산자(3항연산자, instanceof)
*/
class StudentScore{
	int engScore;
	int korScore;
	String stuName;
	
	public StudentScore(String stuName, int engScore, int korScore){
		this.stuName = stuName;
		this.engScore = engScore;
		this.korScore = korScore;
	}
	public void showInfo(){
		System.out.println("=================");
		System.out.println("이름 : "+ stuName);
		System.out.println("영어 : "+ engScore);
		System.out.println("국어 : "+ korScore);
		System.out.println("=================");
	}
	public double getAvg(){
		return (engScore+korScore)/2.0;
	}
	public void degree(){
		if(this.getAvg()>=90.0 && this.getAvg()<=100.0){
			System.out.println(this.stuName+this.getAvg()+"점");
		}
	}
}
class OperationDemo{
	public static void main(String[] args){
		StudentScore obj[]= {new StudentScore("홍길동",100,80), new StudentScore("임꺽정",50,40), new StudentScore("변사또",80,80)};

		for(int i = 0 ; i<obj.length;i++){
			obj[i].showInfo();
		}
		System.out.println("A등급(평균90이상)");
		for(int i = 0 ; i<obj.length;i++){
			obj[i].degree();
		}

	}
}