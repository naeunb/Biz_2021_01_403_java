package com.callor.applications;

import java.util.Scanner;

public class Score_02 {
	public static void main(String[] args) {
		
		String[] strName = new String[3];
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<intKor.length; i++) {
			int num = i+1;
			System.out.println(num+"번 학생");
			System.out.print("이름 입력 >>");
			strName[i] = scan.nextLine();
			
			System.out.print("국어 점수 입력 >>");
			//문자열형으로 입력받고
			String strSubj = scan.nextLine();
			//문자열형숫자를 정수로 변경하여 저장
			intKor[i] = Integer.valueOf(strSubj);
			
			System.out.print("영어 점수 입력 >>");
			strSubj = scan.nextLine();
			intEng[i] = Integer.valueOf(strSubj);
			
			System.out.print("수학 점수 입력 >>");
			strSubj = scan.nextLine();
			intMath[i] = Integer.valueOf(strSubj);
			System.out.println("-------------------");
		}
		
		System.out.println("=============================");
		System.out.printf("%s\t%s\t%s\t%s\t\n","이름","국어","영어","수학");
		System.out.println("=============================");
		for(int i=0; i<3; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t\n",strName[i],intKor[i],intEng[i],intMath[i]);
		}
		
		System.out.println("=============================");
		
	}
}
