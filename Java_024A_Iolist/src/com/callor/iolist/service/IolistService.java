package com.callor.iolist.service;


/*
 * 파일을 읽어서 iolist에 담기
 * iolist에 담긴 데이터를 구분값을 기준으로 매입금액과 매출금액을 계산
 * iolist에 담긴 데이터를 출력하기
 */
public interface IolistService {

	public void loadDataFromFile(); //파일을 읽어서 iolist에 담기
	public void iolistSum(); //iolist에 담긴 데이터를 구분값을 기준으로 매입금액과 매출금액을 계산
	public void printIolist(); //iolist에 담긴 데이터를 출력하기
	
}
