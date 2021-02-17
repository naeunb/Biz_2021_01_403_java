package com.callor.applications.service;

import java.util.Scanner;

/*
 * java의 class와 method() 호출
 * ScoreService 클래스에는 main() method가 없어서 여기에 있는 코드는 Run하여 실행할수없음
 * 누군가가 ScoreService를 객체, 인스턴스로 만들고 score() method를 호출해주어야만 코드르르 실행할 수 있다
 * 
 * 다른언어에서는 module등의 이름으로 사용.
 */
public class ScoreService {

		/*
		 * 클래스와 메서드 명명법
		 * 클래스 : 첫글자 영문대문자, 이후 영문대소문자,숫자
		 * 메서드 : 첫글자 영문소문자, 이후 영문대소문자,숫자
		 * 
		 *  클래스 명명법 Upper CamelCase라고 함.
		 *  메서드 명명법 Lower CamelCase라고 함
		 */
		public void score() {
			Scanner scan = new Scanner(System.in);
			
			
			int numKor = 0;
			while(true) {
				System.out.print("국어점수 입력 >> ");
				numKor = scan.nextInt();
				if(numKor >= 0 && numKor <= 100 == true) {
					break;
				} else {
					System.out.println("다시입력하세요");
				}
			}
			
			int numEng = 0;
			while(true) {
				System.out.print("영어점수 입력 >> ");
				numEng = scan.nextInt();
				if(numEng >= 0 && numEng <= 100 == true) {
					break;
				} else {
					System.out.println("다시입력하세요");
				}
			}
			
			int numMath = 0;
			while(true) {
				System.out.print("수학점수 입력 >> ");
				numMath = scan.nextInt();
				if(numMath >= 0 && numMath <= 100 == true) {
					break;
				} else {
					System.out.println("다시입력하세요");
				}
			}

			int sum = numKor+numEng+numMath;
			float fAvg = sum/3f;
			System.out.println("====================================");
			System.out.println("국어\t영어\t수학\t총점\t평균");
			System.out.println("------------------------------------");
			System.out.print(numKor+"\t");
			System.out.print(numEng+"\t");
			System.out.print(numMath+"\t");
			System.out.print(sum + "\t");
			System.out.println(fAvg);
			System.out.println("====================================");
			
		}// score end
}// class end




// 틀린 수를 입력하면 "다시입력하세요" 문구와 함께 다시 입력할수있게 하고싶음
// 문제1 .1번째 while에 break를 사용하면 다시입력할수없음..
/*
			while(true) {
				System.out.print("국어점수 입력 >> ");
				int numKor = scan.nextInt();
				if(numKor >= 0 && numKor <= 100 == true) {

					while(true) {
						System.out.print("영어점수 입력 >> ");
						int numEng = scan.nextInt();
						if(numEng >= 0 && numEng <= 100 == true) {
							while(true) {
								System.out.print("수학점수 입력 >> ");
								int numMath = scan.nextInt();
								if(numMath >= 0 && numMath <= 100 == true) {
									System.out.println("====================================");
									System.out.println("국어\t영어\t수학\t총점\t평균");
									System.out.println("------------------------------------");
									System.out.print(numKor+"\t");
									System.out.print(numEng+"\t");
									System.out.print(numMath+"\t");
									int sum = numKor+numEng+numMath;
									float fAvg = sum/3f;
									System.out.print(sum + "\t");
									System.out.println(fAvg);
									System.out.println("====================================");
									break;
								} else {
									System.out.println("다시입력하세요");
								}
								
							}// 3번째 while end
							break;
						} else {	//비교문 end
							System.out.println("다시입력하세요");
						}
						//break;
					}//  2번째 while end
				} else { // 1 번째 if end
					System.out.println("다시입력하세요");
				}
				//break;
				
			}// 첫번째 while end

*/