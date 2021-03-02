package com.callor.oop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;
/*
 * Service 클래스
 * main() method에서 구현한 코드들을 별도의 클래스로 분리하고 작은 method 단위로 코드를 작성하여 전체적으로 단위코드
 * 가 작아지도록 하기 위한 방법. 이후의 유지보수(업그레이드,오류정정)를 유리하게 하기 위한 방법.
 */
public class CartServiceV1 {

	// 인스턴스 영역에 선언된 객체들을 특별한경우가 아니면 private으로 일단 선언.
	// 이 클래스에서만 사용할 때 private 써주는게 메모리관리측면에서 좋음.
	private List<CartVO> cartList = new ArrayList<CartVO>();
	private Scanner scan = new Scanner(System.in);
	
	
	public void inputCart() {	
		/*
		 * Scanner, File, Network 등 이러한 클래스들을 운영체제와 연동하여 컴퓨터자체의 자원(Resource)을 사용하게 됨.
		 * 컴퓨터자체의 자원은 유한함. 때문에 자원은 무턱대고 열고 사용만 해서는 안됨.
		 * 자원을 사용하기 위해 선언을 한 후 사용이 끝나면 반드시 반납(close)해야 함. 그래야만 Application이 실행되는 
		 * 과정에서 자원의 누수(leak)가 발생하지 않는다.
		 * 
		 * inputCart method()는 사용방법에 따라 반복적으로 호출이 될 것. 반복적으로 호출되는 동안 Scanner가 열리고(연결)
		 * 닫히는 과정이 계속 반복됨. Resource를 열고 닫는 과정은 실제 컴퓨터,운영체제,어플리케이션 입장에서는 상당히 
		 * 많은 일을 수행해야 함. 이러한 과정은 어플리케이션의 성능을 저하시키는 중대한 원인이 될 수 있음. 그래서
		 * Scanner를 method안에서 선언하지 않고 클래스의 인스턴스 영역으로 보낸다.
		 */
		//Scanner scan = new Scanner(System.in);
		
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
					System.out.println("다시입력하세요(1000이상)");
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
