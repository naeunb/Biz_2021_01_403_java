package com.callor.start.loop;

public class Loop_02 {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i += 1) {
			
		}
		int num = 0;
		num = num+1;
		num += 1;
		/* 단항연산자 */
		num++; // num변수를 1증가 
		++num; 
		
		num = num-1;
		num -= 1;
		num--;
		--num;
		for(int i=0; i<10; i++) {
			
		}
		
		// i값이 100부터 시작해서 i<0까지 1씩 감소하면서 반복
		for(int i=100; i>0; i--) {
			System.out.println(i);
			
		}

	}
		
}
