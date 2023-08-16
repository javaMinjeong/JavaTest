package com.test.java.obj;

public class Ex40_Class {

	public static void main(String[] args) {
		
		//Person.java
		
		Person hong = new Person();
		
		hong.setName("홍길동");
		hong.setAge(20);
		hong.setGender("남자");
		
		Person father = new Person();
		
		father.setName("홍아빠");
		father.setAge(50);
		father.setGender("남자");
		
		//이 분들이 홍길동의 아빠고 엄마인지를 어떻게 증명할건가? > 관계를 만든다.
		Person mother = new Person();
		
		mother.setName("최엄마");
		mother.setAge(48);
		mother.setGender("여자");
		
		//관계 형성
		hong.setFather(father);
		hong.setMother(mother);
		
		//길동이네 가족 dump 확인
		System.out.println(hong.info());
		
		//java.lang.NullPointerException
		//- *******************랭킹 1위
		//아빠네 가족 dump 확인
		
		//System.out.println(father.info());
		// >> father한테 father을 넣어준 적이 없기때문에 null 
		
		
	}//main
}//class
