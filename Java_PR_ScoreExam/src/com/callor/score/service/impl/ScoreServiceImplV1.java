package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {
	
	private String fileName;
	private List<ScoreVO> scoreList;
	
	public ScoreServiceImplV1() {
		fileName = "src/com/callor/score/data/score.txt";
		scoreList = new ArrayList<ScoreVO>();
	}

	@Override
	public void inputScore() {
		// TODO 점수 및 학번 입력
		scoreList.removeAll(scoreList);
		
		Scanner scan = new Scanner(System.in);
		int intCountSt = 0;
		System.out.println("\n성적정보를 추가할 학생 수를 입력하세요\n");
		while(true) {
			System.out.print("학생 수 입력 >> ");
			String cntSt = scan.nextLine();
			try {
				intCountSt = Integer.valueOf(cntSt);
				if(intCountSt < 1 ) { 
					System.out.println("\n학생 수는 1이상 입력\n");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("\n정수만 입력하세요\n");
			}
		}

		System.out.println("============================");
		System.out.println("학번과 과목점수를 입력");
		System.out.println("============================");

		for(int i=0; i<Integer.valueOf(intCountSt); i++) {
			int intScoreKor = 0;
			int intScoreEng = 0;
			int intScoreMath = 0;
			int intScoreMusic = 0;
			String strNum = null;
			
			while(true) {
				System.out.print("학번 입력(00001 형식으로 입력) >> ");
				strNum = scan.nextLine();
				
				boolean bYesSearch = false;
				for(ScoreVO sVO : scoreList) {
					if(strNum.equals(sVO.getStNum())) {
						bYesSearch = true;
						System.out.println("\n입력할 수 없습니다.");
						System.out.println("다시 입력하세요\n");
					}
				}
				
				//못찾았으면
				if(!bYesSearch) {
					break;
				}
			}

			while(true) {
				System.out.print("국어 점수 >> ");
				String strScoreKor = scan.nextLine();
				try {
					intScoreKor = Integer.valueOf(strScoreKor);
					if(intScoreKor < 0 || intScoreKor > 100) { //유효성검사(1~100까지만 입력)
						System.out.println("\n점수는 0~100까지만 입력가능\n");
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("점수는 숫자로 입력하세요");
				}
			}
			
			while(true) {
				System.out.print("영어 점수 >> ");
				String strScoreEng = scan.nextLine();

				try {
					intScoreEng = Integer.valueOf(strScoreEng);
					if(intScoreEng < 0 || intScoreEng > 100) { //유효성검사(1~100까지만 입력)
						System.out.println("\n점수는 0~100까지만 입력가능\n");
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("점수는 숫자로 입력하세요");
				}
			}
			
			while(true) {
				System.out.print("수학 점수 >> ");
				String strScoreMath = scan.nextLine();

				try {
					intScoreMath = Integer.valueOf(strScoreMath);
					if(intScoreMath < 0 || intScoreMath > 100) { //유효성검사(1~100까지만 입력)
						System.out.println("\n점수는 0~100까지만 입력가능\n");
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("점수는 숫자로 입력하세요");
				}
				
			}
			
			while(true) {
				System.out.print("음악 점수 >> ");
				String strScoreMusic = scan.nextLine();
				
				try {
					intScoreMusic = Integer.valueOf(strScoreMusic);
					if(intScoreMusic < 0 || intScoreMusic > 100) { //유효성검사(1~100까지만 입력)
						System.out.println("\n점수는 0~100까지만 입력가능\n");
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("점수는 숫자로 입력하세요");
				}
			}

			//성적정보생성
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setStNum(strNum);
			scoreVO.setScoreKor(intScoreKor);
			scoreVO.setScoreEng(intScoreEng);
			scoreVO.setScoreMath(intScoreMath);
			scoreVO.setScoreMusic(intScoreMusic);
			
			//성적정보를 리스트에 추가
			scoreList.add(scoreVO);
			
			System.out.println("-------------------------");
		}	
	}
	
	private void totalAndAvg() {
		for(ScoreVO vo : scoreList) {
			int sum = vo.getScoreKor();
			sum += vo.getScoreEng();
			sum += vo.getScoreMath();
			sum += vo.getScoreMusic();
			
			float avg = (float)sum/4;
			
			vo.setTotal(sum);
			vo.setAvg(avg);
		}
	}

	@Override
	public void saveScoreToFile() {
		// TODO 입력받은 데이터를 txt파일로 저장
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);
			
			for(ScoreVO vo : scoreList) {
				printer.print(vo.getStNum()+":");
				printer.print(vo.getScoreKor()+":");
				printer.print(vo.getScoreEng()+":");
				printer.print(vo.getScoreMath()+":");
				printer.print(vo.getScoreMusic()+":\n");
			}
			
			printer.close();
			fileWriter.close();
			System.out.println("\n파일저장 성공\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("\n파일 생성중 문제발생\n");
		}
		
	}

	@Override
	public void loadScoreFromFile() {
		scoreList.removeAll(scoreList); //기존에 저장되어있던 리스트를 모두 제거
		
		// TODO 성적이 저장되어있는 txt파일을 읽어서 성적정보를 리스트에 담기
		FileReader fileReader = null;
		BufferedReader buffer = null;
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String reader = buffer.readLine();
				if(reader == null) { //파일을 다 읽었으면 break
					break;
				}
				String scores[] = reader.split(":");
				
				ScoreVO scoreVO = new ScoreVO(
						scores[0],
						Integer.valueOf(scores[1]),
						Integer.valueOf(scores[2]),
						Integer.valueOf(scores[3]),
						Integer.valueOf(scores[4])
				);
				scoreList.add(scoreVO);
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
	}

	@Override
	public void printScore() {
		// TODO 출력
		this.totalAndAvg();

		System.out.println("======================================================");
		System.out.println("성적일람표");
		System.out.println("======================================================");
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println("------------------------------------------------------");
		
		for(ScoreVO vo : scoreList) {
			System.out.print(vo.getStNum()+"\t");
			System.out.print(vo.getScoreKor()+"\t");
			System.out.print(vo.getScoreEng()+"\t");
			System.out.print(vo.getScoreMath()+"\t");
			System.out.print(vo.getScoreMusic()+"\t");
			
			System.out.print(vo.getTotal()+"\t");
			System.out.printf("%3.2f\t\n",vo.getAvg());
		}
		System.out.println("------------------------------------------------------");

		
		System.out.print("총점 : \t");
		System.out.println();
		System.out.print("평균 : \t");
		System.out.println();
		System.out.println("======================================================");
		
	}

	
}
