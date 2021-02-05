package com.callor.start.loop;

public class While_03 {
	public static void main(String[] args) {
		
		int index = 0;
		while(true) {
			//매우불편한코드
			if(index % 3 > 0) {
				System.out.println("  3의 배수가아님");
			}
			
			
			if(++index % 3 == 0) {
				System.out.println(index+"  3의 배수");
			} else {
				System.out.println(index+"  3의 배수아님");
			}
			if(index > 1000) {
				break;
			} 
		}
	}
}
