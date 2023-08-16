package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q034 {

	public static void main(String[] args) {

		/*
			요구사항]
			날짜를 입력받아 아래의 조건에 맞게 결과를 출력하시오.
			
			- 입력받은 날짜가 평일 > 해당 주 토요일 출력
			- 입력받은 날짜가 토/일 > X
				일(1) ~ 토(7)
			- 주의) 월은 0 ~ 11 > 입력 월 calendar 사용 시 -1 필요
			
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int year = 0;
		int month = 0;
		int date = 0;
		Calendar day = Calendar.getInstance();
		
		System.out.print("년: ");
		year = scan.nextInt();
		
		System.out.print("월: ");
		month = scan.nextInt();
		
		System.out.print("일: ");
		date = scan.nextInt();
		
		day.set(year, month - 1, date);

		if (day.get(Calendar.DAY_OF_WEEK) == 7 || day.get(Calendar.DAY_OF_WEEK) == 1) {
			System.out.println("입력하신 날짜는 '휴일(토/일)'입니다.");
			System.out.println("결과가 없습니다.");
			
		} else {
			day.add(Calendar.DATE, 7 - day.get(Calendar.DAY_OF_WEEK));
			System.out.println("입력하신 날짜는 '평일'입니다.");
			System.out.println("해당 주의 토요일로 이동합니다.");
			System.out.printf("이동한 날짜는 '%tF' 입니다.", day);
			
		}
		
		
		
	}

}
