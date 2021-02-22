package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Score_04 {
	public static void main(String[] args) {
		
		String[] strName = new String[] {"홍길동","이몽룡","성춘향"};
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		
		Random rnd = new Random();
		
		Scanner scan = new Scanner(System.in);
		
		
		for(int i=0; i<strName.length; i++) {
			intKor[i] = rnd.nextInt(100);
			intEng[i] = rnd.nextInt(100);
			intMath[i] = rnd.nextInt(100);
		}
		
		System.out.println("===============================");
		System.out.printf("%s\t%s\t%s\t%s\t\n","이름","국어","영어","수학");
		System.out.println("===============================");
		
		for(int i=0; i<intKor.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t\n",strName[i],intKor[i],intEng[i],intMath[i]);
		}
	}
}
