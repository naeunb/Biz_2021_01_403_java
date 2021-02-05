package com.callor.start.pay;

public class pay_05 {
	public static void main(String[] args) {
		
		int pay = 4_789_800;
		int paper = 100_000;
		int sw = 1;
		
		/*
		 * 일반적으로 for문은 반복되는 횟수가 명확할 때 사용, while문은 반복되는 횟수가 경우에 따라 다를 때 조건을 부여하여 반복수행을 결정 =>조건문만 작성(true일때 반복,false가 되면 종료)
		 */
		while(pay>0) {
			
			int count = pay/paper;
			pay -= (paper*count);
			System.out.println(paper+"원권:"+count);
			if(sw < 0) { //sw가 0보다 작으면
				paper /= 5;
			} else { //그렇지 않으면
				paper /= 2;
			}
			
			sw *= (-1);
		}
	}
}