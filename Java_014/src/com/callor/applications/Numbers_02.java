package com.callor.applications;

public class Numbers_02 {
	public static void main(String[] args) {
		
		int intNum1 = 33;
		int intNum2 = 77;
		int intNum3 = 0;

		System.out.println("intNum1 = "+intNum1);
		System.out.println("intNum2 = "+intNum2);
		/*		
		intNum3 = intNum1;
		intNum1 = intNum2;
		intNum2 = intNum3;
		
		System.out.println("==================");
		System.out.println("intNum1 = "+intNum1);
		System.out.println("intNum2 = "+intNum2);
	    */
		
		
		//1.임시로 사용할 intTemp를 만들고
		//2.num1변수값(33)을 복사해둠(백업)  => intTemp=33
		int intTemp = intNum1;
		
		//3.num1변수에 num2의 값을 복사 => intNum1=77
		intNum1 = intNum2;
		
		//4.임시로 temp에 백업해둔 num1의 값을 num2에 복사 => intNum2=33
		intNum2 = intTemp;
		
		//5.num1과 num2의 값이 서로 바뀜 => 변수값의 swap코드
		
		
		System.out.println("==================");
		System.out.println("intNum1 = "+intNum1);
		System.out.println("intNum2 = "+intNum2);
		
	}
}