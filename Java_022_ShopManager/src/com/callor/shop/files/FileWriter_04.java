package com.callor.shop.files;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileWriter_04 {

	/*
	 * 클래스 영역에 변수를 선언하는 것은 현재 클래스가 포함하고 있는 모든 method들이 변수를 공유하여
	 * 코드를 수행하게 하려는 의도이다.
	 * 
	 * 보통 생성자를 통해 객체를 생성하여 사용하는 클래스에 선언된 클래스 영역 변수를 인스턴스 변수
	 * 라고 한다. 인스턴스 변수는 GC에 의해 메모리관리가 자동으로 이루어진다.
	 * 
	 * static method에서 필요한 변수들은 변수를 선언할 때 static키워드를 추가하여 static변수로 만듦.
	 * 
	 * static 변수는 GC이 접근하지 못한다. 프로젝트가 시작될 때 만들어지고 계속 존재하는 상태.
	 * 프로젝트가 시작될 때 클래스가 자동으로 만들어지고 이때 static변수들도 자동으로 생성된다.
	 *
	 * 클래스가 생성될 때 같이 만들어진다는 의미로 static 키워드가 부착된 변수를 '클래스변수'라고 한다.
	 * 
	 *  static변수는 선언과 생성을 동시에 하도록 코드를 작성한다.
	 *  
	 *  다만 static생성자를 만들어 별도로 생성을 하는 경우도 있다.
	 */
	private static String fileName = "src/com/callor/shop/files/nums.txt";
	private static List<Integer> intList = new ArrayList<Integer>();
	/*
	클래스변수와 인스턴스변수의 차이
	1.클래스변수는 static이 붙어있음 인스턴스는 안붙어있음.
	2.static 무조건 만들어지고 인스턴스변수는 내가 필요할때만 만들어진다.
	*/
	/*
	 * main() method와 같은 클래스내에 있는 다른 method를 호출하여 코드를 수행할 경우 main() method의
	 * 호출을 받는 method들은 모두 static으로 선언되어야 한다.
	 * 
	 * main() method와 static으로 선언된 method들이 클래스영역에 선언된 변수를 공유하려면 클래스 영역
	 * 에 선언된 변수들도 모두 static으로 선언되어야 한다.
	 */
	public static void main(String[] args) {
		/*
		 * static으로 선언된 method내에서는
		 * 같은 클래스의 다른 method를 this.method()형식으로 호출하지 못한다.
		 */
		makeNums(); //this.을 지우고 해당 method에 static추가해줌
		saveFileNums();
		
	} //END main()
	
	private static void makeNums() {
		Random rnd = new Random();
		
		for(int i=0; i<100; i++) {
			intList.add(rnd.nextInt(1000)+1);
		}
	}
	
	private static void saveFileNums() {
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