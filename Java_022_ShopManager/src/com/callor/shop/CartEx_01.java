package com.callor.shop;

import com.callor.shop.service.CartService;
import com.callor.shop.service.MenuService;
import com.callor.shop.service.impl.CartServiceImplV1;
import com.callor.shop.service.impl.MenuServiceImplV1;
import com.callor.shop.values.Values;

public class CartEx_01 {

	public static void main(String[] args) {
		
		//클래스로 선언, 클래스로 생성
		MenuServiceImplV1 ms = new MenuServiceImplV1();
		CartService cService = new CartServiceImplV1();
		
		//인터페이스로 선언, 클래스로 생성
		//인터페이스를 implements하여 작성된 클래스는 인터페이스로 선언을 하자.
		//그래야 코드 업그레이드가 조금 쉬워짐.
		MenuService mService = new MenuServiceImplV1();
		
		while(true) {
			Integer menuItem = mService.selectMenu();
			if(menuItem == null) { //null : 아무것도 아닌값
				break;
			} else if(menuItem == Values.MENU_INPUT ) {
				cService.inputCart();
			} else if(menuItem == Values.MENU_ALL_LIST) {
				cService.printAllCart();
			} else if(menuItem == Values.MENU_USER_LIST) {
				cService.printUserCart();
			}
		}
		System.out.println("업무종료! 퇴근~~");
		
	}
}
