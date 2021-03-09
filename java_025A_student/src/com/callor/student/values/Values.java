package com.callor.student.values;

public class Values {

	public static String dLine(int nCount) {
		return String.format("%0"+nCount+"d", 0).replace("0", "=");
	}
	
	public static String sLine(int nCount) {
		return String.format("%0"+nCount+"d", 0).replace("0", "-");
	}
	
	public static final int ST_NUM = 0;
	public static final int ST_NAME = 1;
	public static final int ST_MAJOR = 2;
	public static final int ST_GRADE = 3;
	public static final int ST_CLASS = 4;
	public static final int ST_ADDR = 5;
	public static final int ST_TEL = 6;
	
}
