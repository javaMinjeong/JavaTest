package com.test.question;

public class Q008 {

	public static void main(String[] args) {
		
		/*
			
			요구사항]
			- 인삿말을 출력하는 메소드 3개를 선언하시오.
			
			조건]
			- void hello()
			- void introduce()
			- void bye()
			
			호출]
			- hello();
			- introduce();
			- bye();
			
			출력]
			안녕하세요.
			저는 홍길동입니다.
			안녕히가세요.
			-------------------
			1. void 메소드 선언
			2. 각 메소드 안에 인삿말 출력 > println
			3. 메소드 호출
		
		*/
		
		//메소드 호출
		hello();
		introduce();
		bye();
				
	}//main
	
	//인삿말 출력하는 메소드 생성 1_hello
	public static void hello(){
		
		System.out.println("안녕하세요.");
		
	}
	//인삿말 출력하는 메소드 생성 2_introduce
	public static void introduce() {
		
		System.out.println("저는 홍길동입니다.");
		
	}
	//인삿말 출력하는 메소드 생성 3_bye
	public static void bye() {
		
		System.out.println("안녕히가세요.");
		
	}
	
}//class

//Code Review Summary: 전원 동일한 방식으로 인삿말 출력하는 메소드 선언 및 호출

