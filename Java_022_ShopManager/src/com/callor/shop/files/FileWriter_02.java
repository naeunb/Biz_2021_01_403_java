package com.callor.shop.files;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriter_02 {


	public static void main(String[] args) {
		
		Random rnd = new Random();
		String fileName = "src/com/callor/shop/files/nums.txt";
		
		int[] rndNums = new int[100];
		for(int i=0; i<rndNums.length; i++) {
			rndNums[i] = rnd.nextInt(1000)+1;
		}
		
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);
			
			/*
			 * rndNums배열에 담긴 전체리스트를 향상된 for로 반복하면서 파일에 출력
			 */
			for(int n : rndNums) {
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