package com.callor.opp;

import java.util.ArrayList;

/*
 * == List 클래스 ==
 * 배열의 단점을 보완하기 위해 java의 JDK에 포함되어 있는, 데이터리스트를 관리하기 위한 클래스
 * 
 *  1. 데이터(값)들을 다량으로 저장하는 용도의 객체생성.
 *  2. 배열을 선언하여 값을 저장하는 것과 비슷한 용도.
 *  3. 처음생성할 때 몇개의 데이터를 저장할지 결정하지 않고
 *  4. 필요에 따라 데이터를 추가,수정,삭제 할 수 있음.
 *  	-> 배열은 처음 생성한 개수를 변경하면 저장되어 있던 데이터를 사용할 수 없게 된다.
 *  5. add() method를 사용하여 데이터를 추가하고 
 *  6. get(위치) method를 사용하여 저장된 데이터를 읽을 수 있음.
 *  	-> 다른 변수에 저장하거나 출력할  수 있음.
 */
public class List_02 {
	public static void main(String[] args) {
		
		/*
		 * 배열은 처음 생성할 때 지정한 type외에 다른 type은 저장할 수 없음.
		 * 
		 * 이미선언된 배열은 다른type으로 다시 선언할 수도 없다.
		 */
		int[] nums = new int[10];
		nums[0] = 30;
		//nums[1] = "30";        (X) 
		//nums[2] = "대한민국";  (X)
		
		//nums = new float[10];  (X)
		//nums[3] = 30f;         (X)
		
		// 공동type의 ArrayList형 객체 생성
		ArrayList list1 = new ArrayList();	// list1객체에 여러 type의 데이터를 추가하여 관리하겠다는 의미
		list1.add(3);
		list1.add("대한민국");
		list1.add(3.2f);
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		
		// ArrayList형 객체를 생성하는 strList1 객체에는 String type의 데이터들만 추가할 수 있음.
		// <String> : Generic type => strLIst1은 ArrayList객체이지만 여기엔 문자열만 저장하도록 하겠다는 의미
		// Generic type은 Integer, Float, Long, Double, String등을 사용해야함.
		//			   => int, float, long, double 등은 사용불가
		// Generic type은 VO클래스를 사용할 수 있음.
		ArrayList<String> strList1 = new ArrayList<String>();
		ArrayList<Integer> intList1 = new ArrayList<Integer>();
		
		// strList1은 Generic이 String으로 설정되어있기 때문에 문자열이외에는 add할 수 없음.
		strList1.add("대한민국");
		//strList1.add(30);    (X)
		//strList1.add(30.0f); (X)
		
		// intLIst1은 Generic이 Integer로 설정되어있기 때문에 정수값 외에는 add할 수 없음.
		intList1.add(30);
		//intList1.add("30");  (X)
		intList1.add(Integer.valueOf("30"));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
