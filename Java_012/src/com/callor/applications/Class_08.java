package com.callor.applications;

import com.callor.applications.service.ClassServiceV6;

public class Class_08 {
	public static void main(String[] args) {
		
		ClassServiceV6 csV6 = new ClassServiceV6();
		
		int num1 = 88;
		int num2 = 99;
		
		//변수 num1과 변수 num2에 담긴 값을 전달
		int add = csV6.add(num1, num2);
		int substraction = csV6.subrtraction(num1, num2);
		
		System.out.printf("%d와 %d의\n덧셈 : %d, 뺄셈 : %d",num1,num2,add,substraction);
	
	}
}
