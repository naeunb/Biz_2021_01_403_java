package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RndServiceImplV1 {
/*
	//공용으로 사용할 객체이므로 인스턴스 객체변수로 선언
	private List<Integer> intList;
	
	public RndServiceImplV1() {
		intList = new ArrayList<Integer>();
	}
	
	public void makeRnd() { //랜덤수를 생성하여 List에 담을 method
		Random rnd = new Random();
		for(int i=0; i<100; i++) {
			Integer nums = rnd.nextInt(100)+1;
			intList.add(nums);
		}
	}
	
	public void saveFile() {

		String fileName = "src/com/callor/shop/files/nums_rnd.txt";
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);
			int count = 0;
			for(Integer n : intList) {
				printer.print(n+":");
				if(++count % 5 == 0) {
					printer.println();
				}
			}
			
			printer.close();
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	*/
	
	
	// makeRnd()와 saveFileRnd() method가 공용으로
		// 사용할 객체이므로 인스턴스 객체변수로 선언
		private List<Integer> intList;
		public RndServiceImplV1() {
			intList = new ArrayList<Integer>();
		}
		
		// Random 수를 생성하여 List에 담을 method
		public void makeRnd() {
			Random rnd = new Random();
			for(int i = 0 ; i < 100 ; i++) {
				Integer num = rnd.nextInt(1000) + 1;
				intList.add(num);
			}
		}
		/*
		 * 객체지향의 (메서드)다형성
		 * 
		 * 원칙은 한 클래스 파일내에서는
		 * 같은 이름의 method를 두번이상 정의할수 없다
		 * 
		 * 하지만 객체지향 언어에서는
		 * method의 매개변수가 있거나 없거나
		 * 또는 매개변수의 개수가 다르거나
		 * 매개변수의 type이 다르면
		 * 같은 이름의 method를 중복정의(중복하여 정의)할수 있다
		 * 
		 * 다형성, Overloading 이라고 한다.
		 * 
		 */
		
		public void saveFileRnd() {
			String fileName 
			= "src/com/callor/shop/files/nums_rnd.txt";
			this.saveFileRnd(fileName);
		}
		/*
		 * RndServiceImplV1클래스를 처음 디자인할때는
		 * 파일의 이름을 코드에 직접 작성하였다.
		 * 이후 필요에 의해 파일의 이름을
		 * method 매개변수로 받아서 사용할 수 있도록
		 * 변경했다
		 * 그랬더니 처음 V1 클래스를 호출하여 만들었던
		 * 코드들에서 오류가 나타나버렸다.
		 * 
		 * 이 오류를 객체지향의 다형성 원리를 이용하여 
		 * 해결 하였다.
		 * 
		 * 만약 saveFileRnd() 라고 method를 호출하면
		 * 코드에 포함된 파일이름을 적용하여
		 * saveFileRnd(파일이름) method를 호출하도록 
		 * 만들었다
		 * 
		 * 이제는 saveFileRnd(), saeFileRnd(파이이름) 두가지중
		 * 어떤 것이든 호출하여 사용해도 문제가 없어졌다
		 */
		
		// List에 담긴 숫자들을 파일에 저장하는 method
		public void saveFileRnd(String fileName) {
			
			FileWriter fileWriter = null;
			PrintWriter printer = null;
			
			try {
				fileWriter = new FileWriter(fileName);
				printer = new PrintWriter(fileWriter);
				
				int nCount = 0;
				for(Integer n : intList) {
					printer.print(n + ":");
					if(++nCount % 5 == 0) {
						printer.println();
					}
				}
				printer.close();
				fileWriter.close();
				System.out.println("파일 저장 완료");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/*
		 * saveFile() method의 코드를 실행하여 랜덤수들이 저장되어있는 파일에서 랜덤수들을 다시 읽어들여
		 * 연산을 수행하는 method
		 * 
		 * 저장할 때 사용한 파일이름 == 읽을 때 사용할 파일이름
		 * 
		 * 이 상황은 2개의 method가 1개의 공통된 파일이름을 사용한다는 것.
		 * 
		 * 결국 saveFile() method만 사용하기 위해 선언된 fileName변수는 인스턴스 영역에 선언되어야
		 * 코드가 간편해질것이다.
		 */
		public void loadFileRnd() {
			
		}
	
}
