package com.callor.oop.controller;

import com.callor.oop.model.CartVO;

public class CartControllerV2 {
	public static void main(String[] args) {
		
		CartVO[] cartVO = new CartVO[3];
		
		for(int i=0; i<cartVO.length; i++) {
			cartVO[i] = new CartVO();
		}

		cartVO[0].setCartUserName("홍길동");
		cartVO[0].setCartDate("2021-02-24");
		cartVO[0].setCartTime("10:44:00");
		cartVO[0].setCartPname("초코파이");
		cartVO[0].setCartQty(3);
		cartVO[0].setCartStd("바나나맛");
		cartVO[0].setCartPrice(2400);
		cartVO[0].setCartTotal(2400*3);

		cartVO[1].setCartUserName("서강준");
		cartVO[1].setCartDate("2021-02-25");
		cartVO[1].setCartTime("10:45:00");
		cartVO[1].setCartPname("포카칩");
		cartVO[1].setCartQty(10);
		cartVO[1].setCartStd("양파맛");
		cartVO[1].setCartPrice(1500);
		cartVO[1].setCartTotal(1500*10);

		cartVO[2].setCartUserName("송중기");
		cartVO[2].setCartDate("2021-02-26");
		cartVO[2].setCartTime("12:40:10");
		cartVO[2].setCartPname("꼬북칩");
		cartVO[2].setCartQty(2);
		cartVO[2].setCartStd("초코");
		cartVO[2].setCartPrice(1200);
		cartVO[2].setCartTotal(1200*2);

		System.out.println(cartVO[0].toString());
		
		/*
		 * cartVO의 개수가 3개인 상태
		 * 상품한가지를 더 카트에 넣고싶다
		 * 
		 */
		cartVO = new CartVO[4];
		
		cartVO[3] = new CartVO();
		cartVO[3].setCartUserName("이승기");
		
		System.out.println("=====================");
		System.out.println("카트 내용");
		System.out.println("---------------------");
		for(int i=0; i<cartVO.length; i++) {
			System.out.println(cartVO[i].toString());
		}
		
		
		/*
		System.out.println("=====================");
		for(int i=0; i<cartVO.length; i++) {
			System.out.printf("구매자   : %s\n날짜     : %s\n시각     : %s\n상품명   : %s\n수량     : %d\n옵션     : %s\n구매단가 : %d\n구매금액 : %d\n",
					cartVO[i].getCartUserName(),
					cartVO[i].getCartDate(),
					cartVO[i].getCartTime(),
					cartVO[i].getCartPname(),
					cartVO[i].getCartQty(),
					cartVO[i].getCartStd(),
					cartVO[i].getCartPrice(),
					cartVO[i].getCartTotal());

			System.out.println("---------------------");
		}
		*/
		
	}
}
