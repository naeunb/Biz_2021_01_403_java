package com.callor.oop;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.callor.oop.model.ScoreVO;

public class Score_03 {
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
			
			sVO.setIntKor(strKor);
			
			//intKor에 -1이 담겨있으면 다시 입력을 하도록 해야함.
			if(sVO.getIntKor() < 0) {
				System.out.println("국어점수 유효성 검사 실패");
				continue;
			}
			break;
		}
		
		while(true) {
			System.out.print("영어점수 >> ");
			String strEng = scan.nextLine();
			
			sVO.setIntEng(strEng);
			
			if(sVO.getIntEng() < 0) {
				System.out.println("영어점수 유효성 검사 실패");
				continue;
			}
			break;
		}
	}
}
