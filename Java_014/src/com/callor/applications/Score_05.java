package com.callor.applications;

import java.util.Random;

public class Score_05 {
	public static void main(String[] args) {
		
		Random rnd = new Random();

		String[] strName = new String[] {"홍길동","이몽룡","성춘향"};
		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];
		int[] intSum = new int[strName.length];
		float[] floatAvg = new float[strName.length];
		
		
		for(int i=0; i<strName.length; i++) {
			intKor[i] = rnd.nextInt(100);
			intEng[i] = rnd.nextInt(100);
			intMath[i] = rnd.nextInt(100);
		}
		for(int i=0; i<strName.length; i++) {
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];
		}
		for(int i=0; i<strName.length; i++) {
			floatAvg[i] = intSum[i]/3F;
		}
		
		System.out.println("===========================================");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t\n","이름","국어","영어","수학","총점","평균");
		System.out.println("===========================================");

		for(int i=0; i<intKor.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n",strName[i],intKor[i],intEng[i],intMath[i],intSum[i],floatAvg[i]);
		}
		System.out.println("===========================================");
		
		
	}
}
