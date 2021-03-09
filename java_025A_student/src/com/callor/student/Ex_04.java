package com.callor.student;

import com.callor.student.model.StudentVO;

public class Ex_04 {
	public static void main(String[] args) {
		
		StudentVO[] stdArray = new StudentVO[10];

		int index = 2;
		
		//초기화시키는
		stdArray[index] = new StudentVO(); //1번 방법
		for(int i=0; i<stdArray.length; i++) { //2번 방법
			stdArray[i] = new StudentVO();
		}
		
		stdArray[index].setStName("홍길동");
		stdArray[index].setStNum("0001");
		
		System.out.println("이름 : "+stdArray[index].getStName());
		System.out.println("학번 : "+stdArray[index].getStNum());
		
		//오류가 나는이유:위에서 초기화를 안시켰기때문
	}
}
