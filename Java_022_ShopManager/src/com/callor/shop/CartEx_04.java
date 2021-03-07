package com.callor.shop;

import java.util.Scanner;

import com.callor.shop.model.CartVO;

public class CartEx_04 {
	public static void main(String[] args) {
		
		//매개변수가 없는 생성자를 호출하여 객체를 생성하고 setter 메서드를 사용하여 데이터저장
		CartVO vo1 = new CartVO();
		vo1.setUserName("고길동");
		vo1.setProductName("라면");
		vo1.setQty(10);
		vo1.setPrice(1000);
		
		//매개변수가 있는 생성자를 호출하여 객체를 생성하면서 동시에 데이터를 저장
		CartVO vo2 = new CartVO("둘리","구공탄",20,5000);
		CartVO vo3 = new CartVO("또치","젤리",10,5000);
		
		//매개변수가 있는 생성자일것이다.
		Scanner scan = new Scanner(System.in);
	}
}
