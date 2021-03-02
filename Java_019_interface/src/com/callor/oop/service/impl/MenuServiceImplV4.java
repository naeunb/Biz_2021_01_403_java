package com.callor.oop.service.impl;

import java.util.Scanner;

import com.callor.oop.service.MenuService;

public class MenuServiceImplV4 implements MenuService {
	
	private Scanner scan;
	public MenuServiceImplV4() {
		scan = new Scanner(System.in);
	}
	
	//메뉴를 선택하면 선택한 항목번호가 저장될 변수
	public Integer menuItem = null;
	
	@Override
	public void selectMenu() {
		
		while(true) {
			System.out.println("=========================");
			System.out.println("카트메뉴시스템 V3");
			System.out.println("--------------------------");
			System.out.println("1. 카트추가");
			System.out.println("2. 카트삭제");
			System.out.println("3. 카트리스트");
			System.out.println("Q. 끝내기");
			System.out.println("--------------------------");
			System.out.print("선택 >> ");
			String strMenu = scan.nextLine();
			if(strMenu.equals("quit")) {
				this.menuItem = null;
				break;
			}
			
			try {
				int intMenu = Integer.valueOf(strMenu);
				if(intMenu >= 1 && intMenu <=3) {
					this.menuItem = intMenu;
					break;
				}
			} catch (Exception e) {
				System.out.println("메뉴는 quit,1,2,3까지만 입력가능");
			}
		}
	}
}
