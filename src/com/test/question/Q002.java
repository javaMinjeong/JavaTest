package com.test.question;

import java.util.Scanner;

public class Q002 {

	public static void main(String[] args) {

		/*
			요구사항] 
			- 숫자 2개를 입력받아 아래의 연산식을 출력하시오.
			
			조건]
			- 출력 숫자에 천단위 표기 하시오.
			- 결과값은 소수 이하 1자리까지 표기 하시오.
			
			입력]
			- 첫번째 숫자: 5
			- 두번째 숫자: 3
			
			출력]
			5 + 3 = 8
			5 - 3 = 2
			5 * 3 = 15
			5 / 3 = 1.7
			5 % 3 = 2
			------------------------
			1. 입력 > scanner 생성
			2. 사용할 변수 선언 및 초기화 > input1, input2 + result1~5
			3. 입력 받을 문구 출력 > print
			4. 입력받은 값으로 조건식 만들기 > input1 연산자 input2 = (input1 연산자 input2)의 
			5. 출력 > printf > %,.1f
			
		*/
		
		//scanner 생성 및 import
		Scanner scan = new Scanner(System.in);
		
		//사용할 변수 선언 및 초기화
		int input1 = 0;
		int input2 = 0;
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		double result4 = 0;
		int result5 = 0;
		
		//입력 받을 문구 출력
		System.out.print("첫번째 숫자: ");
		input1 = scan.nextInt();
		
		System.out.println("두번째 숫자: ");
		input2 = scan.nextInt();
		
		//조건식 만들기(연산)
		result1 = input1 + input2;
		result2 = input1 - input2;
		result3 = input1 * input2;
		result4 = input1 / input2; //int -> double 묵시적 데이터 변환
		result5 = input1 % input2;
		
		//출력
		System.out.printf("%d + %d = %,d\n", input1, input2, result1);
		System.out.printf("%d - %d = %,d\n", input1, input2, result2);
		System.out.printf("%d * %d = %,d\n", input1, input2, result3);
		System.out.printf("%d / %d = %,.1f\n", input1, input2, result4);
		System.out.printf("%d %% %d = %,d\n", input1, input2, result5);
		
		
		
		
	}

}
