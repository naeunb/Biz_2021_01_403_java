package com.callor.score;

import java.util.Random;

public class Score_01 {
	public static void main(String[] args) {
		
		//이름,주소,과목 배열
		//점수 임의생성 1~100까지 =>총점,평균
		
		Random rnd = new Random();
		
		String name[] = new String[] {"홍길동","이몽룡","성춘향","장녹수","임꺽정"};
		String addr[] = {"서울시","익산시","남원시","한양시","함흥시"};
		String subj[] = {"국어","영어","수학"};
		
		int intKor[] = new int[name.length];
		int intEng[] = new int[name.length];
		int intMath[] = new int[name.length];
		int sum[] = new int[name.length];
		float avg[] = new float[name.length];
		
		System.out.println("============================================");
		System.out.printf("이름\t주소\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("--------------------------------------------");
		
		for(int i=0; i<name.length; i++) {//점수생성
			intKor[i] = rnd.nextInt(100)+1;
			intEng[i] = rnd.nextInt(100)+1;
			intMath[i] = rnd.nextInt(100)+1;
		}
		for(int i=0; i<name.length; i++) {//총점
			sum[i] = intKor[i];
			sum[i] += intEng[i];
			sum[i] += intMath[i];
		}
		for(int i=0; i<name.length; i++) {//평균
			avg[i] = sum[i]/3f;
		}
		for(int i=0; i<name.length; i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%3.2f\t\n",name[i],addr[i],intKor[i],intEng[i],intMath[i],sum[i],avg[i]);
		}
		
	}
}
