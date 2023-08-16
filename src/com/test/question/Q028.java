package com.test.question;

import java.util.Scanner;

public class Q028 {

	public static void main(String[] args) {

		/*
			요구사항]
			근무 년수를 입력받아 아래와 같이 출력하시오.
			
			- 유효성 검사(1미만 입력 예외 처리) > "입력한 값이 올바르지 않습니다. 1이상의 값을 입력하시오."
			if (year >= 1) { }
				if (year < 5) 5 - year
					else if (year < 10) year - 4, 10 - year
						else { } year, year - 9
			else{ }
		------------------
			1. 입력 > scanner 생성
			2. 사용 변수 선언 > int year
			3. 입력 문구 출력
			4. 조건식 작성 > nested if 사용
			5. 각 조건별 printf 출력
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int year = 0;
		
		System.out.print("근무 년수: ");
		year = scan.nextInt();
		
		if (year >= 1) {
			
			if (year < 5) {
				System.out.printf("%d년차 초급 개발자입니다.\n", year);
				System.out.printf("앞으로 %d년 더 근무를 하면 중급 개발자가 됩니다.\n", 5 - year);
			} else if (year < 10) {
				System.out.printf("%d년차 중급 개발자입니다.\n", year);
				System.out.printf("당신은 %d년전까지 초급 개발자였습니다.\n", year - 4);
				System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.\n", 10 - year);
			} else {
				System.out.printf("%d년차 고급 개발자입니다.\n", year);
				System.out.printf("당신은 %d년전까지 중급 개발자였습니다.\n", year - 9);
			}
			
		} else {
			System.out.println("입력한 값이 올바르지 않습니다. 1이상의 값을 입력하시오.");
		}
		
	}

}
