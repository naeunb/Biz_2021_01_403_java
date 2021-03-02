package com.callor.oop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;
import com.callor.oop.service.CartService;

public class CartServiceImplV3 implements CartService {

	private List<CartVO> cartList;
	private Scanner scan;
	
	public CartServiceImplV3() {
		cartList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);
	}
	
	
	@Override
	public void inputCart() {
		
		while(true) {
			System.out.println("==========================");
			System.out.println("빛나라 카트 시스템 V3");
			System.out.println("--------------------------");
			
			System.out.print("구매자(quit : 끝내기) >> ");
			String strUserName = scan.nextLine();
			//while()반복문을 사용해 코드를 작성할때는 사용자가 반복문을 종료할 수 있는 탈출구를 만들어줘야함.
			if(strUserName == "quit") {
				return;
			}
			
			System.out.print("상품명(quit : 끝내기) >> ");
			String strProName = scan.nextLine();
			if(strProName == "quit") {
				return;
			}

			int intQty = 0;
			while(true) {
				System.out.print("수량 >> ");
				String strQty = scan.nextLine();
				try {
					intQty = Integer.valueOf(strQty);
					if(intQty < 1) {
						System.out.println("수량은 1개이상 입력");
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("수량은 숫자로만 입력가능");
				}	
			}

			int intPrice = 0;
			while(true) {
				System.out.print("단가 >> ");
				String strPrice = scan.nextLine();
				try {
					intPrice = Integer.valueOf(strPrice);
					if(intPrice < 1000) {
						System.out.println("단가는 1000이상 입력");
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("단가는 숫자로만 입력가능");
				}	
			}
			
			CartVO cartVO = new CartVO();
			cartVO.setUserName(strUserName);
			cartVO.setProductName(strProName);
			cartVO.setPrice(intPrice);
			cartVO.setQty(intQty);
			cartVO.setTotal(intPrice * intQty);
			cartList.add(cartVO);
			
			
		}
	}

	@Override
	public void printCart() {
		int nSize = cartList.size();
		for(int i=0; i<nSize; i++) {
			System.out.println(cartList.get(i).toString());
		}
	}
	
	
}
