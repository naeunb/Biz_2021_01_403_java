package com.callor.student.service.impl;

import java.util.Scanner;

import com.callor.student.model.StudentVO;
import com.callor.student.values.Values;

public class StudentServiceImplV3 extends StudentServiceImplV1 {

	@Override
	public void searchStudent() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println(Values.dLine(50));
			System.out.println("찾는 학생이름을 입력하세요(종료하려면 QUIT를 입력)");
			System.out.println(Values.sLine(50));
			System.out.print("이름 >> ");
			String strName = scan.nextLine();
			
			StudentVO sVO = null; //sVO를선언하고 null로 clear하라
			for(StudentVO vo : stdList) {
				if(strName.equals(vo.getStName())) {
					
					//for() 이전에 선언된 sVO에, 찾은 vo를 복사
					sVO = vo;
					
				}
				if(sVO == null) {
					System.out.println("없음");
				} else {
					this.printStVO(sVO);
				}
			}
		}
	}
	
}
