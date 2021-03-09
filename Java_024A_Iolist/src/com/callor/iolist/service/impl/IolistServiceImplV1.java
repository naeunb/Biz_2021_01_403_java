package com.callor.iolist.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.iolist.model.IolistVO;
import com.callor.iolist.service.IolistService;
import com.callor.iolist.values.ValIolist;
import com.callor.iolist.values.Values;

public class IolistServiceImplV1 implements IolistService {

	private List<IolistVO> iolist;
	public IolistServiceImplV1() {
		iolist = new ArrayList<IolistVO>();
	}
	
	@Override
	public void loadDataFromFile() {
		// TODO 파일을 읽어서 iolist에 담기
		String fileName = "src/com/callor/iolist/매입매출데이터.txt";
		
		//파일을 읽기 위한 객체선언
		FileReader fileReader = null;
		BufferedReader buffer = null; //파일을 읽을때 도와줌
		
		try {
			//파일을 읽기 위한 객체 생성(초기화)
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader); //buffer 연결
			while(true) { //buffer에 읽어들인 text파일데이터에서 한줄(라인)씩 데이터를 읽어와서 처리
				//buffer에서 한줄씩 데이터를 읽어서 reader변수에 저장
				String reader = buffer.readLine();
				
				//파일을 모두 읽었는지 검사(EOF : End of File)
				//buffer는 EOF에 다다르면 null값을 return하고 reader변수에는 null값이 담겨있게된다. 
				if(reader == null) {
					break; //만약 reader변수에 null값이 담겨있으면 끝내라
				}
				
				//reader 변수에 담긴 문자열을 연산하기
				//1. 문자열을 특별한 구분자로 나누어서 분해한 후
				//2. IolistVO객체에 담고 
				//3. List<IolistVO>리스트에 추가해두기
				
				//컴마를 구분자로 하여 분해
				//분해한 결과는 문자열 배열 형태이므로 문자열 배열을 선언하여 저장해둔다.
				String[] ioDatas = reader.split(","); //,가 안돼는 버전에서는 역슬래시 추가 \,
				
				//필드생성자를 사용하여 IolistVO객체를 생성하면서 인스턴스변수에 값 담기
				IolistVO iolistVO = new IolistVO(
						ioDatas[ValIolist.IO_DATE], //거래일자
						ioDatas[ValIolist.IO_PNAME], //상품명
						ioDatas[ValIolist.IO_DEPT], //거래처명
						Integer.valueOf(ioDatas[ValIolist.IO_INOUT]), //구분
						Integer.valueOf(ioDatas[ValIolist.IO_IPRICE]), //매입단가
						Integer.valueOf(ioDatas[ValIolist.IO_OPRICE]), //판매단가
						Integer.valueOf(ioDatas[ValIolist.IO_QTY])  //수량
				);
				iolist.add(iolistVO);
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일이 없음");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일을 읽는 도중 문제발생");
		}
		
	}

	@Override
	public void iolistSum() {
		// TODO iolist에 담긴 데이터를 구분값을 기준으로 매입금액과 매출금액을 계산
		
		for(IolistVO vo : iolist) {
			int iprice = 0; //매입금액,판매금액을 담을 변수를 0으로 생성
			int oprice = 0;
			int inout = vo.getIoInout(); //구분값을 inout변수에 담기
			
			if(inout == 1) {//구분값이 1일때
				iprice = vo.getIoIprice()*vo.getIoQty();//매입금액 계산
			} else if(inout == 2) {//구분값이 2일때
				oprice = vo.getIoOprice()*vo.getIoQty();//판매금액 계산
			}
			vo.setIoITotal(iprice); //매입금액,판매금액을 vo에 담기
			vo.setIoOTotal(oprice);
		}
		
	}

	@Override
	public void printIolist() {
		// TODO iolist에 담긴 데이터를 출력하기
		
		System.out.println("** Loo9 매입매출 명세서 **");
		System.out.println(Values.dLine(50));
		System.out.println("거래일자\t거래처\t상품명\t매입금액\t판매금액");
		System.out.println(Values.sLine(50));
		
		int nCount = 0;
		int nITotal = 0;
		int nOTotal = 0;
		
		//int형 배열은 배열을 선언함과 동시에 각 요소가 0으로 초기화된다.
		int arrTotal[] = new int[2];
		
		for(IolistVO vo : iolist) {
			System.out.print(vo.getIoDate()+"\t");
			System.out.print(vo.getIoDept()+"\t");
			System.out.print(vo.getIoPName()+"\t");
			System.out.printf("%5d\t",vo.getIoITotal());
			System.out.printf("%5d\n",vo.getIoOTotal());
			
			nCount++;
			nITotal += vo.getIoITotal();
			nOTotal += vo.getIoOTotal();
			
			arrTotal[0] += vo.getIoITotal();
			arrTotal[1] += vo.getIoOTotal();
		}
		System.out.println(Values.sLine(50));
		System.out.printf("합계 : %3d건\t\t%3d\t%3d\n",nCount,nITotal,nOTotal);
		System.out.println(Values.dLine(50));
		
		System.out.printf("합계 : %3d건\t\t",nCount);
		
		for(int n:arrTotal) {
			System.out.printf("%3d\t",n);
		}
		System.out.println();
		
	}

	
}
