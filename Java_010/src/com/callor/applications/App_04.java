package com.callor.applications;

import com.callor.applications.myclass.MyGuGuDan;

public class App_04 {
	public static void main(String[] args) {
		
		//프로젝트에 선언(정의)한 MyGuGuDan클래스에 있는 어떤 기능들을 사용하기 위하여 클래스를 객체로 선언하고 초기화하여 준비하는 절차. 이후에는 myGu객체를 사용하여 메서드들을 실행하는 코드를 사용할 수 있다.
		MyGuGuDan myGu = new MyGuGuDan();
		
		//MyGuGuDan클래스에 선언된 gugu()메서드를 실행하라
		//myGu객체(Object, 인스턴스)
		//gugu() method를 호출(실행)
		myGu.gugu();
	}
}
