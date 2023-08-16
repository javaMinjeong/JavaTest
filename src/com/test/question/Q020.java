package com.test.question;

import java.util.Calendar;

public class Q020 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			오늘 태어난 아이의 백일과 첫돌을 출력하시오.
			
			1. Calendar now 변수 -> 오늘 불러오기
			2. add로 date field 100일 더하고 출력
			3. add로 year field 1년 더하고 출력
		
		*/
		
		Calendar now = Calendar.getInstance();
		now.add(Calendar.DATE, 100);
		System.out.printf("백일: %d-%02d-%d\n"
							, now.get(Calendar.YEAR)
							, now.get(Calendar.MONTH) + 1
							, now.get(Calendar.DATE));
		
		now = Calendar.getInstance();
		now.add(Calendar.YEAR, 1);
		System.out.printf("첫돌: %d-%02d-%d\n"
				, now.get(Calendar.YEAR)
				, now.get(Calendar.MONTH) + 1
				, now.get(Calendar.DATE));
		
		
	}
	
}
