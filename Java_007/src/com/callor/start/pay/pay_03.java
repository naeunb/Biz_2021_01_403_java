package com.callor.start.pay;

public class pay_03 {
	public static void main(String[] args) {
		
		int pay = 4_789_800;
		int paper = 100_000;

		for(int i=-1; pay>0; i++) {
			
			int count = pay/paper;
			pay -= (paper*count);
			System.out.println(paper+"원권:"+count);
			if(i % 2 == 0) {
				paper /= 5;
			} else {
				paper /= 2;
			}
			
		}
	}
}
