package com.callor.applications.service;

import java.util.Scanner;

/*
 * java의 class와 method() 호출
 * ScoreService 클래스에는 main() method가 없어서 여기에 있는 코드는 Run하여 실행할수없음
 * 누군가가 ScoreService를 객체, 인스턴스로 만들고 score() method를 호출해주어야만 코드르르 실행할 수 있다
 * 
 * 다른언어에서는 module등의 이름으로 사용.
 */
public class ScoreService {

		/*
		 * 클래스와 메서드 명명법
		 * 클래스 : 첫글자 영문대문자, 이후 영문대소문자,숫자
		 * 메서드 : 첫글자 영문소문자, 이후 영문대소문자,숫자
		 * 
		 *  클래스 명명법 Upper CamelCase라고 함.
		 *  메서드 명명법 Lower CamelCase라고 함
		 */
		public void score() {
			Scanner scan = new Scanner(System.in);

			while(true) {
				System.out.print("국어점수 입력 >> ");
				int numKor = scan.nextInt();
				boolean bYesKor = numKor >= 0 && numKor <= 100;
				if(bYesKor == false) {
					System.out.println("다시입력하세요");
				} else {
				}
				
				System.out.print("영어점수 입력 >> ");
				int numEng = scan.nextInt();
				System.out.print("수학점수 입력 >> ");
				int numMath = scan.nextInt();
				
				boolean bYesEng = numEng >= 0 && numEng <= 100;
				boolean bYesMath = numMath >= 0 && numMath <= 100;
				
				if(bYesKor && bYesEng && bYesMath) {
					System.out.println("====================================");
					System.out.println("국어\t영어\t수학\t총점\t평균");
					System.out.println("------------------------------------");
					System.out.print(numKor+"\t");
					System.out.print(numEng+"\t");
					System.out.print(numMath+"\t");
					int sum = numKor;
					sum += numEng;
					sum += numMath;
					System.out.print(sum+"\t");
					float fAvg = sum/3f;
					System.out.println(fAvg);
					System.out.println("====================================");
					break;
				} else {
					System.out.println("다시입력하세요");
				}
			}
		}
}
