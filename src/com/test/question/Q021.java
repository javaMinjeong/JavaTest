package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q021 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			태어난 년도를 입력하면 나이를 출력하시오.
			
			1. 입력 > scanner 생성
			2. 사용할 변수 선언 및 초기화
				> thisYear = 날짜 가져오는 calendar 메소드 사용
				> birthYear = 입력받은 태어난 년도
				> age = thisYear - birthYear + 1
			3. 출력 > printf
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		Calendar now = Calendar.getInstance();
		
		int thisYear = 0;
		int birthYear = 0;
		int age = 0;
		
		thisYear = now.get(Calendar.YEAR);
		
		System.out.print("태어난 년도: ");
		birthYear = scan.nextInt();
		
		age = thisYear - birthYear + 1;
		
		System.out.printf("나이: %d세", age);
		
	}
	
}
