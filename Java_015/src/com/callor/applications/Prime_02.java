package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.PrimeServiceV1;

public class Prime_02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PrimeServiceV1 psV1 = new PrimeServiceV1();
		
		System.out.print("숫자 입력(2이상) >> ");
		int key = scan.nextInt();
		psV1.prime(key);
		
	}
}
