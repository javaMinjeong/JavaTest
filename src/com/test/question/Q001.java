package com.test.question;

import java.util.Scanner;

public class Q001 {

	public static void main(String[] args) {

		/*
			요구사항]
			- 태어난 년도를 입력받아 나이를 출력하시오.
			
			조건]
			- 우리나라 나이로 출력하시오.
			
			입력]
			- 태어난 년도: 1998
			
			출력]
			- 나이: 26세
			
			---------------------------
		
			1. 입력 > scanner 생성
			2. 문구 생성 > 입력 요청
			3. 조건식 만들기 > 우리나라 나이 = 올해 년도 - 태어난 년도 + 1
			4. 출력하기 > printf
		
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		//선언 및 초기화
		int age = 0;
		int thisYear = 2023;
		int birthYear = 0;
		
		System.out.print("태어난 년도: ");
		
		birthYear = scan.nextInt();
		age = thisYear - birthYear + 1;
		
		System.out.printf("나이: %d세\n", age);
			
		
	}

}
