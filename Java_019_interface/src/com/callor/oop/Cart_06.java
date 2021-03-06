package com.callor.oop;

import com.callor.oop.service.CartService;
import com.callor.oop.service.MenuService;
import com.callor.oop.service.impl.CartServiceImplV4;
import com.callor.oop.service.impl.MenuServiceImplV3;

public class Cart_06 {
	public static void main(String[] args) {
		
		MenuService mService =  new MenuServiceImplV3();
		mService.selectMenu();
		
		/*
		 * MenuService에는 선언되지않고 MenuServiceImplV3에만 선언된 menuItem 변수값을 읽어오기 이해
		 * 인터페이스->클래스 형 변환을 시킨다. 
		 */
		MenuServiceImplV3 mV3 = (MenuServiceImplV3)mService;
		Integer menuItem = mV3.menuItem;

		
		//인터페이스를 클래스로 형변환 함과 동시에 변수에 접근
		Integer selectMenu = ((MenuServiceImplV3)mService).menuItem;
		
		CartService cService = new CartServiceImplV4();
		if(selectMenu == 1) {
			//카트추가
			cService.inputCart();
		} else if(selectMenu == 2) {
			//카트삭제
		} else if(selectMenu == 3) {
			//카트리스트
			cService.printCart();
		}
	}
}

