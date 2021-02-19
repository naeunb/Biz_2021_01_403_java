package com.callor.applications;

import com.callor.applications.service.ScoreServiceV1;

public class Score_01 {
	public static void main(String[] args) {
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		
		ssV1.input();
		ssV1.print();
	}
}
