package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.ClassServiceV7;

public class Class_09 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ClassServiceV7 csV7 = new ClassServiceV7();
		
		System.out.print("숫자를 입력하세요(2~9) >> ");
		int num = scan.nextInt();
		/*
		if(num<2 || num>9) {
			System.out.println("다시입력하세요");
			return;
		}
		*/
		csV7.gugudan(num);
	}
}
