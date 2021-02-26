package com.callor.opp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartList_03 {
	public static void main(String[] args) {
		
		List<CartVO> cartList = new ArrayList<CartVO>();
		Scanner scan = new Scanner(System.in);
		CartVO cartVO = new CartVO();
		

		System.out.println("============================");
		System.out.println("카트에 추가할 데이터 입력");
		System.out.println("----------------------------");
		for(int i=0; i<3; i++) {
			cartVO = new CartVO();
			
			
			System.out.print("구매자이름 >> ");
			String pName = scan.nextLine();
			cartVO.setCartUserName(pName);
			//cartVO.setCartUserName(scan.nextLine());
			
			System.out.print("상품명 >> ");
			cartVO.setCartPname(scan.nextLine());
			
			System.out.print("수량 >> ");
			String strCartQty = scan.nextLine(); 
			cartVO.setCartQty(Integer.valueOf(strCartQty)); 
			
			System.out.print("가격 >> ");
			String strCartPrice = scan.nextLine(); 
			cartVO.setCartPrice(Integer.valueOf(strCartPrice)); 
			
			
			cartList.add(cartVO);
			System.out.println("**************************");
		}

		System.out.println("============================");
		System.out.println("장바구니");
		System.out.println("----------------------------");
		
		for(int i=0; i<3; i++) {
			cartVO = cartList.get(i);
			System.out.printf("%s\t%s\t%d\t%d\n",
					cartVO.getCartUserName(),
					cartVO.getCartPname(),
					cartVO.getCartQty(),
					cartVO.getCartPrice());	
		}
	}
	
}
