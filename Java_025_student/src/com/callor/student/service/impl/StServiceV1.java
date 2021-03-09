package com.callor.student.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.model.StudentVO;
import com.callor.student.service.StService;
import com.callor.student.values.Values;

public class StServiceV1 implements StService {

	private List<StudentVO> stList;
	public StServiceV1() {
		stList = new ArrayList<StudentVO>();
	}
	
	@Override
	public void loadFile() {
		String fileName = "src/com/callor/student/학생정보리스트.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String reader = buffer.readLine();
				
				if(reader == null) {
					break;
				}
				
				String[] stDatas = reader.split(":");
				
				StudentVO stVO = new StudentVO(
						Integer.valueOf(stDatas[Values.ST_NUM]),
						stDatas[Values.ST_NAME],
						stDatas[Values.ST_MAJOR],
						Integer.valueOf(stDatas[Values.ST_GRADE]),
						Integer.valueOf(stDatas[Values.ST_CLASS]),
						stDatas[Values.ST_ADDR],
						stDatas[Values.ST_TEL]
				);
				stList.add(stVO);
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
	public void print() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(Values.dLine(50));
		System.out.println("찾는 학생이름을 입력하세요(종료하려면 QUIT를 입력)");
		System.out.println(Values.sLine(50));
		
		String inputName;
		
		while(true) {
			System.out.print("이름 >> ");
			inputName = scan.nextLine();
			
			if(inputName.equalsIgnoreCase("quit")) {
				System.out.println("종료");
				break;
			}
			
			for(StudentVO vo : stList) {
				if(vo.getStName().equals(inputName)) {
					System.out.printf("\n이름 : %3s\n",vo.getStName());
					System.out.printf("학과 : %3s\n",vo.getMajor());
					System.out.printf("학년 : %3d학년\n",vo.getGrade());
					System.out.printf("반 : %3d반\n",vo.getStClass());
					System.out.printf("주소 : %3s\n",vo.getAddr());
					System.out.printf("전화번호 : %3s\n\n",vo.getTel());
					break;
				}
			}
		}
	}
}
