package com.callor.start.loop;

public class Loop_03 {
	public static void main(String[] args) {
		
		// main() method(local) scope 변수
		int intSum = 0;
		for(int i=0; i<10; i++) {
			
			// main() method scope변수인 intSum은 for() 반복문 내에서 자유롭게 읽기,저장이 가능
			intSum += 10;
			System.out.println(i + "," + intSum);
		}
		// for문 종료된 후 변수 i는 소멸, intSum은 값을 읽을 수 있음
		System.out.println("========");
		System.out.println("intSum = "+intSum);
		System.out.println("========");
		
		// 이미 선언되어 사용중인 변수를 clear
		intSum = 0;
		for (int i=0; i<10; i++) {
			int num1 = i+1;
			intSum += num1;
			System.out.println(num1 + "," +intSum);
			
		}
		
	}
}
