package com.callor.applications;

import java.util.Scanner;

/*
 * 학생 3명의 국어,영어,수학 점수를 키보드로 입력받아서 console에 리스트를 출력하기
 * 
 * 1. 학생 3명의 3과목의 점수를 저장할 배열
 * 2. 배열이 나오면 일단 for 반복문이 한번쯤은 나타난다.
 * 3. 학생 3명의 3과목의 점수를 어떻게 입력받을것인가
 * 4. 학생 3명의 과목점수를 어떻게 출력할 것인가
 */
public class Score_011 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		String[] strSubject = new String[] {"국어", "영어", "수학"};
		
		
		//학생별로 과목점수입력
		for(int i=0; i<intKor.length; i++) {
			int num = i+1;
			System.out.println(num+"번 학생 성적 입력");
			System.out.print(strSubject[0]+" >> ");
			intKor[i] = scan.nextInt();
			System.out.print(strSubject[1]+" >> ");
			intEng[i] = scan.nextInt();
			System.out.print(strSubject[2]+" >> ");
			intMath[i] = scan.nextInt();
			System.out.println("-------------------------");
		}
		
		System.out.println("=========================");
		System.out.printf("%s\t%s\t%s\t\n",strSubject[0],strSubject[1],strSubject[2]);
		System.out.println("=========================");

		for(int i=0; i<3; i++) {
			System.out.printf("%d\t%d\t%d\t\n",intKor[i],intEng[i],intMath[i]);
		}
		System.out.println("=========================");
	}
}
