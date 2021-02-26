package com.callor.opp;

import java.util.ArrayList;
import java.util.List;

public class List_01 {
	public static void main(String[] args) {
		
		/*
		 * == List ==
		 * 배열과 성질이 유사한 java의 클래스.
		 * 개수가 정해지지않은 배열을 생성하는 것과 같다.(최초는 0개)
		 */
		ArrayList<String> books = new ArrayList<String>();
		//					=
		List<String> strNames = new ArrayList<String>();
		
		//books 리스트에 저장된 데이터들 중 0번 위치에 저장된 데이터를 console에 출력하라.
		
		try {
			System.out.println("여기는 add하기 전");
			System.out.println(books.get(0)); //error발생해서 통과
		} catch (Exception e) {
			
		}
		
		//books List에 도서명 추가하기
		//List에 add() method를 사용하여 값을 추가하면 자동으로 개수가 추가되면서 데이터가 저장됨.
		books.add("자바프로그래밍");
		books.add("자바의정석");
		books.add("그리스로마신화");
		
		try {
			System.out.println("add한 후");
			System.out.println(books.get(0));
			System.out.println(books.get(1));
			System.out.println(books.get(2));
		} catch (Exception e) {
			
		}
		
	}
}
