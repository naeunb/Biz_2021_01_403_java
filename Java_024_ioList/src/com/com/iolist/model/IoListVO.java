package com.com.iolist.model;

public class IoListVO {

	public IoListVO() {
	}
	
	
	private String date;	 //거래일자
	private String nbsp1;	 //공백
	private String nbsp2;	 //공백
	private String nbsp3;	 //공백
	private String prdName;  //상품명
	private String customer; //거래처명
	private String ceo;		 //대표자명
	private int sort;		 //구분
	private int prdPrice;	 //매입단가
	private int selPrice;	 //판매단가
	private int qty;		 //수량
	private int totalPrdPrice;//매입금액
	private int totalSelPrice;//판매금액
	
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNbsp1() {
		return nbsp1;
	}
	public void setNbsp1(String nbsp1) {
		this.nbsp1 = nbsp1;
	}
	public String getNbsp2() {
		return nbsp2;
	}
	public void setNbsp2(String nbsp2) {
		this.nbsp2 = nbsp2;
	}
	public String getNbsp3() {
		return nbsp3;
	}
	public void setNbsp3(String nbsp3) {
		this.nbsp3 = nbsp3;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public int getPrdPrice() {
		return prdPrice;
	}
	public void setPrdPrice(int prdPrice) {
		this.prdPrice = prdPrice;
	}
	public int getSelPrice() {
		return selPrice;
	}
	public void setSelPrice(int selPrice) {
		this.selPrice = selPrice;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getTotalPrdPrice() {
		return totalPrdPrice;
	}
	public void setTotalPrdPrice(int totalPrdPrice) {
		this.totalPrdPrice = totalPrdPrice;
	}
	public int getTotalSelPrice() {
		return totalSelPrice;
	}
	public void setTotalSelPrice(int totalSelPrice) {
		this.totalSelPrice = totalSelPrice;
	}
	
	
	
	public IoListVO(String date, String nbsp1, String nbsp2, String nbsp3, String prdName, String customer, String ceo,
			int sort, int prdPrice, int selPrice, int qty) {
		super();
		this.date = date;
		this.nbsp1 = nbsp1;
		this.nbsp2 = nbsp2;
		this.nbsp3 = nbsp3;
		this.prdName = prdName;
		this.customer = customer;
		this.ceo = ceo;
		this.sort = sort;
		this.prdPrice = prdPrice;
		this.selPrice = selPrice;
		this.qty = qty;
	}
	
	
	@Override
	public String toString() {
		return "IoListVO [date=" + date + ", nbsp1=" + nbsp1 + ", nbsp2=" + nbsp2 + ", nbsp3=" + nbsp3 + ", prdName="
				+ prdName + ", customer=" + customer + ", ceo=" + ceo + ", sort=" + sort + ", prdPrice=" + prdPrice
				+ ", selPrice=" + selPrice + ", qty=" + qty + ", totalPrdPrice=" + totalPrdPrice + ", totalSelPrice="
				+ totalSelPrice + "]";
	}
	

	
	
	
}
