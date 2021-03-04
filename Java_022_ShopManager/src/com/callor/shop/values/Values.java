package com.callor.shop.values;

public class Values {
	/*
	 * 정적(static)변수
	 * 클래스의 인스턴스 변수에 static키워드가 추가되면 클래스를 사용하여 객체를 선언,생성하지않고 변수에 직접
	 * 접근할 수 있다.
	 * 
	 * 이 프로젝트가 Run될때 JVM에 의해 자동으로 생성되고 사용할 준비가 된다.
	 * 
	 * 프로젝트 전체에서 한번만 생성되고 공유할수 있음.
	 */
	public final static String dLine = "================================";
	public final static String sLine = "--------------------------------";
	
	public final static Integer MENU_START = 1;
	public final static Integer MENU_INPUT = 1;
	public final static Integer MENU_ALL_LIST = 2;
	public final static Integer MENU_USER_LIST = 3;
	public final static Integer MENU_LAST = 3;
}
