package com.callor.shop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartService;
import com.callor.shop.values.Values;
import com.sun.jdi.Value;

public class CartServiceImplV1 implements CartService {

	private List<CartVO> cartList;
	private final Scanner scan;
	
	public CartServiceImplV1() {
		scan = new Scanner(System.in);
		cartList = new ArrayList<CartVO>();
	}
	
	@Override
	public void inputCart() {
		// TODO 카트 추가 method
		System.out.println(Values.dLine);
		System.out.println("장바구니 추가");
		System.out.println(Values.sLine);
		
		System.out.println("구매자 이름을 입력하세요");
		System.out.print(">> ");
		String strUserName = scan.nextLine();
		
		System.out.println("추가할 상품이름을 입력하세요");
		System.out.print(">> ");
		String strProductName = scan.nextLine();
		
		System.out.println("추가할 상품의 구매수량을 입력하세요");
		Integer intQty = 0;
		while(true) {
			System.out.print(">> ");
			String strQty = scan.nextLine();
			try {
				intQty = Integer.valueOf(strQty);	
			} catch (Exception e) {
				System.out.println("수량은 숫자만 입력하세요");
			}
			if(intQty < 1) {
				System.out.println("수량은 1이상 입력하세요");
			} else {
				break;
			}
		}
		
		System.out.println("추가할 상품의 가격을 입력하세요");
		Integer intPrice = 0;
		while(true) {
			System.out.print(">> ");
			String strPrice = scan.nextLine();
			try {
				intQty = Integer.valueOf(strPrice);	
			} catch (Exception e) {
				System.out.println("수량은 숫자만 입력하세요");
			}
			if(intPrice < 100) {
				System.out.println("수량은 100이상 입력하세요");
			} else {
				break;
			}
		}
		Integer intTotal = intQty * intPrice;
		
		CartVO cartVO = new CartVO();
		cartVO.setUserName(strUserName);
		cartVO.setProductName(strProductName);
		cartVO.setQty(intQty);
		cartVO.setPrice(intPrice);
		cartVO.setTotal(intTotal);
		
		System.out.println(Values.dLine);
		System.out.println("입력한 상품");
		System.out.println(Values.sLine);
		System.out.printf("구매자 : %s\n",cartVO.getUserName());
		System.out.printf("상품명 : %s\n",cartVO.getProductName());
		System.out.printf("수량 : %s\n",cartVO.getQty());
		System.out.printf("가격 : %s\n",cartVO.getPrice());
		System.out.printf("합계 : %s\n",cartVO.getTotal());
		System.out.println(Values.dLine);
		System.out.println("추가할까요(YES)?");
		String strYesNo = scan.nextLine();
		if(strYesNo.equalsIgnoreCase("YES")) {
			cartList.add(cartVO);
			System.out.println("저장완료");
		} else {
			System.out.println("저장취소");
		}
		
		
		
	}

	@Override
	public void printAllCart() {
		// TODO 장바구니 전체보기
		
	}

	@Override
	public void printUserCart() {
		// TODO 구매자별 장바구니 보기
		
	}

	
}
