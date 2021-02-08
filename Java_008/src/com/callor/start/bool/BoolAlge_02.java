package com.callor.start.bool;

public class BoolAlge_02 {
	public static void main(String[] args) {
		
		boolean bYes1 = 3>3;
		boolean bYes2 = 3==3;
		
		// false && true == false
		boolean bYes3 = bYes1 && bYes2;
		
		//false || true == true;
		boolean bYes4 = bYes1 || bYes2;
		
		int num1 = 100;
		int num2 = 200;
		
		//앞의 연산 true => 둘중 하나만 true면 true이기 때문에 뒤의 코드실행 안함.
		boolean bYes5 = (num1 > 50) || (num2 += 20) > 0; 
		
		if(num1>50) {
			num2 += 20;
		}
		
		System.out.println(num2); // 그래서 num2값은 200
		
		
		bYes5 = (num1 < 50) && (num2 += 20) < 300;
		
		if ( num1<50) {
			num2 += 20;
		}
		
		
		
	}
}
