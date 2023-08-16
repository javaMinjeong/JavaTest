package com.test.java;

public class Ex10_Input {

	public static void main(String[] args) throws Exception {

		
		/*
		
			콘솔 출력 > 모니터
			1. System.out.print()
			2. System.out.println()
			3. System.out.printf()
			
			콘솔 입력 > 키보드
			1. System.in.read() //불편함
			2. BufferedReader 클래스
			3. Scanner 클래스
			(1번을 쓰기 편하기 위해 만들어진게 2, 3번)
		
		
		*/
		
		//요구사항] 사용자에게 문자 1개를 입력받아 > 화면에 출력하시오.
		
		//1. 안내 메시지 출력
		//2. 키 입력
		//3. 키를 화면에 출력
		
		//1.
		System.out.println("문자 입력: ");
		
		//2.
		// - 입력 대기 상태 > 블럭 걸렸다.
		// - 사용자의 키입력을 기다리고 있는 중..
		// - 콘솔 > 키 입력 완료 > 엔터 입력
		
		//read() 메소드 1회 > 문자 1개 입력
		int code = System.in.read(); //문자 코드 **본 명령어는 자기 할일을 다하고 사용자 입력어를 남기고 사라짐.
		//int code에 문자를 저장한다는 것은 문자코드를 저장한다는 것!
		
		//3.
		System.out.println("출력: " + code);
		//a -> 97 -> 소문자 a의 문자코드 값이 97
		//A -> 65 -> 대문자 A의 문자코드 값이 65
		System.out.printf("출력: %c\n", code); //문자코드를 알아서 character로 변환하여 출력
		System.out.println("프로그램 종료");
		
		code = System.in.read();
		System.out.println("출력: " + code);
		System.out.printf("출력: %c\n", code);
		
		code = System.in.read();
		System.out.println("출력: " + code);
		System.out.printf("출력: %c\n", code);
		
		code = System.in.read(); //입력버퍼가 비어져있으면 입력 대기상태
		System.out.println("출력: " + code);
		System.out.printf("출력: %c\n", code);
		
		code = System.in.read();
		System.out.println("출력: " + code);
		System.out.printf("출력: %c\n", code);
		
	}

}
