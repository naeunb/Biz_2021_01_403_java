package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.service.ScoreService;
import com.callor.score.service.values.Values;

public class ScoreServiceImplV1 implements ScoreService {

	//선언만
	private final Random rnd;
	int[] intKorScore;
	int[] intEngScore;
	int[] intMathScore;
	int[] intMusicScore;
	int[] intHistoryScore;
	int[] intTotalScore;
	float[] floatAvgScore;
	
	public ScoreServiceImplV1() {
		//초기화
		rnd = new Random(); 
		intKorScore = new int[20];
		intEngScore = new int[20];
		intMathScore = new int[20];
		intMusicScore = new int[20];
		intHistoryScore = new int[20];
		intTotalScore = new int[20];
		floatAvgScore = new float[20];
	}
	
	@Override
	public void makeScore() { //점수생성 method
		for(int i=0; i<intKorScore.length; i++) {//랜덤으로 점수를 생성해서 변수에 저장
			intKorScore[i] = rnd.nextInt(100)+1;
			intEngScore[i] = rnd.nextInt(100)+1;
			intMathScore[i] = rnd.nextInt(100)+1;
			intMusicScore[i] = rnd.nextInt(100)+1;
			intHistoryScore[i] = rnd.nextInt(100)+1;
		}
		
		for(int i=0; i<intKorScore.length; i++) {//총점 변수에 저장
			intTotalScore[i] = intKorScore[i];
			intTotalScore[i] += intEngScore[i];
			intTotalScore[i] += intMathScore[i];
			intTotalScore[i] += intMusicScore[i];
			intTotalScore[i] += intHistoryScore[i];
		}

		for(int i=0; i<intKorScore.length; i++) {//평균점수 변수에 저장
			floatAvgScore[i] = (float)intTotalScore[i]/3;
		}
		System.out.println("\n생성완료\n");
	}

	@Override
	public void saveScoreToFile() {//점수 파일에 저장 method
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		String fileName = "src/com/callor/score/score.txt";

		
		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);

			for(int i=0; i<intKorScore.length; i++) {
				printer.print(i+1+":");
				printer.print(intKorScore[i]+":");
				printer.print(intEngScore[i]+":");
				printer.print(intMathScore[i]+":");
				printer.print(intMusicScore[i]+":");
				printer.print(intHistoryScore[i]+":");
				printer.print(intTotalScore[i]+":");
				printer.printf("%3.2f\n",floatAvgScore[i]);
			}
			printer.close();
			fileWriter.close();
			System.out.println("\n저장완료\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void loadScoreFromFile() {//저장한 파일 읽기(확인) method
		FileReader fileReader = null;
		BufferedReader buffer = null;
			
		List<String> strLines = new ArrayList<String>();
		
		String fileName = "src/com/callor/score/score.txt";
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String data = buffer.readLine();
				if(data == null) {
					break;
				}
				strLines.add(data);
				
			}
			
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println("\n"+Values.dLineLong);
		System.out.println("순번\t국어\t영어\t수학\t음악\t국사\t총점\t평균");
		System.out.println(Values.sLineLong+"\n");
		
		for(String str : strLines) {
			String[] nums = str.split(":");
			System.out.println();
		}
		
		
	}

}






//intList 에 담긴 전체리스트를
			// 향상된 for로 반복하면서 파일에 출력
		/*	for(Integer n : intList ) {
				printer.println(n);
			}
*/