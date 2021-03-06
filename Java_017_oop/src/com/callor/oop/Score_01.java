package com.callor.oop;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.callor.oop.model.ScoreVO;

public class Score_01 {
	public static void main(String[] args) {
	
		ScoreVO sVO = new ScoreVO();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생 성적 입력");
		System.out.print("이름입력 >> ");
		sVO.strName  = scan.nextLine();
		
		System.out.println("점수는 50~100점까지만 입력할 것");
		
		while(true) {
			System.out.print("국어점수 >> ");
			String strKor = scan.nextLine();
			
			try {
				sVO.intKor  = Integer.valueOf(strKor);	
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해주세요");
				continue;
			}
			
			if(sVO.intKor < 50 || sVO.intKor > 100) {
				System.out.println("다시입력하세요(50~100까지)");
			} else {
				break;
			}
			
		}
		while(true) {
			System.out.print("영어점수 >> ");
			String strEng = scan.nextLine();
			
			try {
				sVO.intEng  = Integer.valueOf(strEng);	
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해주세요");
				continue;
			}
			if(sVO.intEng < 50 || sVO.intEng > 100) {
				System.out.println("다시입력하세요(50~100까지)");
			} else {
				break;
			}
			
		}
		while(true) {
			System.out.print("수학점수 >> ");
			String strMath = scan.nextLine();
			
			try {
				sVO.intMath  = Integer.valueOf(strMath);	
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해주세요");
				continue;
			}
			if(sVO.intMath < 50 || sVO.intMath > 100) {
				System.out.println("다시입력하세요(50~100까지)");
			} else {
				break;
			}
		}
	}
}

//ScoreVO클래스를 객체로 만들고 키보드에서 학생이름,국어,영어,수학성적 입력받은후 객체의 인스턴스 변수에 저장
//국영수는 50~100점까지만 입력가능  => 50보다 작거나 100보다 크면 안됨
//점수입력 유효성 검사(50~100이 맞는지)와 exception처리를 수행