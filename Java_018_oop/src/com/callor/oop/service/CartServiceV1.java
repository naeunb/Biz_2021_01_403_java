package com.callor.oop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartServiceV1 {

	List<CartVO> cartList = new ArrayList<CartVO>();
	
	Scanner scan = new Scanner(System.in);
	
	public void inputCart() {
		//상품정보입력받고 cartList에 추가
		
		System.out.print("구매자 >> ");
		String strUserName = scan.nextLine();
		System.out.print("상품명 >> ");
		String strPName = scan.nextLine();
		
		int intQty = 0;
		while(true) {
			System.out.print("수량 >> ");
			String strQty = scan.nextLine();
			try {
				intQty = Integer.valueOf(strQty);
				if(intQty < 2) {
					System.out.println("다시입력하세요(2이상)");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("수량은 숫자만 입력가능");
			}
			
		}
		
		int intPrice = 0;
		while(true) {
			System.out.print("단가 >> ");
			String strPrice = scan.nextLine();
			try {
				intPrice = Integer.valueOf(strPrice);
				if(intPrice < 1000) {
					System.out.println("다시입력하세요(1000이상");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("수량은 숫자만 입력가능");
			}
		}
		
		CartVO cartVO = new CartVO();
		cartVO.setCartUserName(strUserName);
		cartVO.setCartPname(strPName);
		cartVO.setCartQty(intQty);
		cartVO.setCartPrice(intPrice);
		
		cartList.add(cartVO);
	}
	
	public void printCartList() {
		System.out.println("================================");
		System.out.println("구매자\t상품명\t수량단\t단가");
		System.out.println("--------------------------------");
		System.out.printf("%s\t%s\t%d\t%d\n",
				cartList.get(0).getCartUserName(),
				cartList.get(0).getCartPname(),
				cartList.get(0).getCartQty(),
				cartList.get(0).getCartPrice());
	}
}
