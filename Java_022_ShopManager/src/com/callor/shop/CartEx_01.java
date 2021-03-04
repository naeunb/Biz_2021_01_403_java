package com.callor.shop;

import com.callor.shop.service.MenuService;
import com.callor.shop.service.impl.MenuServiceImplV1;

public class CartEx_01 {

	public static void main(String[] args) {
		
		//클래스로 선언, 클래스로 생성
		MenuServiceImplV1 ms = new MenuServiceImplV1();
		
		//인터페이스로 선언, 클래스로 생성
		//인터페이스를 implements하여 작성된 클래스는 인터페이스로 선언을 하자.
		//그래야 코드 업그레이드가 조금 쉬워짐.
		MenuService mService = new MenuServiceImplV1();
		
		while(true) {
			Integer menuItem = mService.selectMenu();
			if(menuItem == null) { //null : 아무것도 아닌값
				break;
			} else if(menuItem == 1) {
				System.out.println("장바구니 추가");
			} else if(menuItem == 2) {
				System.out.println("장바구니 리스트보기");
			} else if(menuItem == 3) {
				System.out.println("구매자별 리스트보기");
			}
		}
		System.out.println("업무종료! 퇴근~~");
		
	}
}
