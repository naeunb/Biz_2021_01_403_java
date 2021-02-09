package com.callor.start;

import java.util.Random;

public class Random_02 {
	public static void main(String[] args) {
		
		//Random클래스를 사용하여 rnd객체를 선언하고 초기화
		//rnd객체가 인스턴스로 변환 : 사용할 준비가 됨
		//rnd인스턴스라고 부름
		Random rnd = new Random();
		
		int num1 = 0;
		//rnd 인스턴스에게 nextInt()명령문을 수행하도록 하고 명령이 수행되면 다음결과를 num1변수에 담아라
		//nextInt()는 난수(random한 숫자)를 만드는 일을 수행하고 왼쪽의변수(rnd)에 담음
		num1 = rnd.nextInt();
		System.out.println(num1);
		System.out.println(rnd.nextInt());
		
	}
}
