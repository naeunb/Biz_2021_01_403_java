package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//VO클래스를 배열로 선언하고 사용(데이터 저장,읽기)하려면 선언된 객체배열 요소를 모두 다시 초기화하는 과정이 필요
		ProductVO[] pVOs = new ProductVO[5];
		for(int i=0; i<pVOs.length; i++) {
			pVOs[i] = new ProductVO();
		} //이 과정이 생략되면 이후 코드에서 NullpointerException이 발생.
		
		System.out.println("==================");
		System.out.println("상품등록");
		System.out.println("------------------");
		
		String strN = 3 + ""; // "3" 이라는 문자열로 저장됨.
		int intN = Integer.valueOf(strN);
		
		for(int i=0; i<pVOs.length; i++) {
			/*
			System.out.print("상품코드 >> ");
			pVOs[i].strPCode = scan.nextLine();
			*/
			String pCode = (i+1) + "";
			pVOs[i].strPCode = pCode;
			System.out.println(pCode + "번 상품정보 입력");
			
			System.out.print("상품명 >> ");
			pVOs[i].strPName = scan.nextLine();
			
			System.out.print("거래처 >> ");
			pVOs[i].strDName = scan.nextLine();
			
			System.out.print("품목 >> ");
			pVOs[i].strItem = scan.nextLine();
			
			System.out.print("매입단가 >> ");
			pVOs[i].iPrice = Integer.valueOf(scan.nextLine());
			
			System.out.print("매출단가 >> ");
			String oPrice = scan.nextLine();
			pVOs[i].oPrice = Integer.valueOf(oPrice);
			System.out.println("------------------");

		}
		for(int i=0; i<pVOs.length; i++) {
			pVOs[i].toString();
		}
	}
}
