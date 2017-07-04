package com.paran.chapter18;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassInfo {
	
	List<Student> stuList = new ArrayList<Student>();
	public void initStudent(){
		stuList.add(new DomeStudent());
		stuList.add(new DomeStudent());
		stuList.add(new DomeStudent());
		stuList.add(new DomeStudent());
		stuList.add(new ForeStudent());
		stuList.add(new ForeStudent());
		stuList.add(new ForeStudent());
		stuList.add(new ForeStudent());
	}
	
	public static void main(String[] args){
		// 파일 변수 file을 만든다
		File file = new File("C:\\student.txt");
    	try {
    		// BufferedReader 변수에 file을 넣는다
    		BufferedReader reader = new BufferedReader(new FileReader(file));

        	// 파일을 한줄씩 읽어 넣기 위한 변수 line
        	String line = null;

        	// 하나의 line을 split 하여 넣을 배열 splitedStr
        	String[] splitedStr = null;

        	// 한 줄씩 읽어서 line에 넣은 후 null이 아니면 실행
        	while( (line = reader.readLine()) != null ) {

            	// 초기화
            	splitedStr = null;

            	// 탭을 기준으로 잘라서 splitedStr 에 넣는다
            	splitedStr = line.split("\t");

            	// 배열에 들어간 길이 만큼 반복한다
            	for (int i = 0; i < splitedStr.length; i++) {

                    // 양쪽의 공백을 제거하고 다시 입력한다
            		splitedStr[i] = splitedStr[i].trim();
            		System.out.println(splitedStr[i]);
                    // splitedStr 을 List<Class명>에 입력하는 등 이용가능하다
            	}
        	}
        	reader.close();

    	} catch (FileNotFoundException fnf) {
    		fnf.printStackTrace();
    	} catch( IOException e) {
        	e.printStackTrace();
    	}
	}
	
	
}



abstract class Student{
	private String name;
	private String stuId;
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
	public abstract void showInfo();
	//abstract = 인스턴스 생성 불가
}

class DomeStudent extends Student{//국내학생
	private String resiId;//주민번호
	public void showInfo(){
		System.out.println("name => "+ getName() + " stuId => "+getStuId()+" resiId => "+resiId);
	}
}

class ForeStudent extends Student{//국외학생
	private String foreignId;//주민번호
	public void showInfo(){
		System.out.println("name => "+ getName() + " stuId => "+getStuId()+" goreignId => "+foreignId);
	}
}
