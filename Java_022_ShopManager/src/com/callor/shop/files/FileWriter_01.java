package com.callor.shop.files;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriter_01 {

	/*
	 * main method() : Java의 진입점 method
	 * 프로젝트를 가상머신에 의해 최초로 실행할 때 가상머신이 자동으로 호출하도록 만드는 method
	 * 
	 * FileWriter_01.main("...") 형식으로 호출이 된다.
	 */
	public static void main(String[] args) {
		
		Random rnd = new Random();
		String fileName = "src/com/callor/shop/files/nums.txt";
		
		/*
		 * 지금바로 생성하지 않을경우 clear를 해준다.
		 * 숫자형일 경우 0으로, 		int num = 0;
		 * 클래스일 경우 null값으로, String str = null;
		 */
		FileWriter fileWriter = null; //파일에 데이터를 저장하기 위해 2개의 클래스를 객체로 선언
		PrintWriter printer = null; //text파일을 생성,저장하기 위해 FileWriter와 PrintWriter클래스 사용
		/*
		 * 클래스를 사용한 객체 선언과 객체 생성부분을 분리해야한다. 객체를 생성할때, 사용할때
		 * try-catch가 의무 적용되어야 하기 때문에 코드 작성편의상 분리하는것이 좋음.
		 */
		/*
		 * filerWriter 객체를 생성하면 jvm은 운영체제와 통신을 연결시도한다. 이 과정에서 아무리 코드를
		 * (오류없이)견고하게 만들어도 어쩔수 없이 exception이 발생하는 상황이 많다. java코딩에서는
		 * 이러한 경우 강제의무적으로 try-catch(예외상황처리)를 하도록 한다.
		 */
		// fileWriter = new FileWriter(fileName);
		try {
			fileWriter = new FileWriter(fileName);
			
			/*
			 * fileWriter만으로 파일을 저장할 수 있지만 좀더 복잡한 과정을 실행해야 한다.
			 * fileWriter를 직접 사용하여 파일저장을 하는 방식으로 저수준(Low level)방식이라고 한다.
			 * 저수준 방식은 새로운 방식을 익혀야 할 경우도 있기때문에 다소 부담스럽다.
			 * filerWriter와 printWriter를 연결하면 평소에 많이 사용하던 System.on.print*() method와
			 * 비슷한 방식으로 코드를 작성할 수 있다. 이러한 방식을 고수준(High level)방식이라고 한다.
			 * 저수준보다 다소 느리게 작동될 수 있지만 코드작성의 부담이 훨씬 줄어든다. 또한 최근의
			 * 컴퓨터는 성능이 좋아져서 큰 차이가 나지 않는다.
			 */
			printer = new PrintWriter(fileWriter); //fileWriter를 printWriter와 연결
			
			for(int i=0; i<100; i++) {
				int num = rnd.nextInt(1000)+1;
				printer.println(num);
			}
			
			/*
			 * FileWriter와 PrintWriter등을 사용하여 파일에 내용을 기옥한 후에는 반드시 객체들을
			 * close()해야 한다.close()를 수행하기 전까지는 기록된 데이터들을 운영체제가 임시보관하고
			 * 있다. 운영체제는 close()명령을 받으면 데이터를 파일에 기록한다.
			 */
			printer.close();
			fileWriter.close();
			System.out.println("mission complete");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}