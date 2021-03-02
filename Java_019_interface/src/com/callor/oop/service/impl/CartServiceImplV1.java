package com.callor.oop.service.impl;

import com.callor.oop.service.CartService;

/*
 * 1. CartServiceImplV1 클래스에서 CartService interface를 implements 함.
 * 2. 클래스이름에 오류가 발생.
 * 3. 해결방법으로 Add Unimple... method를 실행.
 * 4. CartService interface에 정의해둔 method가 자동으로 생성됨.
 * 5. CartService interface를 implements 하므로써 반드시 구현해야 할 method가 무엇인지 명확하게 알 수 있음.
 * 5-1. CartService** 클래스에서 반드시 구현해야 할 method들이 무엇인지 알 수 있고 그 method들은 이름까지 정해지는 상태
 * 	    가 됨.
 */
public class CartServiceImplV1 implements CartService {

	@Override
	public void inputCart() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printCart() {
		// TODO Auto-generated method stub
		
	}

}
