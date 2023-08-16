package com.test.java.obj.inheritance;

import java.util.Date;

public class Ex48_Overriding {

	public static void main(String[] args) {
		
		//대중적인 오버라이드
		
		//객체를 만들어보장
		Time t1 = new Time(2,30);
		
		//시간 잘들어갔는지 info method로 확인
		System.out.println(t1.info());
		//info() 메서드는 나밖에 모르는 이름.
		//But toString() 메서드는 전 세계 개발자가 아는 이름.
		//여태까지 info를 썼던 이유는 toString 오버라이드를 대체하기 위한 용도였음.
		//앞으로는 toString을 오버라이딩 하여 덤프 메소드로 활용할거임!!
		
		
		
		
		//com.test.java.obj.inheritance.Time@5aaa6d82
		//String java.lang.Object.toString()
		//할아버지(Object)가 구현한 내용을 그대로 쓰는것
		System.out.println(t1); //하단의 toString가 돌려준 값.
		System.out.println(t1.toString()); //com.test.java.obj.inheritance.Time@5aaa6d82
		
		Date now = new Date();
		
		//Wed Aug 02 11:48:48 KST 2023
		//String java.util.Date.toString()
		//할아버지(Object)가 물려준것을 나(Date)가 재정의한 것
		System.out.println(now);
		System.out.println(now.toString());
		
		
		
		
		
	}//main
}//class

class Time {
	private int hour;
	private int minute;
	
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	//덤프
	public String info() {
		
		return this.hour + ":" + this.minute;
	}
	
	@Override //어노테이션(Annotation) > 일종의 주석인데, 프로그램 기능이 있는 주석.
	//일부러 적을 필요는 없고, 코드 자동완성으로 생성해줄 때 생성되면 내비둬도 됨.
	public String toString() {
		return this.hour + ":" + this.minute;
	}
}