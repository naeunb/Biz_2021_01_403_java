package com.callor.applications;

import com.callor.applications.service.ScoreServiceV4;

public class Score_05 {
	public static void main(String[] args) {
		ScoreServiceV4 scV4 = new ScoreServiceV4();
		
		//scV4.score(242, 80.666F);
		
		
		
		//scV4.print(10, 10, 2);
		int intKor = 1;
		int intEng = 2;
		int intMath = 3;
		scV4.print(intKor, intEng, intMath);
		
	}
}
