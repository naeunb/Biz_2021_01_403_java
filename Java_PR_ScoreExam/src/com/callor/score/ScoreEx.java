package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.MenuServiceImplV1;
import com.callor.score.service.impl.ScoreServiceImplV1;

public class ScoreEx {
	public static void main(String[] args) {
		
		ScoreService ssV1 = new ScoreServiceImplV1();
		MenuService msV1 = new MenuServiceImplV1();
		
		while(true) {
			Integer menu = msV1.selectMenu();
			
			if(menu == null) {
				break;
			} else if(menu == 1) {
				ssV1.inputScore();
			} else if(menu == 2) {
				ssV1.saveScoreToFile();
				ssV1.loadScoreFromFile();
				ssV1.printScore();
				break;
			}
		}
	}
}
