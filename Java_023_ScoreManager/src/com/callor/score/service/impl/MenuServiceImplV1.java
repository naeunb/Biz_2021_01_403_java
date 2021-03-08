package com.callor.score.service.impl;

import java.util.Scanner;

import com.callor.score.service.MenuService;
import com.callor.score.service.values.Values;

public class MenuServiceImplV1 implements MenuService {

	private final Scanner scan;
	public MenuServiceImplV1() {
		scan = new Scanner(System.in);
	}
	
	@Override
	public Integer selectMenu() {
		
		while(true) {
			System.out.println(Values.dLine);
			System.out.println("빛나라 고교 성적처리 시스템");
			System.out.println(Values.sLine);
			System.out.println(Values.MENU_MAKE_SCORE+". 학생성적 점수 생성");
			System.out.println(Values.MENU_SAVE_SCORE+". 학생성적 점수 파일에 저장");
			System.out.println(Values.MENU_LOAD_SCORE+". 성적결과 확인");
			System.out.println("QUIT. 끝내기");
			System.out.println(Values.dLine);
			System.out.print("선택 >> ");
			String strMenu = scan.nextLine();
			
			if(strMenu.equalsIgnoreCase("QUIT")) {
				return null;
			}
			
			Integer intMenu = null;
			
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.println("\n메뉴선택은 1~3,QUIT만 입력할 수 있습니다.\n");
				continue;
			}
			
			if(intMenu >= Values.MENU_MAKE_SCORE && intMenu <= Values.MENU_LOAD_SCORE) {
				return intMenu;
			} else {
				System.out.println("\n1~3이외의 메뉴는 없습니다\n");
			}
			
		}
	}

}
