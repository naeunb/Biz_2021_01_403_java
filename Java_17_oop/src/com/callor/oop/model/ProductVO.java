package com.callor.oop.model;

/*
 * 쇼핑몰에서 판매되는 상품을 관리하기 위한 데이터를 저장할 용도의 Value Object 클래스 디자인(설계)
 * 
 * ProductVO 클래스는 ProductVO.java 파일로 생성되어 저장됨.
 * 클래스를 만들고 파일로 저장하는 과정 ==> 클래스 디자인 또는 설계 "클래스 프로토타입(Prototype)작성"
 * 클래스 프로토타입은 객체를 생성하기 위한 설계도 코드
 * 
 * VO클래스에서 가장 중요한 부분은 인스턴스변수를 선언하는 것.
 * 
 * 상품과리를 위해 필요한 데이터들.
 * -> 상품코드,상품명,품목명,거래처,매입단가,매출단가
 */
public class ProductVO {
	public String strPCode; //상품코드
	public String strPName; //상품명
	public String strItem;  //품목
	public String strDName; //거래처
	public int iPrice; 		//매입단가
	public int oPrice; 		//매출단가
	
	/*
	 * java에서는 클래스를 선언하면 public String toString() 메서드가 자동으로 생성됨.
	 * 하지만 기본적으로 코드는 보이지 않음.
	 * toString()메서드는 객체를 생성했을 때 어떤 클래스를 사용했는지와 생성된 객체가 컴퓨터 기억장치에 어떤 곳(주소)에
	 * 만들어져 저장되어있는지 알려주는 코드가 담겨있음.
	 * java코딩에서 toString()메서드의 기본역할은 크게 필요하지않음. 그래서 일발ㄴ적으로 VO클래스를 만들때는 임의로 
	 * toString()메서드를 다시 만들어줌. 그리고 인스턴스변수에 입력된 값을 알려주는 디버깅코드를 생성해줌.
	 * 
	 * 
	 * 메서드의 재정의(method Override) => 자동으로 만들어져 있는 toString()을 개발자가 임의로 다시 만들었다.
	 */
	public String toString() {
		System.out.println("------------------");
		System.out.println("입력된 데이터 확인");
		System.out.println("------------------");
		System.out.printf("상품코드 : %s\n",this.strPCode);
		System.out.printf("상품명 : %s\n",this.strPName);
		System.out.printf("거래처 : %s\n",this.strDName);
		System.out.printf("품목 : %s\n",this.strItem);
		System.out.printf("매입단가 : %d\n",this.iPrice);
		System.out.printf("매출단가 : %d\n",this.oPrice);
		
		//return "";
		return null;
	}
}
