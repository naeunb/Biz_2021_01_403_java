package com.callor.applications;

import java.util.Scanner;

public class Score_01 {
	public static void main(String[] args) {
		
		//1.scanner클래스 사용 키보드에서 국어,영어,수학점수를 입력받아 변수에저장 각점수는 0~100까지만입력
		//2.3과목의 합계와 평균을 계산하여 각각변수에 저장
		/*3.다음과같이화면에출력 평균은 실수로표현
		 * ================
		 * 국어  영어   수학  총점  평균
		 * -------------------------
		 * 82    83      77     24   80.6666666
		 */
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			/*
			 * prompt
			 * : scanner의 nextInt()를 사용하여 키보드 입력을 받는 코드가 실행되면 화면에 아무것도 없이 멈춘것처럼 
			 * 보이기 때문에 미리 어떤일을 할것인지 알려주는 메세지
			 */
			System.out.print("국어점수 입력 >> ");
			//scan.nextInt()메서드를 호출하면 코드 동작이 멈추고 사용자가 키보드로 무엇인가 입력한 후 enter를
			//누를때까지 이후 코드가 실행되지않음  => code blocking
			int numKor = scan.nextInt();
			System.out.print("영어점수 입력 >> ");
			int numEng = scan.nextInt();
			System.out.print("수학점수 입력 >> ");
			int numMath = scan.nextInt();
			
			boolean bYesKor = numKor >= 0 && numKor <= 100;
			boolean bYesEng = numEng >= 0 && numEng <= 100;
			boolean bYesMath = numMath >= 0 && numMath <= 100;
			
			if(bYesKor && bYesEng && bYesMath) {
				System.out.println("====================================");
				System.out.println("국어\t영어\t수학\t총점\t평균");
				System.out.println("------------------------------------");
				System.out.print(numKor+"\t");
				System.out.print(numEng+"\t");
				System.out.print(numMath+"\t");
				//int sum = numKor+numEng+numMath;
				int sum = numKor;
				sum += numEng;
				sum += numMath;
				System.out.print(sum+"\t");
				/*
				 * 결과값을 실수형(float,double)으로 하고자 할때는 sum변수값이나 숫자 3을 실수형으로 만들어줘야함
				 */
				float fAvg = sum/3f;  // sum/3.0d      => sum을 실수 3.0f로 나눈셈을 지시하면 sum변수에 담긴 값은 자동 형변환
				fAvg = (float)sum/3;  // (double)sum/3    => 정수형sum에 담긴 값을 float형 값으로 강제 형변환하여 나눗셈준비
				fAvg = sum/(float)3;  // 잘안씀
				System.out.println(fAvg);
				System.out.println("====================================");
				break;
			} else {
				System.out.println("다시입력하세요");
			}
		}
	}
}
