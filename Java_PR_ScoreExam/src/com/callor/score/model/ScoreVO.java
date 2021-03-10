package com.callor.score.model;

public class ScoreVO {

	private String stNum;
	private int scoreKor;
	private int scoreEng;
	private int scoreMath;
	private int scoreMusic;
	private int total;
	private float avg;
	private int totalKor;
	private int totalEng;
	private int totalMath;
	private int totalMusic;
	private float totalAvg;
	
	public ScoreVO() {
	}


	public ScoreVO(String stNum, int scoreKor, int scoreEng, int scoreMath, int scoreMusic) {
		super();
		this.stNum = stNum;
		this.scoreKor = scoreKor;
		this.scoreEng = scoreEng;
		this.scoreMath = scoreMath;
		this.scoreMusic = scoreMusic;
	}


	public String getStNum() {
		return stNum;
	}

	public void setStNum(String stNum) {
		this.stNum = stNum;
	}

	public int getScoreKor() {
		return scoreKor;
	}

	public void setScoreKor(int scoreKor) {
		this.scoreKor = scoreKor;
	}

	public int getScoreEng() {
		return scoreEng;
	}

	public void setScoreEng(int scoreEng) {
		this.scoreEng = scoreEng;
	}

	public int getScoreMath() {
		return scoreMath;
	}

	public void setScoreMath(int scoreMath) {
		this.scoreMath = scoreMath;
	}

	public int getScoreMusic() {
		return scoreMusic;
	}

	public void setScoreMusic(int scoreMusic) {
		this.scoreMusic = scoreMusic;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	public int getTotalKor() {
		return totalKor;
	}

	public void setTotalKor(int totalKor) {
		this.totalKor = totalKor;
	}

	public int getTotalEng() {
		return totalEng;
	}

	public void setTotalEng(int totalEng) {
		this.totalEng = totalEng;
	}

	public int getTotalMath() {
		return totalMath;
	}

	public void setTotalMath(int totalMath) {
		this.totalMath = totalMath;
	}

	public int getTotalMusic() {
		return totalMusic;
	}

	public void setTotalMusic(int totalMusic) {
		this.totalMusic = totalMusic;
	}

	public float getTotalAvg() {
		return totalAvg;
	}

	public void setTotalAvg(float totalAvg) {
		this.totalAvg = totalAvg;
	}

	@Override
	public String toString() {
		return "ScoreVO [stNum=" + stNum + ", scoreKor=" + scoreKor + ", scoreEng=" + scoreEng + ", scoreMath="
				+ scoreMath + ", scoreMusic=" + scoreMusic + ", total=" + total + ", avg=" + avg + ", totalKor="
				+ totalKor + ", totalEng=" + totalEng + ", totalMath=" + totalMath + ", totalMusic=" + totalMusic
				+ ", totalAvg=" + totalAvg + "]";
	}
	
	
}
