package com.paran.chapter7;
import com.paran.chapter5.Student;//챕터5의 스튜던트를 가져옴

public class ClassInstanceDemo {
	public static void main(String[] args){
		Student obj = null;
		if(obj != null){
			System.out.println(obj.getIsMilSer());			
		}
	}
}
