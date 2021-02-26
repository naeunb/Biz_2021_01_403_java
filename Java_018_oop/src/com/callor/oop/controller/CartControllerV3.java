package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartControllerV3 {
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
			
			System.out.print("수량 >> ");
			String strQty = scan.nextLine();
			int intQty = Integer.valueOf(strQty);
			
			System.out.print("단가 >> ");
			String strPrice = scan.nextLine();
			int intPrice = Integer.valueOf(strPrice);
			
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

		//배열에서는 배열.length값을 참조하면 배열의 개수를 알 수 있음.
		//List에서는 list.size() method를 호출하면 list개수를 return 해줌..
		int nSize = cartList.size(); //size개수를 센 후 변수에 저장해서 사용하면 효율적임
		for(int i=0; i<nSize; i++) {
			System.out.printf("%s\t%s\t%d\t%d\n",
					cartList.get(i).getCartUserName(),
					cartList.get(i).getCartPname(),
					cartList.get(i).getCartQty(),
					cartList.get(i).getCartPrice());
		}
		
		
		
	}
}
