package com.callor.score.service;

import com.callor.score.model.ScoreVO;

public class ScoreServiceV2 {

	public int scoreSum(ScoreVO scoreVO) {
		
		int sum = scoreVO.intKor;
		sum += scoreVO.intEng;
		sum += scoreVO.intMath;
		sum += scoreVO.intMusic;
		sum += scoreVO.intHistory;
		return sum;
	}
}
