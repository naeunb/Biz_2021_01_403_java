package com.callor.oop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;
import com.callor.oop.service.CartService;

public class CartServiceImplV2 implements CartService {

	/*
	 * 1.cartList와 scan 인스턴스객체변수를 선언만하고 생성(초기화)은 하지 않음.
	 * 
	 * 이렇게 하면 생성되지 않은 인스턴스 객체변수의 method를 호출하는 코드에서 NullpointerException이 발생할 것.
	 * 
	 * 3.NullpointerException을 방지하기 위해 클래스의 생성자 method에 객체변수를 초기화하는 코드를 반드시 추가해줌.
	 * 
	 * 즉 인스턴스변수선언
	 * => 생성자에서 객체변수 초기화(생성)
	 * 
	 * 이렇게 복잡한 과정으로 코드를 작성하는 이유는 Java GC(Garbage Collection : 메모리 자동관리)가 작동되는 
	 * 과정에서 혹시모를 누수(leak)를 방지하기 위한 조치.
	 * 
	 * Java GC : 프로젝트가 실행되는 과정에서 사용이 끝났음에도 아직 메모리에 남아있는 변수,객체등을 자동으로 제거
	 * 하여 메모리누수를 없애고 관리하는 Java의 기능.
	 */
	private List<CartVO> cartList; // = new ArrayList<CartVO>()
	private Scanner scan;
	
	/*
	 * == constructor : 생성자 method ==
	 * 클래스 이름과 대소문자까지 같은 method.
	 * return type(void,int,string)이 없는 method.
	 * 
	 * 클래스를 객체로 선언하고 초기화(생성)할 때 사용하는 아래 코드에서 
	 * CartServiceImplV2 cs = new CartServiceImplV2();
	 * new CartServiceImplV2() <- 이 코드가 클래스의 생성자를 호출하여 객체를 생성하는 부분.
	 * 
	 * 생성자 method는 특별한 경우가 아니면 클래스를 선언할 때 자동으로 코드가 만들어지고 감춰진 상태로 존재함.
	 */
	public CartServiceImplV2() {
		//2.선언만 된 인스턴스 객체변수를 클래스생성자에서 초기화 함.
		cartList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);
		
	}
	
	@Override
	public void inputCart() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printCart() {
		// TODO Auto-generated method stub
		
	}

	
}
