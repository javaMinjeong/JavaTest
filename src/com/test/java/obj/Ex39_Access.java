package com.test.java.obj;

import java.util.Calendar;

public class Ex39_Access {

	public static void main(String[] args) {
		
		/*
			접근 지정자(제어자), Access Modifier
			- 클래스 멤버에 붙여서 사용한다. > 멤버 변수, 멤버 메소드 > 오늘
			- 클래스 자체에 붙여서 사용한다.
			- 지역 변수에는 사용이 불가능하다.
			- 클래스(객체)의 영역을 기준으로, 외부에 해당 멤버를 어떻게 노출할지 통제하는 역할
		
		
			1. public
			2. private
			-------------
			3. protected > 상속
			4. default > 패키지
			
			
			public
			- 
			
			private
			- 
			
			
			
			
			
		
		*/
		
		Box box = new Box();
		
		box.color = "갈색"; //public
	
		//box.size = 100; //private > The field Box.size is not visible
		
		box.aaa();
		//box.bbb();
		
		
		//Book 객체
		Book book = new Book();
//		book.title = "자바의 정석";
//		book.author = "홍길동";
//		book.publisher = "도우출판";
//		book.page = 1000;
//		book.price = 30000;
		
		//자료형만 보고 값을 넣으면 안되고, 동일 자료형이더라도 적합한 값과 적합하지 않은 값이 있기 때문에 통제가 필요
		
//		int temp = 30000; //책 가격
//		
//		if (temp >= 0 && temp <= 100000) { //유효성 검사
//		} else {
//
//		}
//		System.out.println(book.price);
		
		
		
		book.aaa("자바의 정석");
		book.bbb(30000); //쓰기 > Setter
		
		System.out.println("책가격: " + book.ccc()); // 읽기 > Getter
		
		
		book.setTitle("자바의 정석");
		
		System.out.println(book.getTitle());
		
		//--------------------
		
		Mouse m1 = new Mouse();
		
		m1.setModel("M910");
		System.out.println(m1.getModel());
		
		//쓰기 전용
		m1.setPrice(50000);
		//System.out.println(m1.getPrice);
		
		//읽기 전용
		System.out.println(m1.getColor());
		
		//Getter/Setter 역할
		//1. private 멤버 > 인터페이스 역할
		//2. 읽기 전용 멤버, 쓰기 전용 멤버
		
//		Calendar date = Calendar.getInstance();
//		date.add(Calendar.YEAR, -3);
//		
//		m1.setDate(date);
//		
//		System.out.printf("마우스 제조년월일: %tF\n", m1.getDate());
		
//		//m1.getState > private String state;
//		System.out.println(m1.getState());
		
		m1.setDate(2020, 7, 31);
		System.out.println(m1.getDate());
		
		
		//m1의 현재 모든 상태 확인?
//		System.out.println(m1.getModel());
//		System.out.println(m1.getPrice());
//		System.out.println(m1.getColor());
//		>>>>>>가격 확인 불가
		
		//개발자가 객체의 상태를 확인하고 싶을 때 사용하는 메소드 > dump
		System.out.println(m1.info());
		
		
		
		
		
	}//main
}//class
