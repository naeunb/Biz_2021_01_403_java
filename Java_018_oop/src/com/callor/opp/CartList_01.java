package com.callor.opp;

import java.util.ArrayList;
import java.util.List;

import com.callor.oop.model.CartVO;

public class CartList_01 {
	public static void main(String[] args) {
		
		// CartVO를 여러개 list로 담을 객체 생성.
		List<CartVO> cartList = new ArrayList<CartVO>();
		
		// cart를 1개 생성하고 데이터 저장.
		CartVO cartVO = new CartVO();
		cartVO.setCartUserName("홍길동");
		cartVO.setCartPname("초코파이");
		cartVO.setCartPrice(1000);
		cartVO.setCartQty(10);
		
		// cartList에 추가.
		cartList.add(cartVO);
		
		// 또 하나의 상품을 준비.
		cartVO = new CartVO();
		cartVO.setCartUserName("홍길동");
		cartVO.setCartPname("칠성사이다");
		cartVO.setCartPrice(2500);
		cartVO.setCartQty(1);
		
		//준비된 상품 카트리스트 추가.
		cartList.add(cartVO);
		
		// == 카트에 상품 2개를 저장 ==
		// 카트리스트 출력/
		System.out.println("============================");
		System.out.println("장바구니");
		System.out.println("----------------------------");

		
		for(int i=0; i<2; i++) {
			cartVO = cartList.get(i);
			System.out.printf("%s\t%s\t%d\t%d\n",
					cartVO.getCartUserName(),
					cartVO.getCartPname(),
					cartVO.getCartPrice(),
					cartVO.getCartQty());	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
