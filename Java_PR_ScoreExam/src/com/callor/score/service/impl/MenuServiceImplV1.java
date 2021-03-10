package com.callor.score.service.impl;

import java.util.Scanner;

import com.callor.score.service.MenuService;

public class MenuServiceImplV1 implements MenuService{

	private Scanner scan;
	
	public MenuServiceImplV1() {
		scan = new Scanner(System.in);
	}
	
	@Override
	public Integer selectMenu() {
		// TODO 메뉴선택
		while(true) {
			System.out.println("===========");
			System.out.println("성적시스템");
			System.out.println("-----------");
			System.out.println("INPUT. 성적입력");
			System.out.println("QUIT. 종료");
			System.out.println("-----------");
			String strMenu = scan.nextLine();
			if(strMenu.equalsIgnoreCase("INPUT")) {
				return 1;
			} else if(strMenu.equalsIgnoreCase("QUIT")) {
				return 2;
			} else {
				System.out.println("\n메뉴는 INPUT,QUIT만 입력하세요\n");
			}
		}
	}

}
