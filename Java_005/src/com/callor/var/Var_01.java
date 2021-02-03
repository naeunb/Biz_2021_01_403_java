package com.callor.var;

public class Var_01 {
	public static void main(String[] args) {
		
		/*
		 * 위쪽에 선언한 변수는 아래쪽에 또 선언해서는 안됨.
		 * 한번 선언된 변수이름으로 또 다시 선언할 수 없음.
		 */
		int num1 = 30;
		int num2 = 40; 
		
		/*
		 * 변수 이름짓기
		 * 첫글자는 영문소문자
		 * 이후 숫자,영문대소문자, _를 사용할 수 있다.
		 * 두개 이상의 단어를 조합하여 사용하는 것을 권장
		 * 두번째 단어부터는 첫글자를 대문자로작성 => (lower) Camel Case
		 */
		int korScore = 90;
		int endScore = 100;
		int mathScore = 95;
		
		/*
		 * 2개 이상의 단어로 조합이 다소 불편할 때
		 * 변수명 접두사로 변수의 형(type)을 붙인다 => 헝가리언 표기법
		 */
		int intNum1 = 20;
		int intNum2 = 30;
		int intNum3 = 40;
		
		float floatNum1 = 20.0F;
		float fNum2 = 30.0F;
		
		double doNum1 = 20.0;
		double doNum2 = 30.0;
		
		String strName = "홍길동";
		String strNation = "대한민국";
		String strTel = "010-111-1234";
		String strAddr = "서울특별시";
		
		/*
		 * 변수명 단어와 단어사이에 UnderScore => snake case
		 * 
		 * 데이터베이스와 연동하는 프로젝트를 만들 때 주로 사용함.
		 */
		String str_name = "이몽룡";
		String st_name = "성춘향"; //student_name
		String st_num = "20210110"; //student_num
		String dept_name = "컴퓨터공학";
		
		
	}// main() method의 local area, 또는 local scope라고 하며 줄여서 local이라고 함.
}// 클래스 Var_01의 private 영역이라고 함. 또는 Var_01클래스의 local 영역이라고 함.
