package com.callor.applications.service;

import java.util.Scanner;

/*
 * 클래스의 extends(확장,상속)
 * 
 * ScoreServiceV4 : Parent(부모) 클래스
 * ScoreServiceExtendsV1 : child(자식) 클래스
 * 
 * 단순한 extends
 * 부모 클래스에 정의된 모든 method를 코드한줄 추가, 수정 없이 그대로 사용할 수 있다.
 * 
 * 
 * 추가 extends
 * 부모 클래스에 정의된 method와 새롭게 추가된 method가 있는 확장된 클래스의 생성
 */
public class ScoreServiceExtendsV1 extends ScoreServiceV4 {

	
	//문자열형 변수 1개를 매개변수로 갖는 input() method
	public int input(String subject) { //input() method를 호출할 때 괄호안에 값(숫자)을 입력하면 intScore변수에 값이 저장되고
	//53번라인을 console창에 출력. 문자열형 변수인 String을 사용한 이유는 53번라인에 문자열과 숫자를 더하면 문자열이 되기때문일까?
		
		//scanner 사용준비
		Scanner scan = new Scanner(System.in);
		
		// 정수형 변수 intScore 선언 후 0으로 초기화
		int intScore = 0;
		
		//반복문
		while(true) {
			
			//console 에 아래문장 출력 => prompt
			System.out.print(subject+" 점수 입력 >> ");
			
			//console창에 입력한 값을 변수intScore에 저장
			intScore = scan.nextInt();

			//조건문
			if(intScore < 0) { //console창에 입력한 값이 intScore에 저장되고 그 저장된 값이 0보다 작으면 아래 문장 실행
				System.out.println(subject+" 점수는 0점 이상 입력!");
			} else if(intScore > 100) { // 저장된 값이 100보다 크면 아래 문장 실행
				System.out.println(subject+" 점수는 100점 이하 입력!");
			} else { // 저장된 값이 0보다 작지않고 100보다 크지 않으면 반복을 중단함.
				break;
			}
		}
		// 41번라인에서 입력된 값을 출력함.
		//System.out.println("입력한 점수 : "+intScore);
		return intScore;
		
		//호출한 코드에서
		//return 30; => int intKor에 30을 담아라
		//return 100; => int intKor에 100을 담아라
		
	}
}
