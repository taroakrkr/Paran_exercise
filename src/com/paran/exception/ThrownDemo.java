package com.paran.exception;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class ThrownDemo{
	public final static int SIZE = 100;
	public static void method() throws IOException, Exception{ // ,로 다중기술 가능, 예외처리를 호출한쪽에 던진다
		PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
		for (int i = 0; i < SIZE; i++) {
			// do something
		}
		out.close();
	}
	
	public static void main(String[] args){
		try{
			method();//Checked Exception이라 반드시 Exception handling을 해줘야 한다 아니면 또 throw 하던가
		}catch(Exception e){
			//do something
		}
	}
}