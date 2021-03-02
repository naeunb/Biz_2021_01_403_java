package com.callor.oop.service.impl;

import java.util.Scanner;

import com.callor.oop.service.MenuService;

public class MenuServiceImplV2 implements MenuService {

	private Scanner scan;	 //인스턴스 객체변수 선언
	public MenuServiceImplV2() {
		scan = new Scanner(System.in); 	 //생성자에서 객체변수 초기화하여 사용할 준비
	}
	public void selectMenu() {
		System.out.println("==========================");
		System.out.println("Java Menu System V1");
		System.out.println("--------------------------");
		System.out.println("1. 카트추가");
		System.out.println("2. 카트삭제");
		System.out.println("3. 카트리스트");
		System.out.println("Q. 끝내기");
		System.out.println("--------------------------");
		
		int intInput = 0;
		while(true) {
			System.out.print("선택 >> ");
			String strInput = scan.nextLine();
			
			intInput = Integer.valueOf(strInput);
			
			if(strInput.equals("Q")) {
				System.out.println("종료");
				return;
			}
			try {
				int intMenu = Integer.valueOf(strInput);
				if(intMenu == 1) {
					System.out.println("카트추가");
				} else if(intMenu == 2) {
					System.out.println("카트삭제");
				} else if(intMenu == 3) {
					System.out.println("카트리스트");
				} else {
					System.out.println("메뉴는 1~3까지만 입력");
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println("메뉴는 q,1,2,3중에서 선택");
			}
		}
	}
}







