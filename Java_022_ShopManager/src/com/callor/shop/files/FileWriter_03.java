package com.callor.shop.files;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileWriter_03 {


	public static void main(String[] args) {
		
		Random rnd = new Random();
		String fileName = "src/com/callor/shop/files/nums.txt";
		
		//리스트를 만들어서 random수 저장하기
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i=0; i<100; i++) {
			//1번코드(같지만 변수를 만들어 사용할것인가의 차이)
			Integer num = rnd.nextInt(1000)+1;
			intList.add(num);
			
			//2번코드
			intList.add(rnd.nextInt(1000)+1);
		}
		
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);
			
			/*
			 * rndNums배열에 담긴 전체리스트를 향상된 for로 반복하면서 파일에 출력
			 */
			for(Integer n : intList) {
				printer.println(n);
			}
			
			/*
			 * 표준형 for로 반복하면서 파일에 출력
			 */
			int nSize = intList.size();
			for(int i=0; i<nSize; i++) {
				Integer n = intList.get(i);
				printer.println(n);
			}
		
			printer.close();
			fileWriter.close();
			System.out.println("mission complete");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}