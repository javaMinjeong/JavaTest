package com.test.question;

import java.util.Scanner;

public class Q032 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			주차 요금을 계산하시오.
			
			- 무료 주차: 30분
			- 초과 10분당: 2,000원
			-------------
			1. 입력 스캐너
			2. 사용 변수 선언
			> int inHour, int inMin, int outHour, int outMin,
				int fee, int stayTime
			3. 입력 문구 출력
			4. 조건식 작성
				> 나간시간(시 * 60 + 분) - 들어온시간(시 * 60 + 분)
					= (체류시간(분)) - 30
					= 요금부과시간 / 10 = 값 * 2000
			5. 출력 
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int inHour = 0;
		int inMin = 0;
		int outHour = 0;
		int outMin = 0;
		int fee = 0;
		int stayTime = 0;
		
		System.out.println("[들어온 시간]");
		System.out.print("시: ");
		inHour = scan.nextInt();
		
		System.out.print("분: ");
		inMin = scan.nextInt();
		
		System.out.println("[나간 시간]");
		System.out.print("시: ");
		outHour = scan.nextInt();
		
		System.out.print("분: ");
		outMin = scan.nextInt();
		
		//체류시간(분) 계산
		stayTime = (outHour * 60 + outMin) - (inHour * 60 + inMin);
		
		fee = (stayTime - 30) / 10 * 2000;

//		> 나간시간(시 * 60 + 분) - 들어온시간(시 * 60 + 분)
//		= (체류시간(분)) - 30
//		= 요금부과시간 / 10 = 값 * 2000	
				
		if (stayTime <= 30) {
			System.out.println("주차 요금은 0원입니다.");
		} else {
			System.out.printf("주차 요금은 %,d원입니다.\n", fee);
		}
		
		
	}
	
}
