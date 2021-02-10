package com.callor.applications;

import java.util.Scanner;

public class App_02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자입력(2~9) >> ");
		int keyDan = scan.nextInt();

		if(keyDan > 9 || keyDan < 2) {
			
			System.out.println("warning!!");
			
		} else {
			System.out.println("=============");
			System.out.println("구구단 "+keyDan+"단");
			System.out.println("-------------");
			
			for(int i=2; i<10; i++) {
				System.out.println(keyDan + "x" + i + " = " + keyDan*i);
			}	
		}
	}
}
