package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RndServiceImplV2 {

	//공용으로 사용할 객체이므로 인스턴스 객체변수로 선언
	private List<Integer> intList;
	private String fileName;
	
	/*
	 * 매개변수가 없는 생성자와 파일이름을 매개변수로 전달받아야 하는 생성자를 선언했다.
	 * 
	 * 매개변수가 없는 생성자를 호출하여 객체를 생성하면 (= new RndServiceImplV2() 라고 한다면)
	 * 파일이름을 매개변수를 전달하면서 다시 매개변수가 있는 생성자를 호출한다
	 */
	public RndServiceImplV2() {
		this("src/com/callor/shop/files/nums_rnd.txt");
	}
	
	/*
	 * 매개변수가 있는 생성자는 객체를 생성할때 반드시 파일이름을 전달받아야한다.
	 * = new RndServiceImplV2(파일이름);
	 */
	public RndServiceImplV2(String fileName) {
		intList = new ArrayList<Integer>();
		this.fileName = fileName;//"src/com/callor/shop/files/nums_rnd.txt";
	}
	
	
	public void makeRnd() { //랜덤수를 생성하여 List에 담을 method
		Random rnd = new Random();
		for(int i=0; i<100; i++) {
			Integer nums = rnd.nextInt(1000)+1;
			intList.add(nums);
		}
	}
	

	/*
	 * == 객체지향의 (메서드)다형성 ==
	 * 원칙은 한 클래스 파일 내에서는 같은 이름의 method를 두번이상 정의할 수 없음.
	 * 하지만 객체지향 언어에서는 method의 매개변수가 있거나 없거나 또는 매개변수의 개수가 다르거나
	 * 매개변수의 type이 다르면 같은 이름의 메서드를 중복하여 정의할 수 있다.
	 * 
	 * 		=> 다형성, Overloading 이라고 한다.
	 */
	public void saveFile() {
		this.saveFile("src/com/callor/shop/files/nums_rnd.txt");
	}
	/*
	 * RndServiceImplV1클래스를 처음 디자인할때는 파일의 이름을 코드에 직접 작성하였다.
	 * 이후 필요에 의해 파일의 이름을 메서드 매개변수로 받아서 사용할 수 있도록 변경했다.
	 * 
	 * 그랬더니 처음 V1클래스를 호출하여 만들었던 코드들에서 오류가 생김.
	 * 이 오류를 객체지향의 다형성 원리를 이용하여 해결함.
	 * 만약 saveFile() 이라고 method를 호출하면 코드에 포함된 파일이름을 적용하여
	 * saveFile(파일이름) method를 호출하도록 만들었다.
	 * 
	 *  이제는 saveFile(), saveFile(파일이름) 두가지 중 어떤 것이든 호출하여 사용해도 문제가없다.
	 */
	
	
	
	/*
	 * 저장할 파일 이름을 코드에 포함하지 않고 saveFile() method를 호출하는 곳에서 파일이름을 전달해
	 * 주도록 코드를 변경. 
	 */
	public void saveFile(String fileName) {

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
			System.out.println("파일 저장 완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void loadFileRnd() {
		
	}
	
	
	
	
}
