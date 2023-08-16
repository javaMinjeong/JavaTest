package com.test.question;

import java.util.Scanner;

public class Q029 {

	public static void main(String[] args) {

		/*
			요구사항]
			숫자 2개와 연산자 1개를 입력받아 연산 과정과 결과를 출력하시오.
			
			- 정수만 입력(유효성 검사 불요)
			- 나머지 연산 결과 > 소수 이하 첫째자리까지 출력
			- 연산자 > 산술연산자(+, -, *, /, %)만 입력 > nested if
			---------------
			1. 입력 > scanner 생성 및 임포트
			2. 사용 변수 선언 > int num, String operator
			3. 입력 문구 출력
			4. if 조건문 작성(nested if)
			> 연산문 > 연산자 +, -, *, /, %
			(추가로 switch 조건문도 작성)
			5. 출력
			
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		String operator = "";
		
		System.out.print("첫번째 숫자: ");
		num1 = scan.nextInt();
		
		System.out.print("두번째 숫자: ");
		num2 = scan.nextInt();
		
		scan.skip("\r\n");
		
		System.out.print("연산자: ");
		operator = scan.nextLine();
		
		if (operator.equals("+")
				|| operator.equals("-")
				|| operator.equals("*")
				|| operator.equals("/")
				|| operator.equals("%")) {
			
			if (operator.equals("+")) {
				System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
			} else if (operator.equals("-")) {
				System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
			} else if (operator.equals("*")) {
				System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
			} else if (operator.equals("/")) {
				System.out.printf("%d / %d = %.1f\n", num1, num2, (double)num1 / num2);
			} else {
				System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
			}
			
		} else {
			System.out.println("연산이 불가능합니다.");
		}
		
		
	}

}
