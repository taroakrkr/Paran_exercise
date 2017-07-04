package com.paran.chapter18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ClassInfo {
	public static void initStudent(List<Student> stuList){
		// 파일 변수 file을 만든다
		File file = new File("C:\\student.txt");
    	try {
    		// BufferedReader 변수에 file을 넣는다
    		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"euc-kr"));


        	// 파일을 한줄씩 읽어 넣기 위한 변수 line
        	String line = null;

        	// 하나의 line을 split 하여 넣을 배열 splitedStr
        	String[] splitedStr = null;
        	int score=0;

        	// 한 줄씩 읽어서 line에 넣은 후 null이 아니면 실행
        	while( (line = reader.readLine()) != null ) {

            	// 초기화
            	splitedStr = null;

            	// 탭을 기준으로 잘라서 splitedStr 에 넣는다
            	splitedStr = line.split("\t");

            	// 배열에 들어간 길이 만큼 반복한다
            	for (int i = 0; i < splitedStr.length; i++) {
            		if(i==3){
            			score = Integer.valueOf(splitedStr[3]);//점수는 int로
            		}else{
            			// 양쪽의 공백을 제거하고 다시 입력한다
            			splitedStr[i] = splitedStr[i].trim();
            		}
                    // splitedStr 을 List<Class명>에 입력하는 등 이용가능하다
            	}
            	if(splitedStr[2].substring(0,1).equals("1")){
            		stuList.add(new DomeStudent(splitedStr[0],splitedStr[1],splitedStr[2],score));
            	}else
            		stuList.add(new ForeStudent(splitedStr[0],splitedStr[1],splitedStr[2],score));
        	}
        	reader.close();

    	} catch (FileNotFoundException fnf) {
    		fnf.printStackTrace();
    	} catch( IOException e) {
        	e.printStackTrace();
    	}
	}
	public static void setRanking(List<Student> stuList){
		for(int i=0; i<stuList.size(); i++){
            stuList.get(i).setRank(1); //모두1등으로 초기화
           
            for (int j = 0; j < stuList.size(); j++) { //기준데이터와 나머지데이터비교                             
                if(stuList.get(i).getScore()<stuList.get(j).getScore()){   //기준데이터가 나머지데이터라 비교했을때 적으면 카운트
                    stuList.get(i).setRank(stuList.get(i).getRank()+1); //COUNT                 
                }              
            }          
        } 
	}
	public static void showList(List<Student> stuList){
		for(int i=0; i<stuList.size(); i++){
			stuList.get(i).showInfo();
		}
	}
	
	public static void main(String[] args){
		List<Student> stuList = new ArrayList<Student>();
		initStudent(stuList);
		setRanking(stuList);
		showList(stuList);
	}
	
	
}



abstract class Student{
	private String name;
	private String stuId;
	private int score;
	private int rank=0;
	public Student(String name, String stuId, int score){
		this.setName(name);
		this.setStuId(stuId);
		this.setScore(score);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public abstract void showInfo();
	//abstract = 인스턴스 생성 불가
}

class DomeStudent extends Student{//국내학생
	private String resiId;//주민번호
	public DomeStudent(String name, String stuId, String resiId, int score){
		super(name, stuId, score);
		this.resiId=resiId;
	}
	public void showInfo(){
		System.out.println("내국인 name => "+ getName() + " stuId => "+getStuId()+" resiId => "+resiId+" score = "+super.getScore()+" ranking = "+ super.getRank());
	}
}

class ForeStudent extends Student{//국외학생
	private String foreignId;//주민번호
	public ForeStudent(String name, String stuId, String foreignId, int score){
		super(name, stuId, score);
		this.foreignId=foreignId;
	}
	public void showInfo(){
		System.out.println("외국인 name => "+ getName() + " stuId => "+getStuId()+" resiId => "+foreignId+" score = "+super.getScore()+" ranking = "+ super.getRank());
	}
}
