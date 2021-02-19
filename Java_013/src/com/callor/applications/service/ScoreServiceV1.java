package com.callor.applications.service;

import java.util.Scanner;

public class ScoreServiceV1 {
	
	//클래스 영역(멤버 영역)에 선언된 인스턴스변수들
	//인스턴스변수 : ScoreServiceV1 클래스를 객체로 선언하고 초기화(= new ssV1())를 하면 자동으로 사용할 준비가 되는 변수들
	private int intKor=0;
	private int intEng=0;
	private int intMath=0;
	private int intSum=0;
	private float floatAvg=0;
	
	private Scanner scan = new Scanner(System.in);
	
	//input() method가 호출되면 키보드를 통해 각 점수를 입력받고 각 변수에 저장
	public void input() {
		System.out.print("국어점수 입력 >> ");
		intKor = scan.nextInt();
		System.out.print("영어점수 입력 >> ");
		intEng = scan.nextInt();
		System.out.print("수학점수 입력 >> ");
		intMath = scan.nextInt();
	}
	
	public void sum() {
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
	}
	
	public void avg() {
		floatAvg = intSum/3F;
	}
	
	//인스턴스 변수에 저장된 값을 출력
	public void print() {
		sum();
		avg();
		System.out.printf("국어 : %d점\n",intKor);
		System.out.printf("영어 : %d점\n",intEng);
		System.out.printf("수학 : %d점\n",intMath);
		System.out.printf("총점 : %d점\n",intSum);
		/*
		 * %3.2f : 실수값을 출력하는데 정수부분 3자리, 소수점이하 2자리 출력, 소수점이하 3번째에서 반올림
		 */
		System.out.printf("평균 : %3.2f점\n",floatAvg);
		//System.out.println("평균 : "+floatAvg);
	}
}
