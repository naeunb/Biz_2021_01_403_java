package com.callor.oop;

import com.callor.oop.service.impl.MenuServiceImplV1;
import com.callor.oop.service.impl.MenuServiceImplV2;

public class CartEx_05 {
	public static void main(String[] args) {
		/*
		MenuServiceImplV1 msvImplV1 = new MenuServiceImplV1();
		msvImplV1.selectMenu();
		*/

		MenuServiceImplV2 msvImplV2 = new MenuServiceImplV2();
		msvImplV2.selectMenu();
	}
}
