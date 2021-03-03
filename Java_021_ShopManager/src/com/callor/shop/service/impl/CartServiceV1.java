package com.callor.shop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartService;

public class CartServiceV1 implements CartService {

	private List<CartVO> cartList;
	private Scanner scan;
	public CartServiceV1() {
		scan = new Scanner(System.in);
		cartList = new ArrayList<CartVO>();
	}
	
	@Override
	public void inputCart() {
		
		System.out.println("\n********* 상품 담기 *********");
		System.out.print("손님이름 >> ");
		String inputUserName = scan.nextLine();
		
		int intQty = 0;
		int intPrice = 0;
		System.out.print("상품이름 >> ");
		String inputProductName = scan.nextLine();
		
		while(true) {
			System.out.print("수량 >> ");
			String inputQty = scan.nextLine();
			try {
				intQty = Integer.valueOf(inputQty);
				if(intQty < 1) {
					System.out.println("수량은 1이상 입력하세요");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("수량은 숫자만 입력하세요");
			}
		}
		
		while(true) {
			System.out.print("단가 >> ");
			String inputPrice = scan.nextLine();
			try {
				intPrice = Integer.valueOf(inputPrice);
				if(intPrice < 10) {
					System.out.println("단가는 10이상 입력하세요");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("단가는 숫자만 입력하세요");
			}
		}
		
		
		CartVO cartVO = new CartVO();
		cartVO.setUserName(inputUserName);
		cartVO.setProductName(inputProductName);
		cartVO.setQty(intQty);
		cartVO.setPrice(intPrice);
		cartVO.setTotal(intPrice*intQty);
		
		cartList.add(cartVO);
		
		
	}

	
	@Override
	public void allCartList() {
		int totalPrice = 0;
		System.out.println("\n============================================");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		System.out.println("----------------------------------------------");
		int nSize = cartList.size();
		for(int i=0; i<nSize; i++) {
			System.out.print(cartList.get(i).getUserName()+"\t");
			System.out.print(cartList.get(i).getProductName()+"\t");
			System.out.print(cartList.get(i).getPrice()+"\t");
			System.out.print(cartList.get(i).getQty()+"\t");
			System.out.print(cartList.get(i).getTotal()+"\n");
			totalPrice += cartList.get(i).getTotal();
		}
		System.out.println("----------------------------------------------");
		System.out.println("합계\t"+nSize+"가지"+"\t\t\t"+totalPrice+"\n");
	}

	@Override
	/*
	 * 구매자이름을 알기위해 입력받고 저장한 후 리스트에서 비교
	 */
	public void userCartList() {
		int totalPrice = 0;
		System.out.println("\n출력할 구매자 이름을 입력하세요");
		System.out.print("이름 >> ");
		String strUserName = scan.nextLine(); 
		
		System.out.println("\n*"+strUserName+" 장바구니 리스트");
		System.out.println("============================================");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		System.out.println("----------------------------------------------");
		int nSize = cartList.size();
		int totalPrd = 0;
		for(int i=0; i<nSize; i++) {
			if(cartList.get(i).getUserName().equals(strUserName)) {
				System.out.print(cartList.get(i).getUserName()+"\t");
				System.out.print(cartList.get(i).getProductName()+"\t");
				System.out.print(cartList.get(i).getPrice()+"\t");
				System.out.print(cartList.get(i).getQty()+"\t");
				System.out.print(cartList.get(i).getTotal()+"\n");
				totalPrice += cartList.get(i).getTotal();
				totalPrd++;
			}
		}
		System.out.println("----------------------------------------------");
		System.out.println("합계\t"+totalPrd+"가지"+"\t\t\t"+totalPrice+"\n");
	}

}
