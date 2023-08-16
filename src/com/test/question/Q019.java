package com.test.question;

import java.util.Calendar;

public class Q019 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			현재 시간을 출력하는 메소드 선언
			
			1. 메소드 선언
				> nowTime()
				> 반환값 X
				> 메소드 내 출력 > printf
			2. 사용할 변수 선언 및 초기화
				> 현재 시간 불러올 calendar 타입 now 변수
			3. 메소드 호출
		
		*/
		
		nowTime();
		
	}
	
	public static void nowTime() {
		
		Calendar now = Calendar.getInstance();
		System.out.printf("현재 시간: %d시 %d분 %d초\n"
							, now.get(Calendar.HOUR_OF_DAY)
							, now.get(Calendar.MINUTE)
							, now.get(Calendar.SECOND));
		System.out.printf("현재 시간: %s %d시 %d분 %d초\n"
				, now.get(Calendar.AM_PM) == 0 ? "오전" : "오후"
				, now.get(Calendar.HOUR_OF_DAY)
				, now.get(Calendar.MINUTE)
				, now.get(Calendar.SECOND));
		
	}
	
	
	
	
}
