package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_01 {
	public static void main(String[] args) {
		
		ProductVO prdVO = new ProductVO();
		
		Scanner scan = new Scanner(System.in);

		System.out.println("------------------");
		System.out.println("상품정보 입력");
		System.out.println("------------------");
		System.out.print("상품코드 >> ");
		prdVO.strPCode = scan.nextLine();
		
		System.out.print("상품명 >> ");
		prdVO.strPName = scan.nextLine();
		
		System.out.print("거래처 >> ");
		prdVO.strDName = scan.nextLine();
		
		System.out.print("품목 >> ");
		prdVO.strItem = scan.nextLine();
		
		System.out.print("매입단가 >> ");
		prdVO.iPrice = scan.nextInt();
		
		System.out.print("매출단가 >> ");
		prdVO.oPrice = scan.nextInt();
		
		prdVO.toString();
	}
}
