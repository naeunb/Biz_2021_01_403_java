package com.callor.applications.service;

public class ClassServiceV1 {
	
	/*
	 * java코딩을 할 때 {}내에서 같은 이름의 변수는 2번이상 선언불가
	 * 
	 * class {}내에서 같은 이름의 메서드는 2번이상 선언불가. 하지만 java에서는 메서드의 매개변수 개수나 타입이 다르면 같은 이름의
	   메서드를 중복선언가능 
	 */
	public void add(int intNum1, int intNum2) {
		System.out.println("intNum1 + intNum2 = "+(intNum1+intNum2));
	}
		
	public void add(int intNum1, float floatNum1) {
		System.out.println("intNum1 + floatNum2 = "+(intNum1+floatNum1));
	}
	
	public void add(double doubleNum1, float floatNum1) {
		System.out.println("doubleNum1 * floatNum1 = "+(doubleNum1*floatNum1));
	}
}
