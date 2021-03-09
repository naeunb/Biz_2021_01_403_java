package com.callor.student.model;

public class StudentVO {

	int stNum; //학번
	int grade; //학년
	int classNum; //반
	
	String stName; //학생명
	String major; //학과
	String addr; //주소
	String tel; //전화번호
	
	public StudentVO() {
		
	}
	
	public StudentVO(int stNum, int grade, int classNum, String stName, String major, String addr, String tel) {
		super();
		this.stNum = stNum;
		this.grade = grade;
		this.classNum = classNum;
		this.stName = stName;
		this.major = major;
		this.addr = addr;
		this.tel = tel;
	}
	
	
	public int getStNum() {
		return stNum;
	}
	public void setStNum(int stNum) {
		this.stNum = stNum;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	@Override
	public String toString() {
		return "StudentVO [stNum=" + stNum + ", grade=" + grade + ", classNum=" + classNum + ", stName=" + stName
				+ ", major=" + major + ", addr=" + addr + ", tel=" + tel + "]";
	}
	
}
