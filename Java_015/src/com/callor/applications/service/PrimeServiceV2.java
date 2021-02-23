package com.callor.applications.service;

public class PrimeServiceV2 {

	public int prime(int keyNum) {
		
		int pos = 0;
		for(pos=2; pos<keyNum; pos++) {
			if(keyNum%pos==0) { //true면 소수가 아님
				//prime() method실행을 중단하고 main() method에게 -1을 되돌려줘라
				return -1;
			}
		}
		//keyNum값이 소수이어서 for문이 모두 수행하고 여기에 다다르면 keyNum값을 그대로 return하라
		return keyNum;
	}
}