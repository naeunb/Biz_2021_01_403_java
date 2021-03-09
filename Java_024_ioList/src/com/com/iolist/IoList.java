package com.com.iolist;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.com.iolist.model.IoListVO;
import com.com.iolist.values.Values;

public class IoList {
	public static void main(String[] args) {
		
		List<IoListVO> ioList = new ArrayList<IoListVO>();//데이터를 담기위한 배열
		
		//======================파일읽기=========================
		String fileName = "src/com/com/iolist/매입매출데이터.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			while(true) {
				String reader = buffer.readLine();//한줄씩 읽고 변수에 저장
				if(reader == null) {
					break;
				}
				String scores[] = reader.split(",");//','를 기준으로 잘라서 배열에 담기
				
				IoListVO vo = new IoListVO(
						scores[0], //거래일자
						scores[1], //공백
						scores[1], //공백
						scores[1], //공백
						scores[4], //상품명
						scores[5], //거래처명
						scores[6], //대표자명
						Integer.valueOf(scores[7]), //구분
						Integer.valueOf(scores[8]), //매입단가
						Integer.valueOf(scores[9]), //판매단가
						Integer.valueOf(scores[10]) //수량
				);
				ioList.add(vo);
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(fileName+" 파일이 없습니다");
		} catch (IOException e) {
			System.out.println("파일을 읽는동안 문제 발생");
		}
		//--------------------------------------------------------
		
		
		
		//========구분(1,2)에 따라 금액계산(매입,판매금액)========
		int intPrdPrice = 0; //매입금액 변수 선언및 초기화
		int intSelPrice = 0; //판매금액 변수 선언및 초기화
		for(IoListVO vo : ioList) {
			if(vo.getSort() == 1) { //sort가 1일때
				intPrdPrice = vo.getPrdPrice() * vo.getQty(); //매입단가 * 수량
				vo.setTotalPrdPrice(intPrdPrice);
			} else if(vo.getSort() == 2) { //2일때
				intSelPrice = vo.getSelPrice() * vo.getQty(); //판매단가 * 수량
				vo.setTotalSelPrice(intSelPrice);
			}
		}
		//--------------------------------------------------------

		
		
		//====출력(구분'1,2'에 따라 매입,판매금액 다르게 출력)====
		System.out.println(Values.dLine);
		System.out.println("거래일자\t거래처\t상품이름\t매입금액\t판매금액");
		System.out.println(Values.sLine);
		
		for(IoListVO vo : ioList) {
			System.out.print(vo.getDate()+"\t");
			System.out.print(vo.getCustomer()+"\t");
			System.out.print(vo.getPrdName()+"\t");
			if(vo.getSort() == 1) { //sort가 1일때
				System.out.print(vo.getTotalPrdPrice()+"\t");
				System.out.print(0+"\n"); //판매금액 0
			} else if(vo.getSort()==2) { //sort가 2일때
				System.out.print(0+"\t"); //매입금액 0
				System.out.print(vo.getTotalSelPrice()+"\n");
			}
		}
		//---------------------------------------------------------
	}
}
