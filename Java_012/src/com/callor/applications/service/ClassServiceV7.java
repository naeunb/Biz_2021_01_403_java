package com.callor.applications.service;

public class ClassServiceV7 {
	
	/*
	 * 정수1개를 매개변수 dan에 전달받아 구구단 출력
	 */
	public void gugudan(int dan) {
		System.out.println("==========");
		System.out.printf("---%d 단---\n",dan);
		System.out.println("==========");
		for(int i=1; i<10; i++) {
			System.out.printf("%d x %d = %d\n",dan,i,dan*i);
		}
		System.out.println("==========\n");
	}
}