package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
			/*
			System.out.print(i+1+"\t");
			System.out.print(intKorScore[i]+"\t");
			System.out.print(intEngScore[i]+"\t");
			System.out.print(intMathScore[i]+"\t");
			System.out.print(intMusicScore[i]+"\t");
			System.out.print(intHistoryScore[i]+"\t");
			System.out.print(intTotalScore[i]+"\t");
			System.out.printf("%3.2f\n",floatAvgScore[i]);
			*/
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

			printer.println("\n"+Values.dLineLong);
			printer.println("순번\t국어\t영어\t수학\t음악\t국사\t총점\t평균");
			printer.println(Values.sLineLong+"\n");
			for(int i=0; i<intKorScore.length; i++) {
				printer.print(i+1+"\t");
				printer.print(intKorScore[i]+"\t");
				printer.print(intEngScore[i]+"\t");
				printer.print(intMathScore[i]+"\t");
				printer.print(intMusicScore[i]+"\t");
				printer.print(intHistoryScore[i]+"\t");
				printer.print(intTotalScore[i]+"\t");
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
		
		String fileName = "src/com/callor/score/score.txt";
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			
			String readLine = null;
			while((readLine = buffer.readLine()) != null) {
				System.out.println(readLine);
			}
			System.out.println();//enter
			
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
