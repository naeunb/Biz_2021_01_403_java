package com.callor.student.model;

/*
 * 학번,이름,학과,학년,반,주소,전화번호
 */
public class StudentVO {

	private String stNum; //학번
	private String stName; //학생명
	private String stDept; //학과
	private String stGrade; //학년
	private String stClass; //반
	private String stAddr; //주소
	private String stTel; //전화번호
	
	public StudentVO() {
		
	}
	


	public StudentVO(String stNum, String stName, String stDept, String stGrade, String stClass, String stAddr,
			String stTel) {
		super();
		this.stNum = stNum;
		this.stName = stName;
		this.stDept = stDept;
		this.stGrade = stGrade;
		this.stClass = stClass;
		this.stAddr = stAddr;
		this.stTel = stTel;
	}



	public String getStNum() {
		return stNum;
	}

	public void setStNum(String stNum) {
		this.stNum = stNum;
	}

	public String getStGrade() {
		return stGrade;
	}

	public void setStGrade(String stGrade) {
		this.stGrade = stGrade;
	}

	public String getStClass() {
		return stClass;
	}

	public void setStClass(String stClass) {
		this.stClass = stClass;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getStDept() {
		return stDept;
	}

	public void setStDept(String stDept) {
		this.stDept = stDept;
	}

	public String getStAddr() {
		return stAddr;
	}

	public void setStAddr(String stAddr) {
		this.stAddr = stAddr;
	}

	public String getStTel() {
		return stTel;
	}

	public void setStTel(String stTel) {
		this.stTel = stTel;
	}

	@Override
	public String toString() {
		return "StudentVO [stNum=" + stNum + ", stGrade=" + stGrade + ", stClass=" + stClass + ", stName=" + stName
				+ ", stDept=" + stDept + ", stAddr=" + stAddr + ", stTel=" + stTel + "]";
	}
	
	
}
