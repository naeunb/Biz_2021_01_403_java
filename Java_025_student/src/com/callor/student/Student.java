package com.callor.student;

import com.callor.student.service.impl.StServiceV1;

public class Student {
	public static void main(String[] args) {
		
		StServiceV1 ssV1 = new StServiceV1();
		
		ssV1.loadFile();
		ssV1.print();
		
	}
}
