package com.callor.score;

import com.callor.score.model.ScoreVO;

public class Score_05 {
	public static void main(String[] args) {
		
		int num;
		//선언만 된 변수는 읽기 불가능함. 
		num=0; //숫자일경우 최소한 0값이라도 저장해야함.
		System.out.println(num);
		
		//ScoreVO 클래스를 사용하여 scoreVO객체생성
		ScoreVO scoreVO = new ScoreVO();
		//
		System.out.println(scoreVO.intKor);
		
		//VO클래스를 사용하여 객체를 생성하면 VO클래스에 선언된 public 인스턴스 변수들이 자동으로 선언및 생성되어 
		//사용 할 준비가 됨.
		
		scoreVO.strName = "홍길동";
		scoreVO.intKor = 90;
		scoreVO.intEng = 20;
		scoreVO.intMath = 10;
		
		//클래스로 객체를 선언만 한 상태에서는 아무런 것도 사용할 수 없음.
		ScoreVO scoreVO1;
		scoreVO1 = new ScoreVO(); //반드시 생성해줘야한다.
		scoreVO1.intKor = 100;
		
		//ScoreVO클래스를 사용하여 scoreVO2객체 선언, 객체를 인스턴스로 생성(초기화)
		//java에서는 new ScoreVO()코드를 클래스의 "생성자 method호출"이라고 부름.
		//ScoreVO클래스를 scoreVO2객체로 선언하고 생성자를 호출하여 인스턴스로 만듦.
		ScoreVO scoreVO2 = new ScoreVO();
	}
}
