package com.callor.start.pay;

public class pay_01 {
	public static void main(String[] args) {
		
		int pay = 4_789_800;
		int paper = 100_000;
				
		int sw = 1;
		// for()문은 무한 반복 => for문을 종료하는 조건부여해야함
		for( ; pay>0 ; ) {
			
			int count = pay/paper;
			pay -= (paper*count);
			System.out.println(paper+"원권:"+count);
			if(sw < 0) {
				paper /= 5;
			}
			
			if (sw > 0) {
				paper /= 2;
			}
			//최초에는 sw = -1
			//두번째 for문을 시작하기전 -1을 곱해서 sw를 1로 만든다.
			sw *= (-1);
		}
	}
}
