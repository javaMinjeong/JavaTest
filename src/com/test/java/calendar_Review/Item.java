package com.test.java.calendar_Review;

public class Item {

	//item.txt의 구성 > 일련번호, 날짜(YYYY-MM-DD), 일정
	
	//해당 구성과 동일하게 변수를 만든다.
	private String seq;
	private String date;
	private String title;
	
	//변수 생성 후, 생성자, getter/setter, toString을 만든다.
	public Item(String seq, String date, String title) {
		super();
		this.seq = seq;
		this.date = date;
		this.title = title;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Item [seq=" + seq + ", date=" + date + ", title=" + title + "]";
	}
	
	
	
	
}
