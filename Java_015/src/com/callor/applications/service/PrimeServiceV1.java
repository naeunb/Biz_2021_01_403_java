package com.callor.applications.service;

public class PrimeServiceV1 {

	public void prime(int keyNum) {
		
		int pos = 0;
		for(pos=2; pos<keyNum; pos++) {
			if(keyNum%pos==0) {
				break;
			}
		}

		System.out.println(pos);
		if(pos<keyNum) {
			System.out.println(keyNum+" : 소수가 아님");
		} else {
			System.out.println(keyNum+" : 소수임");
		}
	}
}
