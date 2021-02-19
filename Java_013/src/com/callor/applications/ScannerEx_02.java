package com.callor.applications;

import java.util.Scanner;

public class ScannerEx_02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("과목 >> ");
		String strSub = scan.nextLine();
		System.out.println("점수 >> ");
		int intScore = scan.nextInt();
		System.out.printf("%s : %d\n",strSub,intScore);
		
		System.out.println("과목 >> ");
		scan.nextLine();
		strSub = scan.nextLine();
		System.out.println("점수 >> ");
		intScore = scan.nextInt();
		System.out.printf("%s : %d\n",strSub,intScore);
		
		System.out.println("과목 >> ");
		scan.nextLine();
		strSub = scan.nextLine();
		System.out.println("점수 >> ");
		intScore = scan.nextInt();
		System.out.printf("%s : %d\n",strSub,intScore);
		
	}
}
