package com.callor.oop.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;
//수량은 1이상정수 가격은 1000원이상 입력가능하도록 유효성검사코드추가
public class CartControllerV4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<CartVO> cartList = new ArrayList<CartVO>();

		for(int i=0; i<3; i++) {
			//제목보이기
			System.out.println("=======================");
			System.out.println("쇼핑카트 상품추가");
			System.out.println("=======================");
			
			//입력받기
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
					if(intQty < 1) {
						System.out.println("다시입력 (1이상)");
						continue;
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("수량은 숫자로 입력하세요");
				}
			}
			
			int intPrice = 0;
			while(true) {
				System.out.print("단가 >> ");
				String strPrice = scan.nextLine();
				try {
					intPrice = Integer.valueOf(strPrice);
					if(intPrice < 1000) {
						System.out.println("다시입력 (1000이상)");
						continue;
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("단가는 숫자로 입력하세요");
				}
			}
			
			//카트정보생성
			CartVO cartVO = new CartVO();
			cartVO.setCartUserName(strUserName);
			cartVO.setCartPname(strPName);
			cartVO.setCartQty(intQty);
			cartVO.setCartPrice(intPrice);
			
			//카트정보를 리스트에 추가
			cartList.add(cartVO);
			
		}// END for
		
		System.out.println("===========================");
		System.out.println("구매자\t상품명\t단가\t수량");
		System.out.println("===========================");

		int nSize = cartList.size();
		for(int i=0; i<nSize; i++) {
			System.out.printf("%s\t%s\t%d\t%d\n",
					cartList.get(i).getCartUserName(),
					cartList.get(i).getCartPname(),
					cartList.get(i).getCartQty(),
					cartList.get(i).getCartPrice());
		}
		
		
		
	}
}
