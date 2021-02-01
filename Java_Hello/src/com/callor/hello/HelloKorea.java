package com.callor.hello;

/*
 * Java class
 * - java언어 문법에 맞도록 작성된 문서파일
 * - public class 키워드로 시작하고 임의로 이름을 작성하여 만든다.
 * - Hello.java 라는 파일에 코드가 저장됨.
 * - 클래스이름과 파일이름은 항상 같아야함.
 * - 예) 클래스가 HelloKorea일경우 파일이름은 HelloKorea.java로 작성함
 * - 클래스이름은 첫글자가 반드시 영문대문자.
 * - 영문대소문자,숫자,_(Under Bar or Under Score)
 * - 두개이상의 단어를 조합할때 camel case로작성.
 */
public class HelloKorea {
	/*
	 * main() method라고 부름. 클래스 안에 main() method가 있어야 코드가 실행됨.
	 */
	public static void main(String args[]) {
		/* console 출력문
		 * ""로 묶인 내용을 문자열(string) 이라고 함.
		 *
		 * 숫자는 그대로 해석함.
		 * 산술(연산)식
		 * 1. 숫자 산술식 : 수학의 4칙연산을 수행.
		 * 2. 문자열 산술식 : ""로 묶인 문자열을 + 연산하면 문자열을 연결. 문자열 산술식은 + 만 가능
		 * 3. 문자열 + 숫자 : 모든 숫자를 자동으로 문자열화하여 문자열 산술식으로 바꿈.
		 */
		System.out.println("30 + 40 = "+(30 + 40));
		System.out.println("30 * 40 = "+30 * 40);
		System.out.println("40 - 30 = "+(40 - 30));
		System.out.println("40 / 20 = "+40 / 20);
		System.out.println("반갑습니다");
	}
}
