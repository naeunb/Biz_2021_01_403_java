package com.callor.shop;

import com.callor.shop.service.CartService;
import com.callor.shop.service.MenuService;
import com.callor.shop.service.impl.CartServiceV1;
import com.callor.shop.service.impl.MenuServiceV1;

public class Cart {
	public static void main(String[] args) {

		CartService cService = new CartServiceV1();
		MenuService mService = new MenuServiceV1();
		
		while(true) {
			Integer menu = mService.selectMenu();
			
			if (menu == null) {
				break;
			} else if (menu == 1) {
				cService.inputCart();
			} else if(menu == 2) {
				cService.allCartList();
			} else if(menu == 3) {
				cService.userCartList();
			}
		}
		
	}
}
