package com.callor.shop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartService;

public class CartServiceV1 implements CartService { // CartService를 implements함.
	//interface : 객체의 사용방법을 정의, 클래스를 구현하기 위한 설계도 역할
	//	=> 객체타입을 다양하게 변경할 수 있어서 코드변경없이 실행내용과 리턴값을 다양하게 할 수 있음. 

	//leak(누수)을 방지하기 위해 인스턴스 객체,변수로 선언'만' 하고 클래스생성자에서 초기화 시킴. => 메모리관리
	private List<CartVO> cartList;
	private Scanner scan;
	public CartServiceV1() {
		scan = new Scanner(System.in);
		cartList = new ArrayList<CartVO>();
	}
	
	@Override
	public void inputCart() { //상품을 입력받고 저장, 배열에 추가하기 위한 method
		
		System.out.println("\n********* 상품 담기 *********");
		System.out.print("손님이름 >> ");
		String inputUserName = scan.nextLine();
		
		int intQty = 0;
		int intPrice = 0;
		System.out.print("상품이름 >> ");
		String inputProductName = scan.nextLine();
		
		while(true) { //수량과 단가는 유효성검사 후 다시 입력받기 위해 while 반복문 사용
			System.out.print("수량 >> ");
			String inputQty = scan.nextLine();
			try { //정수가 아닌 다른 타입의 값을 입력받으면 에러가 나기때문에 방지하기 위해 try catch사용
				intQty = Integer.valueOf(inputQty);
				if(intQty < 1) { //유효성검사를 위해 if 조건문 사용 
					System.out.println("수량은 1이상 입력하세요"); //1미만이면 문구 출력
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("수량은 숫자만 입력하세요"); //정수가 아닌 다른타입의 값을 입력하면 문구출력
			}
		}
		
		while(true) {
			System.out.print("단가 >> ");
			String inputPrice = scan.nextLine();
			try {
				intPrice = Integer.valueOf(inputPrice);
				if(intPrice < 10) {
					System.out.println("단가는 10이상 입력하세요"); //10미만이면 문구 출력
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("단가는 숫자만 입력하세요");
			}
		}
		
		
		CartVO cartVO = new CartVO(); //cartVO에 작성해놓은 변수를 사용하기 위해 준비. 
		cartVO.setUserName(inputUserName); //입력 받은 값을 해당변수(setUserName)에 저장
		cartVO.setProductName(inputProductName);
		cartVO.setQty(intQty);
		cartVO.setPrice(intPrice);
		cartVO.setTotal(intPrice*intQty);
		
		cartList.add(cartVO); //저장한 값을 배열에 추가
		
		
	}

	
	@Override
	public void allCartList() { //전체리스트를 출력하기 위한 method
		int totalPrice = 0;
		System.out.println("\n============================================");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		System.out.println("----------------------------------------------");
		int nSize = cartList.size(); //배열의 개수를 알수있는 키워드 size()를 사용. 졍수형 변수 nSize에 저장 
		for(int i=0; i<nSize; i++) { //배열의 개수만큼 반복
			System.out.print(cartList.get(i).getUserName()+"\t"); //배열에 저장되어있는 값을 불러와서 출력.
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
	public void userCartList() { //구매자별 리스트를 출력하기 위한 method
		int totalPrice = 0;
		System.out.println("\n출력할 구매자 이름을 입력하세요");
		System.out.print("이름 >> ");
		String strUserName = scan.nextLine();//리스트에서 구매자별 리스트를 뽑기위해 구매자이름을 입력받고저장.
		
		System.out.println("\n*"+strUserName+" 장바구니 리스트");
		System.out.println("============================================");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		System.out.println("----------------------------------------------");
		int nSize = cartList.size();
		int countPrd = 0; //상품항목수를 구하기 위해 변수선언 및 초기화
		for(int i=0; i<nSize; i++) {
			if(cartList.get(i).getUserName().equals(strUserName)) {//입력받은 구매자이름을 배열리스트에서 대조.
				System.out.print(cartList.get(i).getUserName()+"\t");
				System.out.print(cartList.get(i).getProductName()+"\t");
				System.out.print(cartList.get(i).getPrice()+"\t");
				System.out.print(cartList.get(i).getQty()+"\t");
				System.out.print(cartList.get(i).getTotal()+"\n");
				totalPrice += cartList.get(i).getTotal();
				countPrd++; //반복되는만큼 1씩 증가해서 항목개수를 알수있음.
			}
		}
		System.out.println("----------------------------------------------");
		System.out.println("합계\t"+countPrd+"가지"+"\t\t\t"+totalPrice+"\n");
	}

}
