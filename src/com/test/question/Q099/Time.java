package com.test.question.Q099;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	
	//TODO '0 이상 양의 정수' 는 어따가 조건 걸지..?
	public Time(int hour, int minute, int second) {
		this.second = second % 60;
		this.minute = (second / 60 + minute) % 60;
		this.hour = (second / 60 + minute) / 60 + hour;
	}
	
	public Time(int minute, int second) {
		this.second = second % 60;
		this.minute = (second / 60 + minute) % 60;
		this.hour = (second / 60 + minute) / 60;
	}
	
	public Time(int second) {
		this.second = second % 60;
		this.minute = (second / 60) % 60;
		this.hour = (second / 60) / 60;
	}
	
	public String info() {
		//TODO 시간에도 %02d 동일하게 붙는거 맞징..? 답지에는 없는데 그럼 시간도 2자리로 표출이 안되고 0한자리로 표출될 때가 있는디..!!
		return String.format("%02d:%02d:%02d\n", this.hour, this.minute, this.second);
	}
}
