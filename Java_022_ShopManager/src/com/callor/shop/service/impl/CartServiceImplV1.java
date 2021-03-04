package com.callor.shop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartService;
import com.callor.shop.values.Values;
import com.sun.jdi.Value;

public class CartServiceImplV1 implements CartService {

	/*
	 * ImplV1에서 inputCart() method를 사용하여 cartList에 상품리스트를 추가하고 
	 * 
	 * ImplV1을 상속받은 ImplV2의 새로운 save...() method에서
	 * cartList에 저장된 데이터를 사용하려고 시도
	 * 
	 * 이러한 경우에 
	 * private으로 선언된 변수(객체)는 서로 공유가 되지 않는다.
	 * 상속받은 클래스의 method에서 변수(객체)를 공유하려면 부모클래스에서 변수(객체)를 반드시
	 * protected로 선언해 주어야 한다.
	 * 또한 상속받은 클래스에서는 해당 변수(객체)를 선언해서는 안된다.
	 */
	protected List<CartVO> cartList;
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
		
		System.out.println("상품이름을 입력하세요");
		System.out.print(">> ");
		String strProductName = scan.nextLine();
		
		System.out.println("구매수량을 입력하세요");
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
		
		System.out.println("가격을 입력하세요");
		Integer intPrice = 0;
		while(true) {
			System.out.print(">> ");
			String strPrice = scan.nextLine();
			try {
				intPrice = Integer.valueOf(strPrice);	
			} catch (Exception e) {
				System.out.println("가격은 숫자만 입력하세요");
			}
			if(intPrice < 100) {
				System.out.println("가격은 100이상 입력하세요");
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
	
	/*
	 * private으로 선언된 method는 현재 클래스에서만 호출이 가능한 method
	 */
	private void printHeader() {
		System.out.println(Values.dLine);
		System.out.println("구매자\n상품명\n수량\n단가\n금액");
		System.out.println(Values.sLine);
	}
	
	private void printBody(CartVO cartVO) {
		//cartVO에서 각 인스턴스 변수를 읽어서 출력
		System.out.print(cartVO.getUserName()+"\t");
		System.out.printf("%s\t",cartVO.getProductName());
		System.out.printf("%s\t",cartVO.getQty());
		System.out.printf("%s\t",cartVO.getPrice());
		System.out.printf("%s\n",cartVO.getTotal());
	}

	@Override
	public void printAllCart() {
		// TODO 장바구니 전체보기
		this.printHeader();		
		
		//카트리스트의 상품개수를 계산하여 nSize에 저장
		int nSize = cartList.size();
		for(int i=0; i<nSize; i++) {
			/*
			 * cartList.git(i)는 cartList에 저장되어있는 i번째 요소.
			 * 이 요소는 결국 cartVO클래스로 만든 객체.
			 */
			/*
			System.out.print(cartList.get(i).getUserName()+"\t");
			System.out.print(cartList.get(i).getProductName()+"\t");
			System.out.print(cartList.get(i).getQty()+"\t");
			System.out.print(cartList.get(i).getPrice()+"\t");
			System.out.print(cartList.get(i).getTotal()+"\n");
			*/
			
			//cartList의 i번째 요소를 getter하여 임시선언된 cartVO객체에 저장.
			CartVO cartVO = cartList.get(i);// =>for()명령 내에 있기때문에.
			this.printBody(cartVO);
		}
		System.out.println(Values.sLine);
		
	}

	@Override
	public void printUserCart() {
		// TODO 구매자별 장바구니 보기
		System.out.println(Values.dLine);
		System.out.println("구매자별 리스트");
		System.out.print("구매자명 >> ");
		String strUserName = scan.nextLine();
		
		this.printHeader();
		int nSize = cartList.size();
		for(int i=0; i<nSize; i++) {
			CartVO cartVO = cartList.get(i);
			if(cartVO.getUserName().equals(strUserName)) {
				this.printBody(cartVO);	
			}
			
		}
	}

	
}
