package com.callor.applications;

import java.util.Scanner;

public class Class_04 {
	
	/*
	 * 인스턴스(객체)변수 scan1을 생성하고 Scanner(scan1) 클래스의 nextInt() method를 호출하여 키보드입력을받고 입력받은 정수를
	   인스턴스변수 num2에 저장하는 코드
	   
	 * 오류가 나지 않지만 이방식을 사용하면 안됨.  
	 */
	Scanner scan1 = new Scanner(System.in);
	private int num2 = scan1.nextInt();
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		/*
		 * main() method의 지역변수
		 * 지역변수를 선언할 경우 초기화를 하지않고 다른 method의 return값을 저장할 수 있음.
		 */
	}
}
