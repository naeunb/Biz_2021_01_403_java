package com.callor.score;

import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV1;

/*
 * ScoreSerivce를 테스트하는 코드
 */
public class ScoreEx_01 {

	public static void main(String[] args) {
		
		/*
		 * 인터페이스를 통하여 ..ServiceImple.. 클래스를 사용하는 코드들 간에 약속이 만들어진다.
		 * 이런환경이 되면 method가 달라서 발생하는 여러 구조적 오류를 최소화 할 수 있다.
		 * 
		 * 만약 ..implV1을 만들던 개발자가 코드를 미완성 하더라도 implV1클래스를 사용하는 곳에서는
		 * 오류가 발생하지 않고 다른 부분코드를 작성할 수 있게된다.
		 */
		ScoreService ssV1 = new ScoreServiceImplV1();
		ssV1.inputScore();
		ssV1.makeScore();
		ssV1.saveScoreToFile();
		ssV1.loadScoreFromFile();
		ssV1.printScore();
	}
}
