package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.MenuServiceImplV1;
import com.callor.score.service.impl.ScoreServiceImplV1;
import com.callor.score.service.values.Values;

public class ScoreSystem {
	public static void main(String[] args) {
		
		//MenuServiceImplV1 msV1 = new MenuServiceImplV1();
		//msV1.selectMenu();
		
		MenuService msV1 = new MenuServiceImplV1();
		ScoreService ssV1 = new ScoreServiceImplV1();
		
		while(true) {
			Integer menuNum = msV1.selectMenu();
			if(menuNum == null) {
				break;
			} else if(menuNum == Values.MENU_MAKE_SCORE) {
				ssV1.makeScore();
			} else if(menuNum == Values.MENU_SAVE_SCORE) {
				ssV1.saveScoreToFile();
			} else if(menuNum == Values.MENU_LOAD_SCORE) {
				ssV1.loadScoreFromFile();
			}
		}
		System.out.println("종료");
	}
}
