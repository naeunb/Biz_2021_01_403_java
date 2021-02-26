package com.callor.opp;

import java.util.ArrayList;
import java.util.List;

import com.callor.oop.model.CartVO;

public class CartList_02 {
	public static void main(String[] args) {
		
		List<CartVO> cartList = new ArrayList<CartVO>();
		
		/*
		 * int num = 100;이라고 변수를 선언하면 기억장치 어딘가에 정수100을 저장하고 그곳에 num이라는 별명을 부착.
		 * num = 40 등의 코드를 수행해서 변수값을 변경하고 System.out.println(num)등의 코드를 수행해서 변수에
		 * 저장된 값을 읽을 수 있음.
		 *
		 * VO 클래스를 사용하여 객체를 선언 및 생성하면 클래스 VO클래스에는 다양한 type의 인스턴스 변수들이 포함
		 * 되어 있기때문에 변수처럼 한곳에 모아둘 수 없음.
		 * 
		 * 1. VO클래스에 선언된 인스턴스변수들을 저장할 기억장소를 예약하고
		 * 2. 기억장소의 주소를 객체변수에 저장함. 
		 * 3. 결국 cartVO에 실제로 담긴 값은 인스턴스변수에 저장한 값들이 아닌 인스턴스 변수들의 주소가 됨.
		 * 
		 */
		CartVO cartVO = new CartVO();
		
		cartVO.setCartUserName("홍길동");
		// .add()명령이 실행되면 데이터가 아닌 "데이터가 저장된 주소"가 추가되는 것. 
		cartList.add(cartVO);
		
		cartVO = new CartVO(); //추가해줘야함
		cartVO.setCartUserName("이몽룡");
		cartList.add(cartVO);
		
		cartVO = new CartVO();
		cartVO.setCartUserName("성춘향");
		cartList.add(cartVO);
		
		cartVO = new CartVO();
		cartVO.setCartUserName("장녹수");
		cartList.add(cartVO);
		
		cartVO = new CartVO();
		cartVO.setCartUserName("임꺽정");
		cartList.add(cartVO);
		
		
		for(int i=0; i<5; i++) {
			String name = cartList.get(i).getCartUserName();
			System.out.println("구매자 : "+name);
		}
		
		
		
		
	}
}
