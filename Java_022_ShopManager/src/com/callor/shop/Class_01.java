package com.callor.shop;

/*
 * 변수,method등 아무것도 없는 비어있는 클래스는
 * java클래스들의 시조 조상인 Object를 자동으로 extends한다.
 */
public class Class_01 extends Object {

	/*
	 * 원천적으로 모든 클래스는 Object클래스에 만들어져(정의되어있는) toString() method를 가지고 있다.
	 * toString() method는 Object클래스로부터 상속받은 것이다.
	 * 
	 * java에서는 상속받은 method를 필요에 따라 마음대로 요리해서 변형할 수 있다.
	 * 이러한것을 'method의 재 정의'라고 한다.
	 */
	@Override // @... : Annotation(주석) //@Override : Override Annotation
	public String toString() {
		return "나는 Object를 상속받은 Class_01 입니다";
	}
	
	/*
	 * @Override
	 * 부모 클래스에서 상속 받았지만 여기에서 재정의하겠다는 의미.
	 */
	
}
